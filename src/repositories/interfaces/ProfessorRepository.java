package repositories.interfaces;

import model.Professor;
import model.enuns.Turno;

import java.util.List;

public interface ProfessorRepository {
    void add(Professor professor);

    List<Professor> findByTurno(Turno turno);
}
