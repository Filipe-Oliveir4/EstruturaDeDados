package Questao2;

public class ListaSimplismente{
    private NoSimplesmente primeiro=null;
    private NoSimplesmente ultimo=null;
    private NoSimplesmente atual=null;

    public ListaSimplismente() {

    }

    public void setAtual(NoSimplesmente atual) {
        this.atual = atual;
    }

    public NoSimplesmente getPrimeiro() {
        return primeiro;
    }

    public NoSimplesmente getUltimo() {
        return ultimo;
    }

    public NoSimplesmente getAtual() {
        return atual;
    }

    public void add(String nome){
        NoSimplesmente no = new NoSimplesmente(nome);
        if(this.primeiro==null) {
            this.primeiro=no;
            this.ultimo=no;
        }else {
            this.ultimo.setProximo(no);
            this.ultimo=no;
        }
    }
    public boolean pesquisar(String nome){
        this.atual=this.primeiro;
        while (atual!=null){
            if (atual.getNome().equals(nome)){
                return true;
            }
            atual=atual.getProximo();
        }
        return false;
    }
}
