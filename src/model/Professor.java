package model;


public class Professor {
    private Long id;
    private String cpf;
    private String nome;
    private String email;
    private String telefone;


    public Professor(Long id, String cpf, String nome, String email) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public Professor(Long id, String cpf, String nome, String email, String telefone) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
}
