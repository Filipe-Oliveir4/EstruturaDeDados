package ListaDePilha.Q5;

import java.util.Stack;

public class PilhaQ5 {
    private Stack<String> passos =null;

    public PilhaQ5() {

    }

    public boolean inicializarPilha(){
        if (passos ==null){
            passos =new Stack<>();
            return true;
        }else {
            System.out.println("Pilha já iniciada");
            return false;
        }
    }

    public void addPasso(String passo){
        passos.push(passo);
        System.out.println("Tarefa adicionada");
    }

    public String removerPasso(){
        return passos.pop();
    }

    public boolean tarefaConcluida(){
        return passos.empty()?true:false;
    }
}
