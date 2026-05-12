package util;

import service.AlunoService;
import service.MateriaService;
import service.ProfessorService;
import service.TurmaService;

import java.util.Scanner;

public class AppContext {

    Scanner in;
    MateriaService materiaService;
    ProfessorService professorService;
    TurmaService turmaService;
    AlunoService alunoService;

    public AppContext() {
        this.in = new Scanner(System.in);
        this.materiaService = new MateriaService(in);
        this.professorService = new ProfessorService(in);
        this.turmaService = new TurmaService(in);
        this.alunoService = new AlunoService(in);
    }

    public Scanner getIn() {
        return in;
    }

    public MateriaService getMateriaService() {
        return materiaService;
    }

    public ProfessorService getProfessorService() {
        return professorService;
    }

    public TurmaService getTurmaService() {
        return turmaService;
    }

    public AlunoService getAlunoService() {
        return alunoService;
    }
}
