package service;

import factories.TurmaFactory;
import model.Aluno;
import model.Materia;
import model.Professor;
import model.Turma;
import model.enuns.Turno;
import repositories.interfaces.MateriaRepository;
import repositories.interfaces.ProfessorRepository;
import repositories.interfaces.TurmaRepository;

import java.util.List;
import java.util.Scanner;

public class TurmaService {

    Scanner in;
    Long proximoId;
    TurmaRepository turmaRepository;
    ProfessorRepository professorRepository;
    MateriaRepository materiaRepository;

    public TurmaService(Scanner in, TurmaRepository turmaRepository, ProfessorRepository professorRepository, MateriaRepository materiaRepository) {
        this.in = in;
        proximoId = 1L;
        this.turmaRepository = turmaRepository;
        this.professorRepository = professorRepository;
        this.materiaRepository = materiaRepository;
    }

    public void cadastrarTurma(){

        Turno turnoEscolhido = escolherTurno();

        if (turnoEscolhido==null) {
            System.out.println("Turno inválido");
            return;
        }

        Materia materia = escolherMateria();

        if (materia==null) {
            System.out.println("Matéria inválida");
            return;
        }

        Professor professor = escolherProfessor(turnoEscolhido, materia);

        if (professor==null) {
            System.out.println("Professor inválido");
            return;
        }

        turmaRepository.add(TurmaFactory.criar(proximoId, turnoEscolhido, materia, professor));
    }

    private Turno escolherTurno() {

        Turno turnoEscolhido = null;

        do {
            System.out.println("Qual o turno da turma: ");

            //Apresenta todos os turnos disponíveis
            for (int i = 0; i<Turno.values().length; i ++) {
                System.out.printf("%d) %s%n", i+1, Turno.values()[i]);
            }

            var opcaoEscolhida = in.nextLine();

            try {
                turnoEscolhido = Turno.values()[Integer.parseInt(opcaoEscolhida)-1];
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println("Opção inválida");
            }
        } while (turnoEscolhido == null);

        return turnoEscolhido;
    }


    private Professor escolherProfessor(Turno turno, Materia materia) {

        //Busca no repository os professores com base em seu turno disponivel
        List<Professor> professoresDisponiveis = professorRepository.findByTurno(turno);

        //Filtra para aparecer somente professores capacitados a lecionar a materia especifica
        professoresDisponiveis = professoresDisponiveis.stream().filter(p -> p.getMaterias().contains(materia)).toList();

        Professor professorEscolhido = null;

        //Busca os professores disponiveis
        do {
            System.out.println("Escolha o professor da turma: ");

            //Apresenta todos os professores que passaram nas filtragens de turno e materia
            for (int i = 0; i<professoresDisponiveis.size(); i++) {
                System.out.printf("%d - %s%n", i+1, professoresDisponiveis.get(i));
            }
            
            var opcaoEscolhida = in.nextLine();

            try {
                professorEscolhido = professoresDisponiveis.get(Integer.parseInt(opcaoEscolhida)-1);
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println("Opção inválida");
            }
        } while (professorEscolhido==null);

        return professorEscolhido;
    }

    private Materia escolherMateria() {

        List<Materia> materias = materiaRepository.findAll();
        Materia materiaEscolhida = null;
        do {
            System.out.println("Escolha a materia da turma: ");
            for (int i = 0; i<materias.size(); i++) {
                System.out.printf("%d - %s%n", i+1, materias.get(i));
            }
            var opcaoEscolhida = in.nextLine();
            try {
                materiaEscolhida = materias.get(Integer.parseInt(opcaoEscolhida)-1);
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println("Opção inválida");
            }
        } while (materiaEscolhida == null);
        return materiaEscolhida;
    }

    public void registrarAluno(Aluno aluno) {


        Turma turmaEscolhida = null;
        do {
            System.out.println("Registrar aluno em qual turma: ");
            listarTurma();

            var opcaoEscolhida = in.nextLine();
            try {
                turmaEscolhida = turmaRepository.findTurmaById(Long.parseLong(in.nextLine()));
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println("Opção inválida");
            }
        } while (turmaEscolhida == null);

        turmaEscolhida.getAlunos().add(aluno);
    }

    public void listarTurma() {
        List<Turma> turmas = turmaRepository.findTurmas();

        for (int i = 0; i<turmas.size(); i++) {
            System.out.printf("%d - Turno: %s Matéria: %s Professor: %s", i+1, turmas.get(i).getTurno(), turmas.get(i).getMateria().getNome(), turmas.get(i).getProfessor().getNome());
            listarAlunosDaTurma(i, turmas);
        }

    }

    private static void listarAlunosDaTurma(int i, List<Turma> turmas) {
        System.out.println("Alunos:");
        for (int j = 0; i < turmas.get(i).getAlunos().size(); i++) {
            System.out.printf("d% - Nome: %s Matricula: %d%n", i +1, turmas.get(i).getAlunos().get(j).getNome(), turmas.get(i).getAlunos().get(j).getId());
        }
    }
}
