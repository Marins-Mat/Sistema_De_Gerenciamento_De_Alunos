package model;

import java.util.List;

public class Aluno {

    private Long id;
    private String cpf;
    private String nome;
    private String email;
    private String telefone;
    private List<Nota> notas;
    private List<Falta> faltas;

    public Aluno(Long id, String cpf, String nome, String email, List<Nota> notas, List<Falta> faltas) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.notas = notas;
        this.faltas = faltas;
    }

    public Aluno(Long id, String cpf, String nome, String email, String telefone, List<Nota> notas, List<Falta> faltas) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.notas = notas;
        this.faltas = faltas;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
