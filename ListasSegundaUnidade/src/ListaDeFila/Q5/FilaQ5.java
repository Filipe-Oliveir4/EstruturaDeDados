package ListaDeFila.Q5;

import ListaDeFila.Q4.Aluno;


import java.util.LinkedList;
import java.util.Queue;

public class FilaQ5 {
    Queue<String> fila = new LinkedList<>();

    public FilaQ5() {
    }

    public void inserirPaciente(String nome){
        fila.add(nome);
        System.out.println("Paciente inserido");
    }

    public void atenderPaciente(){
        if(fila.isEmpty()){
            System.out.println("Fila vazia");
        }else{
            System.out.println("Paciente sendo atendido: "+fila.poll());
        }
    }

    public void verificarPaciente(){
        if(fila.isEmpty()){
            System.out.println("Não há paciente");
        }else{
            System.out.println("Há paciente");
        }
    }

    public void proximoPaciente(){
        if(fila.isEmpty()){
            System.out.println("Fila vazia");
        }else{
            System.out.println("Proximo paciente: "+fila.peek());
        }
    }

    public void quantidadePacientes(){
        System.out.println("Há "+fila.size()+" na fila");
    }
}
