package Questao3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PilhaFila {
    private Queue<Integer> fila = new LinkedList<Integer>();
    private Stack<Integer> pilha = new Stack<Integer>();

    public PilhaFila() {}
    int qtdNum=0;
    public void inseriFila(int num){
        if (qtdNum<10){
            fila.offer(num);
            System.out.println("Numero adicionado");
        }else{
            System.out.println("Fila cheia");
        }
    }

    public void listarFila(){
        Iterator<Integer> it = fila.iterator();
        if(it.hasNext()){
            System.out.print("Fila\n Inicio <- ");
            while (it.hasNext()){
                System.out.print(it.next()+" <- ");
            }
            System.out.println("Fim");
        }else{
            System.out.println("Fila vazia");
        }
    }

    public void tranferirFilaPilha(){
        pilha.clear();
        Iterator<Integer> it = fila.iterator();
        Stack<Integer> pilhaAux = new Stack<Integer>();
        if(it.hasNext()){
            System.out.println("Add a pilha");
            while (it.hasNext()){
                pilhaAux.add(it.next());
            }
            while (!pilhaAux.empty()){
                pilha.add(pilhaAux.pop());
            }
        }else{
            System.out.println("Fila vazia");
        }
    }

    public void listarPilha(){
        if (pilha.empty()){
            System.out.println("Pilha vazia");
        }else{
            Iterator<Integer> it = pilha.iterator();
            System.out.println("Topo");
            while (it.hasNext()){
                System.out.println(it.next());
            }
            System.out.println("Base");
        }
    }
}
