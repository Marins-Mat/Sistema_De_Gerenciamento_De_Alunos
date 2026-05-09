
// Este projeto tem como objetivo a revisão de diversos conceitos de programação.
// Ele consiste na criação de um sistema que será utilizado para gerenciamento de alunos que pode ser usado por uma instituição de ensino qualquer.
// Com ele deve ser possivel criar, editar, e remover alunos, gerenciar em quais turmas estão, quais materias estão matriculados suas notas e faltas,
// seus status em cada máteria (Matriculado, Aprovado, Reprovado) e todos os demais processamentos mais fundamentais necessários para ser utlizado em uma instituição real.

// Este projeto tem como proposta a utiização de diversas ferramentas e aprendizados, como o respeito aos principios SOLID, padrões de projeto, uso de Banco de Dados e e Testes Junit com Mockito.



Scanner in = new Scanner(System.in);

void main() {

    while (true) {
        System.out.println("--Sistema de Gerenciamento de Alunos--");
        System.out.println("1) - Cadastrar Materia");
        System.out.println("2) - Cadastrar Professor");
        System.out.println("3) - Cadastrar Turma");
        System.out.println("4) - Cadastrar Aluno");
        System.out.println("5) - Adicionar Nota");
        System.out.println("6) - Adicionar Falta");
        System.out.println("7) - Verificar Lista de Alunos");
        System.out.println("8) - Sair");

        switch (in.nextLine()) {
            case "1" -> cadastrarMateria();
            case "2" -> cadastrarProfessor();
            case "3" -> cadastrarTurma();
            case "4" -> cadastrarAluno();
            case "5" -> registrarNota();
            case "6" -> registrarFalta();
            case "7" -> listarAlunos();
            case "8" -> {
                System.out.println("Saindo...");
                return;
            }
            default -> System.out.println("Opcão Inválida");
        }

    }
}

private void cadastrarMateria(){
    System.out.println("Funcionalidade ainda não implementada");
}
private void cadastrarProfessor(){
    System.out.println("Funcionalidade ainda não implementada");
}
private void cadastrarTurma(){
    System.out.println("Funcionalidade ainda não implementada");
}
private void cadastrarAluno(){
    System.out.println("Funcionalidade ainda não implementada");
}
private void registrarNota(){
    System.out.println("Funcionalidade ainda não implementada");
}
private void registrarFalta(){
    System.out.println("Funcionalidade ainda não implementada");
}
private void listarAlunos(){
    System.out.println("Funcionalidade ainda não implementada");
}


