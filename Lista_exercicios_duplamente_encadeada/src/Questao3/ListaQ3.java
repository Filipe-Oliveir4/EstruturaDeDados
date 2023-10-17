package Questao3;

public class ListaQ3<E> {
    private NoDuplamente<E> inicio=null;
    private NoDuplamente<E> fim=null;
    private NoDuplamente<E> atual=null;

    public ListaQ3() {
    }

    public NoDuplamente<E> getFim() {
        return fim;
    }

    public NoDuplamente<E> getInicio() {
        return inicio;
    }

    public NoDuplamente<E> getAtual() {
        return atual;
    }

    public void setAtual(NoDuplamente<E> atual) {
        this.atual = atual;
    }

    public void adicionarNoInicio(E ob){
        NoDuplamente<E> no= new NoDuplamente<E>(ob);
        if(this.inicio==null && this.fim==null){
            this.inicio =this.fim=no;
        }else{
            this.inicio.setAnterior(no);
            no.setProximo(this.inicio);
            this.inicio=no;
        }
    }

    public void adicionarNoFim(E ob){
        NoDuplamente<E> no = new NoDuplamente<E>(ob);
        if(this.inicio==null && this.fim==null){
            this.inicio =this.fim=no;
        }else{
            this.fim.setProximo(no);
            no.setAnterior(this.fim);
            this.fim=no;
        }
    }

    public String listar(){
        this.atual = this.inicio;
        String retorno="";
        while (atual!=null){
            retorno+=atual.toString()+"\n";
            atual=atual.getProximo();
        }
        return retorno;
    }
}
