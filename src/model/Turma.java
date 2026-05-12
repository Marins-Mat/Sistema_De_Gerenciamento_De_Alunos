package model;

import model.enuns.Turno;

import java.util.List;

public class Turma {

    private Long id;
    private Turno turno;
    private Materia materia;
    private Professor professor;
    private List<Aluno> alunos;


    public Turma(Long id, Turno turno, Materia materia, Professor professor, List<Aluno> alunos) {
        this.id = id;
        this.turno = turno;
        this.materia = materia;
        this.professor = professor;
        this.alunos = alunos;
    }

    public Turno getTurno() {
        return turno;
    }

    public Materia getMateria() {
        return materia;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}


