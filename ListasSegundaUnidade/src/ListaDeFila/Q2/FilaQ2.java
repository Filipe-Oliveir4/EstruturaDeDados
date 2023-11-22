package ListaDeFila.Q2;

import java.util.LinkedList;
import java.util.Queue;

public class FilaQ2 {
    Queue<Contato> fila = new LinkedList<Contato>();

    public FilaQ2() {
    }

    public void inserirContato(Contato contato){
        if (contato.getNome().equals("") || contato.getEmail().equals("") || contato.getNumero().equals("") ){
            System.out.println("Algum dos campos ficou vazio");
        }else{
            fila.offer(contato);
        }
    }

    public void proximoContato(){
        if (!fila.isEmpty()){
            Contato contato = fila.poll();
            System.out.println(contato);
        }else{
            System.out.println("fila vazia");
        }
    }
}
