package model;

public class Nota {

    private Turma turma;
    private Materia materia;
    private Aluno aluno;
    private double valor;

    public Nota(Turma turma, Materia materia, Aluno aluno, double valor) {
        this.turma = turma;
        this.materia = materia;
        this.aluno = aluno;
        this.valor = valor;
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

    public double getValor() {
        return valor;
    }
}
