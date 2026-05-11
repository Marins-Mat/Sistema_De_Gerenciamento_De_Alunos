package Menu;

public record OpcaoMenu(String descricao, Runnable acao) implements ItemMenu{

    @Override
    public void executar() {
        acao.run();
    }
}
