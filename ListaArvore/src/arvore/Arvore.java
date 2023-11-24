package arvore;

public class Arvore {
    private No raiz =null;

    public Arvore() {
    }
    private boolean vazia(){
        return (raiz ==null);
    }

    public No busca(int valor) {
        if (vazia()){
            return null;
        }
        return busca(raiz, valor);
    }

    private No busca (No T, int valor) {
        if (T != null) {
            if (T.getNum() == valor) {
                return T; // retornei T pq encontrei o elemento
            }
            No aux = busca(T.getEsquerda(), valor);
            if (aux == null) {
                aux = busca(T.getDireita(), valor);
            }
            return aux;
        }
        return null;
    }

    // metodo para inserir (raiz, esq, dir) ent�o ser�o 3 m�todos        | |       | |
    // inserir raiz
    public boolean insereRaiz (int valor) {
        if(raiz != null) {
            return false;
        }
        No novoNo = new No(valor);
        raiz = novoNo;
        return true;
    }


    //insere direita

    public boolean insereDir(int vPai, int vFilho) {
        No filho = busca(vFilho);
        No pai = busca(vPai);
        if(filho != null || pai == null || pai.getDireita() != null) {
            return false;
        }

        No novoNo = new No(vFilho);
        pai.setDireita(novoNo);
        return true;
    }

    //insere esquerda
    public boolean insereEsq(int vPai, int vFilho) {

        No filho = busca(vFilho);
        No pai = busca(vPai);
        if(filho != null || pai == null || pai.getEsquerda() != null) {
            return false;
        }
        No novoNo = new No(vFilho);
        pai.setEsquerda(novoNo);
        return true;
    }


    // imprimir os dados
    //pre ordem

    private void exibePreOrdem(No T) {
        if(T == null)
            return;
        System.out.print(" " + T.getNum());
        if(T.getEsquerda() != null) {
            exibePreOrdem(T.getEsquerda());
        }
        if(T.getDireita() != null) {
            exibePreOrdem(T.getDireita());
        }
    }

    public void exibePreOrdem() {
        if(raiz == null){
            System.out.println("Sua �rvore n�o possui elementos.. ela est� vazia");
        }
        else{
            exibePreOrdem(raiz);
        }
    }

    // inordem
    private void exibeEmOrdem(No T) {
        if(T == null)
            return;
        if(T.getEsquerda() != null) {
            exibeEmOrdem(T.getEsquerda());
        }
        System.out.print(" " + T.getNum());
        if(T.getDireita() != null) {
            exibeEmOrdem(T.getDireita());
        }
    }

    public void exibeEmOrdem() {
        if(raiz == null){
            System.out.println("Sua �rvore n�o possui elementos.. ela est� vazia");
        }
        else {
            exibeEmOrdem(raiz);
        }
    }


    //posordem
    private void exibePosOrdem(No T) {
        if(T == null) {
            return;
        }

        if(T.getEsquerda() != null){
            exibePosOrdem(T.getEsquerda());
        }
        if(T.getDireita() != null){
            exibePosOrdem(T.getDireita());
        }
        System.out.print(" " + T.getNum());
    }

    public void exibePosOrdem() {
        if(raiz == null) {
            System.out.println("Sua �rvore n�o possui elementos.. ela est� vazia");
        }
        else {
            exibePosOrdem(raiz);
        }
    }

    public void exbirFolhas(){
        if(raiz == null) {
            System.out.println("Sua �rvore n�o possui elementos.. ela est� vazia");
        }
        else {
            exbirFolhas(raiz);
        }
    }
    private void exbirFolhas(No T){
        if(T == null) {
            return;
        }
        if(T.getEsquerda()==null && T.getDireita()==null ){
            System.out.print(T.getNum()+" ");
            return;
        }else{
            if(T.getEsquerda() != null){
                exbirFolhas(T.getEsquerda());
            }
            if(T.getDireita() != null){
                exbirFolhas(T.getDireita());
            }
        }
    }

    public void exbirRaizFilhos(){
        if(raiz == null) {
            System.out.println("Sua �rvore n�o possui elementos.. ela est� vazia");
        }
        else {
            exbirRaizFilhos(raiz);
        }
    }

    public void exbirRaizFilhos(No T){
        System.out.print("No raiz ");
        System.out.println(T.getNum());
        if(T.getEsquerda() != null){
            System.out.println("Esquerda = "+T.getEsquerda().getNum());
        }
        if(T.getDireita() != null){
            System.out.println("Direita = "+T.getDireita().getNum());
        }


    }
}
