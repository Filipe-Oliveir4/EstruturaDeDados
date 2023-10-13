package Questao3;

public class ListaQ3 {
    private int numElementos=0;
    private No primeiro;
    private No ultimo;
    private No atual;

    public ListaQ3() {
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
    public void add(int num) {
        No no = new No(num,numElementos);
        if(this.primeiro==null) {
            this.primeiro=no;
            this.ultimo=no;
            this.numElementos++;
        }else {
            this.ultimo.setProximo(no);
            this.ultimo=no;
            this.numElementos++;
        }
    }
    public int verificarTamanho(No no){
        if (no!=null){
            return 1+verificarTamanho(no.getProximo());
        }else{
            return 0;
        }
    }

    public void listarElementos(ListaQ3 lista){
        atual=getInicio();
        for (int i=1;i<=lista.verificarTamanho(lista.getInicio());i++){
            System.out.println("Elemento:"+ atual.getNum()+" - posição: "+ atual.getPosicao());
            atual=atual.getProximo();
        }
    }
    public int buscaRecursiva(No no,int num){
        if(no==null){
            return -1;
        }else if (no.getNum()==num){
            return no.getPosicao();
        }else{
            return buscaRecursiva(no.getProximo(),num);
        }
    }
}
