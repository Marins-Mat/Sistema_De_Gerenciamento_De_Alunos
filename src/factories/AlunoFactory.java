package factories;

import model.Aluno;

import java.util.ArrayList;

public class AlunoFactory {


    public static Aluno criar(Long id, String cpf, String nome, String email, String telefone) {
        if (telefone.isBlank()) {
            return new Aluno(id, cpf, nome, email, new ArrayList<>(), new ArrayList<>());
        }
        return new Aluno(id, cpf, nome, email, telefone, new ArrayList<>(), new ArrayList<>());
    }

}
