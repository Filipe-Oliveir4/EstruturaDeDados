package desafio_lista_duplamente_encadeada;

public class Desafio_lista_duplamente_encadeada {
    private No primeiro = null;
    private No ultimo = null;
    private No atual = null;

    public Desafio_lista_duplamente_encadeada() {
    }

    public void addInicio(String nome){
        No aux = new No(nome);
        if (primeiro==null && ultimo==null) {
            primeiro = aux;
            ultimo = aux;
        }else{
            aux.setProximo(primeiro);
            primeiro.setAnterior(aux);
            primeiro=aux;
        }
    }
    public void addFinal(String nome){
        No aux = new No(nome);
        if (primeiro==null && ultimo==null) {
            primeiro=ultimo=aux;
        }else{
            ultimo.setProximo(aux);
            aux.setAnterior(ultimo);
            ultimo=aux;
        }
    }

    public void imprimirDoInicio(){
        for (atual=primeiro;atual!=null;atual=atual.getProximo()){
            System.out.println(atual);
        }
    }
    public void imprimirDoFinal(){
        for (atual=ultimo;atual!=null;atual=atual.getAnterior()){
            System.out.println(atual);
        }
    }

    public boolean removerDoInicio(){
        if(primeiro==null && ultimo==null){
            return false;
        }else if(primeiro!=ultimo){
            atual=primeiro;
            primeiro=atual.getProximo();
            primeiro.setAnterior(null);
            atual=null;
            return true;
        }else{
            primeiro=ultimo=null;
            return true;
        }
    }

    public boolean removerDoFinal(){
        if(primeiro==null && ultimo==null){
            return false;
        }else if(primeiro!=ultimo){
            atual=ultimo;
            ultimo=atual.getAnterior();
            ultimo.setProximo(null);
            atual=null;
            return true;
        }else{
            primeiro=ultimo=null;
            return true;
        }
    }
    public boolean removerPorNome(String nome){
        for (atual=primeiro;atual!=null;atual=atual.getProximo()){
            if (atual.getNome().equals(nome)) {
                if (atual.getAnterior()==null){
                    removerDoInicio();
                    return true;
                } else if (atual.getProximo()==null) {
                    removerDoFinal();
                    return true;
                }else {
                    atual.getAnterior().setProximo(atual.getProximo());
                    atual.getProximo().setAnterior(atual.getAnterior());
                    atual=null;
                    return true;
                }
            }
        }
        return false;
    }
}
