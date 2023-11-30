package q4;

public class Arvore {
    private No raiz =null;

    public Arvore() {
    }
    private boolean vazia(){
        return (raiz ==null);
    }

    public void add(int num){
        No no = new No(num);
        if (vazia()){
           raiz = no;
        }else {
            add(raiz,no);
        }
    }

    private void add(No no, No noAdd){
        if (no.getEsquerda()==null){
            no.setEsquerda(noAdd);
            return;
        }
        if (no.getDireita() ==null){
            no.setDireita(noAdd);
            return;
        }
        if (verificaDisponibilidade(no.getEsquerda())){
            add(no.getEsquerda(),noAdd);
            return;
        }else if(verificaDisponibilidade(no.getDireita())){
            add(no.getDireita(),noAdd);
            return;
        }
        if(balanco(no.getEsquerda())  -   balanco(no.getDireita()) <=0){
            add(no.getEsquerda(),noAdd);
        }else{
            add(no.getDireita(),noAdd);
        }
    }

    private int balanco(No no){
        if (no==null){
            return 0;
        }else {
            return 1 + balanco(no.getEsquerda())+balanco(no.getDireita());
        }
    }
    private boolean verificaDisponibilidade(No no){
        return (no.getEsquerda()==null) || (no.getDireita()==null);
    }

    public void imprimirPosOrdem(){
        imprimirPosOrdem(raiz);
    }
    private void imprimirPosOrdem(No no){
        if(no!=null){
            imprimirPosOrdem(no.getEsquerda());
            imprimirPosOrdem(no.getDireita());
            System.out.print(no.getNum()+" ");
        }
    }
}
