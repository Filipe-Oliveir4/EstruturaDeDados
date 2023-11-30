package q2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    private Queue<Pessoa> fila = new LinkedList<>();

    public Fila() {
    }

    public void addFila(Pessoa pessoa){
        fila.add(pessoa);
        System.out.println("Pessoa adicionada a fila\n");
    }

    public void listarFila(){
        Iterator<Pessoa> it = fila.iterator();
        int i = 1;
        System.out.println("Listando fila");
        if (it.hasNext()){
            while(it.hasNext()){
                System.out.println(i+++" - "+it.next());
            }
            System.out.println();
        }else{
            System.out.println("fila vazia\n\n");
        }
    }
    public void removerFila(){
        if (fila.isEmpty()){
            System.out.println("Fila vazia");
        }else{
            System.out.println("Removendo o "+fila.poll());
        }
    }
}
