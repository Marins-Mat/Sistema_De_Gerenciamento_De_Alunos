package util;

import repositories.interfaces.AlunoRepository;
import repositories.interfaces.MateriaRepository;
import repositories.interfaces.ProfessorRepository;
import repositories.interfaces.TurmaRepository;
import repositories.lists.AlunoListRepository;
import repositories.lists.MateriaListRepository;
import repositories.lists.ProfessorListRepository;
import repositories.lists.TurmaListRepository;
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

    MateriaRepository materiaRepository;
    ProfessorRepository professorRepository;
    TurmaRepository turmaRepository;
    AlunoRepository alunoRepository;

    public AppContext() {
        this.in = new Scanner(System.in);
        this.materiaRepository = new MateriaListRepository();
        this.professorRepository = new ProfessorListRepository();
        this.turmaRepository = new TurmaListRepository();
        this.alunoRepository = new AlunoListRepository();
        this.materiaService = new MateriaService(in, materiaRepository);
        this.professorService = new ProfessorService(in, materiaRepository, professorRepository);
        this.turmaService = new TurmaService(in, turmaRepository, professorRepository, materiaRepository);
        this.alunoService = new AlunoService(in, alunoRepository);
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
