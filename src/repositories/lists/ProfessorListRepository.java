package repositories.lists;

import model.Professor;
import model.enuns.Turno;
import repositories.interfaces.ProfessorRepository;

import java.util.ArrayList;
import java.util.List;

public class ProfessorListRepository implements ProfessorRepository {
    List<Professor> professores;

    public ProfessorListRepository() {
        this.professores = new ArrayList<>();
    }

    @Override
    public void add(Professor professor) {
        professores.add(professor);
    }

    @Override
    public List<Professor> findByTurno(Turno turno) {
        return professores.stream().filter((p -> p.getTurnos().contains(turno))).toList();
    }


}
