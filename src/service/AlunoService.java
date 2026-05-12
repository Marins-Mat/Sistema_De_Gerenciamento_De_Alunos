package service;

import factories.AlunoFactory;
import model.Aluno;
import repositories.interfaces.AlunoRepository;

import java.util.Scanner;

public class AlunoService {

    Scanner in;
    Long proximoId;
    public AlunoService(Scanner in, AlunoRepository alunoRepository) {
        this.in = in;
        proximoId = 1L;
    }

    public void cadastrarAluno(){
        System.out.println("Qual o CPF do aluno: ");
        var cpf = in.nextLine();
        System.out.println("Qual o nome do aluno: ");
        var nome = in.nextLine();
        System.out.println("Qual o e-mail do aluno: ");
        var email = in.nextLine();
        System.out.println("Qual o número de telefone do aluno: ");
        var telefone = in.nextLine();

        if (cpf.isBlank()|| cpf==null){
            System.out.println("CPF inválido");
            return;
        }
        if (nome.isBlank()|| nome==null) {
            System.out.println("Nome Inválido");
            return;
        }
        if (email.isBlank()|| email==null) {
            System.out.println("E-mail Inválido");
            return;
        }

        Aluno novoAluno = AlunoFactory.criar(proximoId, cpf, nome, email, telefone);


    }

    public void registrarNota() {
        System.out.println("Funcionalidade ainda não implementada");
    }

    public void registrarFalta(){
        System.out.println("Funcionalidade ainda não implementada");
    }
}
