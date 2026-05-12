package service;

import factories.ProfessorFactory;
import model.Materia;
import model.enuns.Turno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProfessorService {

    Long proximoId;
    Scanner in;

    public ProfessorService(Scanner in) {
        this.in = in;
        proximoId=1L;
    }

    public void cadastrarProfessor(){

        System.out.println("Qual o CPF do professor: ");
        var cpf = in.nextLine();

        if (cpf.isBlank()|| cpf==null){
            System.out.println("CPF inválido");
            return;
        }

        System.out.println("Qual o nome do professor: ");
        var nome = in.nextLine();

        if (nome.isBlank()|| nome==null) {
            System.out.println("Nome Inválido");
            return;
        }

        System.out.println("Qual o e-mail do professor: ");
        var email = in.nextLine();

        if (email.isBlank()|| email==null) {
            System.out.println("E-mail Inválido");
            return;
        }

        System.out.println("Qual o número de telefone do professor: ");
        var telefone = in.nextLine();

        System.out.println("Quais turnos em que o professor pode lecionar: ");

        List<Turno> turnos = new ArrayList<>();

        String opcaoEscolhida;
        int turnoEscolhido;
        boolean sair = false;

        do {
            //Apresenta todos os turnos disponíveis
            for (int i = 0; i< Turno.values().length; i ++) {
                System.out.printf("%d) %s%n", i+1, Turno.values()[i]);
            }
            System.out.printf("%d) Finalizar", Turno.values().length);

            //Recebe a opcao escolhida pelo usuario
            opcaoEscolhida = in.nextLine();


            //Tenta adicionar na lista de turnos escolhidos
            try {
                if (Integer.parseInt(opcaoEscolhida) == Turno.values().length){
                    sair = true;
                    continue;
                }
                turnos.add(Turno.values()[Integer.parseInt(opcaoEscolhida)-1]);
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida");
            }

        } while (!sair);

        //TODO Alterar para receber materias de uma repository ou transforma-lá em um enum para escolher a materia
        List<Materia> materias = new ArrayList<>();

        ProfessorFactory.criar(proximoId, cpf, nome, email, telefone, turnos, materias);


    }
}
