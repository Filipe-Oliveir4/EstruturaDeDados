package Questao1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class FilaDeMusica {
    Queue<String> fila = new LinkedList<String>();

    public FilaDeMusica() {
    }

    public void inserirMusica(String nomeDaMusica){
        fila.offer(nomeDaMusica);
        System.out.println("Musica inserida");
    }

    public void proximaMusica(){
        if(fila.isEmpty()){
            System.out.println("Lista vazia\n");
        }else {
            System.out.println("Tocando: " + fila.poll()+"\n");
        }
    }

    public Iterator<String> ConsultarMusica(){
        return fila.iterator();
    }
}
