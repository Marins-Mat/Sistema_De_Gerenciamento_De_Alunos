package service;

import factories.MateriaFactory;
import model.Materia;

import java.util.Scanner;

public class MateriaService {

    Scanner in;
    Long proximoId;

    public MateriaService(Scanner in) {
        this.in = in;
        proximoId = 1L;
    }

    public void cadastrarMateria(){
        System.out.println("Qual o nome da matéria: ");
        String nome = in.nextLine();

        Materia novaMateria = MateriaFactory.criar(proximoId, nome);

    }
}
