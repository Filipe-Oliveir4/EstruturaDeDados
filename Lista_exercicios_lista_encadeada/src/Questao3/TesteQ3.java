package Questao3;

public class TesteQ3 {
    public static void main(String[] args) {
        ListaQ3 lista = new ListaQ3();
        for (int i=0;i<30;i++){
            lista.add(i+15);
        }
        lista.listarElementos(lista);
        System.out.println(lista.buscaRecursiva(lista.getInicio(),35));
    }

}
