package ListaDeFila.Q3;

import ListaDeFila.Q2.Contato;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class FilaQ3 {
    Queue<String> fila = new LinkedList<String>();

    public FilaQ3(){}

    public void inserirCliente(String nomeCliente){
        try {
            if (nomeCliente.equals("")){
                throw new Exception("O nome não pode estar em branco");
            }
            fila.offer(nomeCliente);
            System.out.println("cliente "+ nomeCliente +" adicionado");
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        };
    }
    public void removerCliente(){
        if (fila.isEmpty()){
            System.out.println("fila vazia");
        }else{
            System.out.println("cliente - "+fila.poll()+ " removido");
        }
    }
    public int numClientes(){
        int retorno=0;
        Iterator it = fila.iterator();
        while (it.hasNext()){
            it.next();
            retorno++;
        }
        return retorno;
    }
}
