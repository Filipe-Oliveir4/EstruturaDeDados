package ListaDePilha.Q2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class PilhaQ2 {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        Scanner ent = new Scanner(System.in);
        String nome="", nomeInverso="";
        do {
            nomeInverso="";
            System.out.println("Escreva um nome, pra sair escreva sair");
            nome = ent.nextLine();
            if(!nome.toLowerCase().equals(nomeInverso)){
                for (int i = nome.length()-1;i>=0;i--){
                nomeInverso+=nome.charAt(i);
                }
                if (nome.equals(nomeInverso)){
                    pilha.push(nome);
                    System.out.println("Nome adicionado\n");
                }
            }
        }while (!nome.equals("sair"));
        System.out.println("Listando pilha");
        Iterator<String> it = pilha.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
