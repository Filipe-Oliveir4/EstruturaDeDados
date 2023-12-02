package ListaDePilha.Q4;

import java.util.Stack;

public class PilhaQ4 {
    private Stack<String> paginas=null;

    public PilhaQ4() {

    }

    public boolean inicializarPilha(){
        if (paginas==null){
            paginas=new Stack<>();
            return true;
        }else {
            System.out.println("Pilha já iniciada");
            return false;
        }
    }

    public void push(String pagina){
        paginas.push(pagina);
        System.out.println("Pagina adicionada");
    }

    public String pop(){
        return paginas.pop();
    }
}
