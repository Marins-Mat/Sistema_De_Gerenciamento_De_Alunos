package service;

import factories.TurmaFactory;
import model.Aluno;
import model.Materia;
import model.Professor;
import model.Turma;
import model.enuns.Turno;

import java.util.List;
import java.util.Scanner;

public class TurmaService {

    Scanner in;
    Long proximoId;

    public TurmaService(Scanner in) {
        this.in = in;
        proximoId = 1L;
    }

    public void cadastrarTurma(){
        System.out.println("Qual o turno da turma: ");

        //Apresenta todos os turnos disponíveis
        for (int i = 0; i<Turno.values().length; i ++) {
            System.out.printf("%d) %s%n", i+1, Turno.values()[i]);
        }

        var opcaoEscolhida = in.nextLine();
        Turno turnoEscolhido;
        try {
            turnoEscolhido = Turno.values()[Integer.parseInt(opcaoEscolhida)-1];
        } catch (NumberFormatException e) {
            turnoEscolhido = null;
            System.out.println("Opção inválida");
        }

        if (turnoEscolhido==null) {
            System.out.println("Turno inválido");
            return;
        }

        //TODO Alterar para receber materias de uma repository ou transforma-lá em um enum para escolher a materia
        Materia materia = null;

        if (materia==null) {
            System.out.println("Matéria inválida");
            return;
        }

        //TODO Alterar para receber as opcoes de professores disponiveis para lecionar no turno da repository
        Professor professor = null;

        if (professor==null) {
            System.out.println("Professor inválido");
            return;
        }

        //TODO Alterar para registrar os alunos inscritos na Turma ou apresentar os disponiveis
        List<Aluno> alunos = null;

        if (alunos==null||alunos.isEmpty()) {
            System.out.println("Lista de alunos inválida");
            return;
        }

        Turma novaTurma = TurmaFactory.criar(proximoId, turnoEscolhido, materia, professor, alunos);
    }
    public void listarTurma() {
        System.out.println("Funcionalidade ainda não implementada");
    }
}
