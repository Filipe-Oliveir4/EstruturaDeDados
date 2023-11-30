package q2;


import java.util.Iterator;
import java.util.Stack;

public class Pilha {
    private Stack<Pessoa> pilha = new Stack<>();

    public Pilha() {
    }

    public void addPilha(Pessoa pessoa){
        pilha.push(pessoa);
        System.out.println("Pessoa adicionada a pilha\n");
    }

    public void listarPilha(){
        System.out.println("Listando pilha");
        if (pilha.empty()){
            System.out.println("Pilha vazia");
        }else{
            Iterator<Pessoa> it = pilha.reversed().iterator();
            System.out.println("Topo");
            while (it.hasNext()){
                System.out.println(it.next());
            }
            System.out.println("Base\n");
        }
    }

    public void removerPilha(){
        if (pilha.empty()){
            System.out.println("Pilha vazia\n");
        }else{
            System.out.println("Removendo o "+pilha.pop());
        }
    }
}
