package repositories.lists;

import model.Aluno;
import repositories.interfaces.AlunoRepository;

import java.util.ArrayList;
import java.util.List;

public class AlunoListRepository implements AlunoRepository {

    List<Aluno> alunos;

    public AlunoListRepository() {
        this.alunos = new ArrayList<>();
    }

    @Override
    public void add(Aluno aluno) {
        alunos.add(aluno);
    }
}
