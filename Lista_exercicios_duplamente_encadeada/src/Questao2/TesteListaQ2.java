package Questao2;

import java.util.Scanner;

public class TesteListaQ2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        ListaSimplismente l1= new ListaSimplismente();
        ListaSimplismente l2 = new ListaSimplismente();
        ListaDuplamente l3 = new ListaDuplamente();
        System.out.println("Digite os nomes da primeira lista separados por 1 espaço");
        String nomesPrimeiraLista = ent.nextLine();
        String[] vetorNomesPrimeiraLista = nomesPrimeiraLista.split(" ");
        System.out.println("Digite os nomes da segunda lista separados por 1 espaço");
        String nomesSegundaLista =ent.nextLine();
        String[] vetorNomesSegundaLista = nomesSegundaLista.split(" ");
        for (int i=0;i< vetorNomesPrimeiraLista.length;i++){
            l1.add(vetorNomesPrimeiraLista[i]);
        }
        for (int i=0;i< vetorNomesSegundaLista.length;i++){
            l2.add(vetorNomesSegundaLista[i]);
        }
        for (l1.setAtual(l1.getPrimeiro());l1.getAtual()!=null;l1.setAtual(l1.getAtual().getProximo())){
            if(l2.pesquisar(l1.getAtual().getNome())){
                l3.addInicio(l1.getAtual().getNome());
            }
        }
        l3.imprimirDoInicio();
    }
}
