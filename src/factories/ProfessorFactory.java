package factories;

import model.Materia;
import model.Professor;
import model.enuns.Turno;

import java.util.List;

public class ProfessorFactory {
    public static Professor criar(Long id, String cpf, String nome, String email, String telefone, List<Turno> turnos, List<Materia> materias) {

        if (telefone.isBlank()) {
            return new Professor(id, cpf, nome, email, turnos, materias);
        }

        return new Professor(id, cpf, nome, email, telefone, turnos, materias);
    }
}
