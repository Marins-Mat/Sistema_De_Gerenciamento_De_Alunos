package repositories.lists;

import model.Turma;
import repositories.interfaces.TurmaRepository;

import java.util.ArrayList;
import java.util.List;

public class TurmaListRepository implements TurmaRepository {

    List<Turma> turmas;


    public TurmaListRepository() {
        this.turmas = new ArrayList<>();
    }

    @Override
    public void add(Turma turma) {

    }

    @Override
    public List<Turma> findTurmas() {
        return turmas;
    }

    @Override
    public Turma findTurmaById(Long id) {
        return turmas.get(id.intValue());
    }


}
