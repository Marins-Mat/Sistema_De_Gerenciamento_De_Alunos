package factories;

import model.Materia;

public class MateriaFactory {

    public static Materia criar(Long id, String nome) {
        return new Materia(id, nome);
    }
}
