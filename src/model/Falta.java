package model;

import java.time.LocalDate;

public class Falta {

    private Turma turma;
    private Materia materia;
    private Aluno aluno;
    private LocalDate data;


    public Falta(Turma turma, Materia materia, Aluno aluno, LocalDate data) {
        this.turma = turma;
        this.materia = materia;
        this.aluno = aluno;
        this.data = data;
    }

    public Turma getTurma() {
        return turma;
    }

    public Materia getMateria() {
        return materia;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public LocalDate getData() {
        return data;
    }
}
