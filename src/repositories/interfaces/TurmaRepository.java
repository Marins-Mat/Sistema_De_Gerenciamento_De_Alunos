package repositories.interfaces;

import model.Aluno;
import model.Turma;

import java.util.List;

public interface TurmaRepository {
    void add(Turma turma);

    List<Turma> findTurmas();
    Turma findTurmaById(Long id);
}
