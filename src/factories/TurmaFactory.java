package factories;

import model.Aluno;
import model.Materia;
import model.Professor;
import model.Turma;
import model.enuns.Turno;

import java.util.List;

public class TurmaFactory {

    public static Turma criar(Long id, Turno turno, Materia materia, Professor professor, List<Aluno> alunos) {
        return new Turma(id, turno, materia, professor, alunos);
    }
}
