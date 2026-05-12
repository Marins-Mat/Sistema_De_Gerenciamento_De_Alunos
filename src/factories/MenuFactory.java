package factories;

import menu.ItemMenu;
import menu.Menu;
import service.AlunoService;
import service.MateriaService;
import menu.OpcaoMenu;
import service.ProfessorService;
import service.TurmaService;
import util.AppContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuFactory {

    AppContext ctx;

    public MenuFactory(AppContext ctx) {
        this.ctx = ctx;
    }



    public Menu criar() {

        List<ItemMenu> itens = new ArrayList<>();
        itens.add(new OpcaoMenu("Cadastrar Matéria", ctx.getMateriaService()::cadastrarMateria));
        itens.add(new OpcaoMenu("Cadastrar Professor", ctx.getProfessorService()::cadastrarProfessor));
        itens.add(new OpcaoMenu("Cadastrar Turma", ctx.getTurmaService()::cadastrarTurma));
        itens.add(new OpcaoMenu("Cadastrar Aluno", ctx.getAlunoService()::cadastrarAluno));
        itens.add(new OpcaoMenu("Registrar Nota", ctx.getAlunoService()::registrarNota));
        itens.add(new OpcaoMenu("Registrar Falta", ctx.getAlunoService()::registrarFalta));
        itens.add(new OpcaoMenu("Registrar Falta", ctx.getTurmaService()::listarTurma));

        return new Menu(ctx.getIn(), itens);
    }

}
