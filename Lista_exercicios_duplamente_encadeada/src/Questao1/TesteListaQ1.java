package Questao1;

public class TesteListaQ1 {
    public static void main(String[] args) {
        ListaQ1 lista = new ListaQ1();
        for (int i=1;i<11;i++){
            lista.addFinal(i);
        }
        lista.imprimirDoInicio();
        lista.imprimirDoFinal();
    }
}
