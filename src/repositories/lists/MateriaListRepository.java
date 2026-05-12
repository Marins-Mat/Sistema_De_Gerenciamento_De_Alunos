package repositories.lists;

import model.Materia;
import model.Professor;
import repositories.interfaces.MateriaRepository;

import java.util.ArrayList;
import java.util.List;

public class MateriaListRepository implements MateriaRepository {

    List<Materia> materias;

    public MateriaListRepository() {
        this.materias = new ArrayList<>();
    }

    @Override
    public void add(Materia materia) {
        materias.add(materia);
    }

    @Override
    public List<Materia> findAll() {
        return materias;
    }
}
