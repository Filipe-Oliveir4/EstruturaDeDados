package q1;

import java.util.LinkedList;
import java.util.Queue;

public class FilaQ1 {
    Queue<String> fila = new LinkedList<String>();

    public FilaQ1() {
    }

    public void inserirContato(String contato){
        fila.offer(contato);
        System.out.println("Contato inserido");
    }

    public void proximoContato(){
        if(fila.isEmpty()){
            System.out.println("Fila Vazia\n");
        }else {
            System.out.println("Proximo da fila: " + fila.poll()+"\n");
        }
    }
}
