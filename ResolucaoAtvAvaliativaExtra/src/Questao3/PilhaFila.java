package Questao3;

import java.util.*;

public class PilhaFila {
    private Queue<Integer> fila = new LinkedList<Integer>();
    private Stack<Integer> pilha = new Stack<Integer>();

    public PilhaFila() {}
    int qtdNum=0;
    public void inseriFila(int num){
        if (qtdNum<10){
            fila.offer(num);
            System.out.println("Numero adicionado\n");
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
            System.out.println("Fim\n\n");
        }else{
            System.out.println("Fila vazia");
        }
    }

    public void tranferirFilaPilha(){
        pilha.clear();
        Iterator<Integer> it = fila.iterator();
        if(it.hasNext()){
            System.out.println("Add a pilha\n");
            while (it.hasNext()){
                pilha.add(it.next());
            }
        }else{
            System.out.println("Fila vazia");
        }
    }

    public void listarPilha(){
        if (pilha.empty()){
            System.out.println("Pilha vazia");
        }else{
            List<Integer> list = pilha.reversed();
            Iterator<Integer> it = pilha.reversed().iterator();
            System.out.println("Topo");
            while (it.hasNext()){
                System.out.println(it.next());
            }
            System.out.println("Base\n");
        }
    }
}
