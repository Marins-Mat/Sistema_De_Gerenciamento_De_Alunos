package service;

import factories.ProfessorFactory;
import model.Materia;
import model.Professor;
import model.enuns.Turno;
import repositories.interfaces.MateriaRepository;
import repositories.interfaces.ProfessorRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProfessorService {

    Long proximoId;
    Scanner in;
    MateriaRepository materiaRepository;
    ProfessorRepository professorRepository;



    public ProfessorService(Scanner in, MateriaRepository materiaRepository, ProfessorRepository professorRepository) {
        this.proximoId = 1L;
        this.in = in;
        this.materiaRepository = materiaRepository;
        this.professorRepository = professorRepository;
    }

    public void cadastrarProfessor(){

        Professor novoProfessor;
        do {
            System.out.println("Qual o CPF do professor: ");
            var cpf = in.nextLine();

            if (cpf.isBlank()){
                System.out.println("CPF inválido");
                return;
            }

            System.out.println("Qual o nome do professor: ");
            var nome = in.nextLine();

            if (nome.isBlank()) {
                System.out.println("Nome Inválido");
                return;
            }

            System.out.println("Qual o e-mail do professor: ");
            var email = in.nextLine();

            if (email.isBlank()) {
                System.out.println("E-mail Inválido");
                return;
            }

            System.out.println("Qual o número de telefone do professor: ");
            var telefone = in.nextLine();

            System.out.println("Quais turnos em que o professor pode lecionar: ");

            List<Turno> turnos = new ArrayList<>();

            String opcaoEscolhida;
            boolean sair = false;
            do {
                //Apresenta todos os turnos disponíveis
                for (int i = 0; i< Turno.values().length; i ++) {
                    System.out.printf("%d) %s%n", i+1, Turno.values()[i]);
                }
                System.out.printf("%d) Finalizar %n", Turno.values().length+1);

                //Recebe a opcao escolhida pelo usuario
                opcaoEscolhida = in.nextLine();


                //Tenta adicionar na lista de turnos escolhidos
                try {
                    if (Integer.parseInt(opcaoEscolhida)-1==Turno.values().length){
                        sair = true;
                        continue;
                    }

                    turnos.add(Turno.values()[Integer.parseInt(opcaoEscolhida)-1]);
                } catch (NumberFormatException | IndexOutOfBoundsException e) {
                    System.out.println("Opção inválida");
                }

            } while (!sair);

            List<Materia> materias = escolherMaterias();

            novoProfessor = ProfessorFactory.criar(proximoId, cpf, nome, email, telefone, turnos, materias);

        } while (novoProfessor == null);

    }

    private List<Materia> escolherMaterias() {
        List<Materia> materias = materiaRepository.findAll();
        List<Materia> materiasEscolhidas = new ArrayList<>();
        String opcaoEscolhida;

        boolean sair = false;
        do {

            System.out.println("Escolha as matérias que o professor está capacitado a lecionar: ");
            for (int i = 0; i<materias.size(); i++) {
                System.out.printf("%d) %s%n", i+1, materias.get(i).getNome());
            }
            System.out.printf("%d) Sair %n", materias.size()+1);
            opcaoEscolhida = in.nextLine();
            try {
                if (Integer.parseInt(opcaoEscolhida)-1==materias.size())
                    sair = true;
                materiasEscolhidas.add(materias.get(Integer.parseInt(opcaoEscolhida)-1));
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println("Opção inválida");
            }

        } while (!sair);
        return materiasEscolhidas;
    }
}
