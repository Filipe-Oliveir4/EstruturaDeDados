package ListaDeFila.Q1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class FilaQ1 {
    Queue<String> fila = new LinkedList<String>();

    public FilaQ1() {
    }
    public void inserirMusica(String nomeMus){
        try {
            if (nomeMus.equals("")){
                throw new Exception("O nome não pode estar em branco");
            }
            fila.offer(nomeMus);
            System.out.println("Musica "+ nomeMus +" adicionada");
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        };
    }

    public void consultarMusica(){
        Iterator<String> it = fila.iterator();
        int i = 1;
        if (it.hasNext()){
            System.out.println("Lista de musicas");
            while(it.hasNext()){
                System.out.println(i+++" - "+it.next());
            }
            System.out.println();
        }else{
            System.out.println("lista vazia");
        }
    }

    public void removerMusica(){
        System.out.println("Musica - "+fila.poll()+ " removida");
    }


}
