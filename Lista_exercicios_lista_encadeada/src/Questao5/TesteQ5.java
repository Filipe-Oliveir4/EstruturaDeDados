package Questao5;

public class TesteQ5 {
    public static void main(String[] args) {
        ListaQ5 lista = new ListaQ5();
        for (int i=0;i<30;i++){
            lista.addNoInicio(i+15);
        }
        lista.listarElementos(lista);
    }
}
