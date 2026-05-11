package Factories;

import Menu.ItemMenu;
import Menu.Menu;
import Service.AlunoService;
import Service.MateriaService;
import Menu.OpcaoMenu;
import Service.ProfessorService;
import Service.TurmaService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuFactory {

    Scanner in;

    public MenuFactory(Scanner in) {
        this.in = in;
    }



    public Menu fabricarMenu() {

        List<ItemMenu> itens = new ArrayList<>();
        itens.add(new OpcaoMenu("Cadastrar Matéria", MateriaService::cadastrarMateria));
        itens.add(new OpcaoMenu("Cadastrar Professor", ProfessorService::cadastrarProfessor));
        itens.add(new OpcaoMenu("Cadastrar Turma", TurmaService::cadastrarTurma));
        itens.add(new OpcaoMenu("Cadastrar Aluno", AlunoService::cadastrarAluno));
        itens.add(new OpcaoMenu("Registrar Nota", AlunoService::registrarNota));
        itens.add(new OpcaoMenu("Registrar Falta", AlunoService::registrarFalta));
        itens.add(new OpcaoMenu("Registrar Falta", TurmaService::listarTurma));

        return new Menu(in, itens);
    }

}
