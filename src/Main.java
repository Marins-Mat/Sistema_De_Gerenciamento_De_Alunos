
/*

Este projeto tem como objetivo a revisão de diversos conceitos de programação.
Ele consiste na criação de um sistema que será utilizado para gerenciamento de alunos que pode ser usado por uma instituição de ensino qualquer.
Com ele deve ser possivel criar, editar, e remover alunos, gerenciar em quais turmas estão, quais materias estão matriculados suas notas e faltas,
 seus status em cada máteria (Matriculado, Aprovado, Reprovado) e todos os demais processamentos mais fundamentais necessários para ser utlizado em uma instituição real.

Este projeto tem como proposta a utiização de diversas ferramentas e aprendizados, como o respeito aos principios SOLID, padrões de projeto, uso de Banco de Dados e e Testes Junit com Mockito.

*/

import factories.MenuFactory;

import menu.Menu;


Menu menu;
Scanner in = new Scanner(System.in);

void main() {

    menu = new MenuFactory(in).fabricarMenu();

    menu.exibirMenu();
}
