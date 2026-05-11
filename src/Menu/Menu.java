package Menu;

import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner in;
    List<ItemMenu> itens;
    private int indiceSair;

    public Menu(Scanner in, List<ItemMenu> itens) {
        this.in = in;
        this.itens = itens;
        indiceSair = itens.size()+1;
    }

    public void exibirMenu() {
        while (true) {
            System.out.println("--Sistema de Gerenciamento de Alunos--");
            for (int i = 0; i< itens.size(); i++) {
                System.out.printf("%d) - %s%n",i + 1, itens.get(i).descricao());
            }

            System.out.printf("%d) - Sair%n", indiceSair);

            String entrada = in.nextLine();

            try {
                int opcao = Integer.parseInt(entrada);
                if (opcao == indiceSair) {
                    System.out.println("Saindo...");
                    return;
                }
                if (opcao >= 1 && opcao < indiceSair) {
                    itens.get(opcao-1).executar();
                } else {
                    System.out.println("Opcao Inválida");
                }

            } catch (NumberFormatException e) {
                System.out.println("Opcao Inválida");
            }
        }
    }


}
