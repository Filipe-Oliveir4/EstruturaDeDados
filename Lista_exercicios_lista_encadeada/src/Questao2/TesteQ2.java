package Questao2;

public class TesteQ2 {
    public static void main(String[] args) {
        ListaQ2 lista = new ListaQ2();
        lista.add("045120","Relâmpago Maquin");
        lista.add("32135","Mate");
        lista.add("0465405","Alex");
        lista.mostrarLista();
        lista =lista.colocarEmOrdemAlfabetica(lista);
        lista.mostrarLista();
        System.out.println(lista.buscaRecursiva(lista.getPrimeiro(),"Mate"));



    }
}
