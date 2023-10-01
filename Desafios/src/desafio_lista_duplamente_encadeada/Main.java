package desafio_lista_duplamente_encadeada;

public class Main {
    public static void main(String[] args) {
        Desafio_lista_duplamente_encadeada lista = new Desafio_lista_duplamente_encadeada();
        lista.addInicio("Filipe");
        lista.addFinal("Roberto");
        lista.addFinal("Ian");
        lista.addFinal("Lucas");
        lista.addFinal("Alex");

        lista.imprimirDoInicio();
        lista.removerPorNome("Ian");
        lista.imprimirDoInicio();
    }
}
