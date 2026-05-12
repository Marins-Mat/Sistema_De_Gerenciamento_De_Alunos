package model;


import model.enuns.Turno;

import java.util.List;

public class Professor {
    private Long id;
    private String cpf;
    private String nome;
    private String email;
    private String telefone;
    //Turnos em que o professor está disponivel a lecionar
    private List<Turno> turnos;
    //Materias em que o professor está capacitado a lecionar
    private List<Materia> materias;


    public Professor(Long id, String cpf, String nome, String email, List<Turno> turnos, List<Materia> materias) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.turnos = turnos;
        this.materias = materias;
    }

    public Professor(Long id, String cpf, String nome, String email, String telefone, List<Turno> turnos, List<Materia> materias) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.turnos = turnos;
        this.materias = materias;
    }
}
