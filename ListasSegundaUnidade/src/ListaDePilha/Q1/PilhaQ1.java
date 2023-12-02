package ListaDePilha.Q1;

import java.util.Stack;

public class PilhaQ1 {
    private Stack<String> pilha = new Stack<>();

    public PilhaQ1() {
    }

    public void inserirNaPilha(String nome) {
        pilha.push(nome);
        System.out.println("Nome inserido");
    }

    public void consultarPilha() {
        if (pilha.empty()){
            System.out.println("Pilha vazia");
        }else{
            System.out.println("Proximo nome: " + pilha.peek());
        }

    }

    public void removerDaPilha() {
        if (pilha.empty()){
            System.out.println("Pilha vazia");
        }else{
            System.out.println("Removendo nome: " + pilha.pop());
        }
    }

    public void esvaziarPilha(){
        System.out.println("Removendo todos os elementos");
        pilha.removeAllElements();
    }
}
