package Questao5;


public class ListaQ5 {
    private int numElementos=0;
    private No primeiro;
    private No ultimo;
    private No atual;

    public ListaQ5() {
    }

    public No getInicio() {
        return primeiro;
    }

    public void setInicio(No inicio) {
        this.primeiro = inicio;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public No getAtual() {
        return atual;
    }

    public void setAtual(No atual) {
        this.atual = atual;
    }
    public void addNoFinal(int num) {
        No no = new No(num);
        if(this.numElementos<7){
            if(this.primeiro==null) {
                this.primeiro=no;
                this.ultimo=no;
                this.numElementos++;
            }else {
                this.ultimo.setProximo(no);
                this.ultimo=no;
                this.numElementos++;
            }
        }else{
            System.out.println("Lista cheia");
        }
    }
    public void addNoInicio(int num) {
        No no = new No(num);
        if(this.numElementos<7){
            if(this.primeiro==null) {
                this.primeiro=no;
                this.ultimo=no;
                this.numElementos++;
            }else {
                no.setProximo(primeiro);
                this.primeiro=no;
                this.numElementos++;
            }
        }else{
            System.out.println("Lista cheia");
        }
    }
    public int verificarTamanho(No no){
        if (no!=null){
            return 1+verificarTamanho(no.getProximo());
        }else{
            return 0;
        }
    }

    public void listarElementos(ListaQ5 lista){
        atual=getInicio();
        for (int i=1;i<=lista.verificarTamanho(lista.getInicio());i++){
            System.out.println("Elemento:"+ atual.getNum()+" - posição: "+i);
            atual=atual.getProximo();
        }
    }

}
