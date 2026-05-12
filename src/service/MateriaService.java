package service;

import factories.MateriaFactory;
import model.Materia;
import repositories.interfaces.MateriaRepository;

import java.util.Scanner;

public class MateriaService {

    Scanner in;
    Long proximoId;
    MateriaRepository materiaRepository;

    public MateriaService(Scanner in, MateriaRepository materiaRepository) {
        this.in = in;
        this.materiaRepository = materiaRepository;
        proximoId = 1L;
    }

    public void cadastrarMateria(){
        System.out.println("Qual o nome da matéria: ");
        String nome = in.nextLine();

        materiaRepository.add(MateriaFactory.criar(proximoId, nome));

    }
}
