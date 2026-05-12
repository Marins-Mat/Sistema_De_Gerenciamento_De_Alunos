package repositories.interfaces;

import model.Materia;

import java.util.List;

public interface MateriaRepository {
    void add(Materia materia);
    List<Materia> findAll();
}
