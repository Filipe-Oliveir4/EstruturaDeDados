package Questao2;

public class TesteQ2 {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        //inserir raiz
        arvore.insereRaiz(8);

        //Inserir direita e esquerda -> 8
        arvore.insereDir(8,10);
        arvore.insereEsq(8,3);

        //Inserir direita e esquerda -> 3
        arvore.insereDir(3,6);
        arvore.insereEsq(3,1);

        //Inserir direita e esquerda -> 6
        arvore.insereDir(6,7);
        arvore.insereEsq(6,4);

        //Inserir direita -> 10
        arvore.insereDir(10,14);

        //Inserir esquerda -> 14
        arvore.insereEsq(14,13);

        System.out.println("Pos-ordem");
        arvore.exibePosOrdem();
        System.out.println();
        System.out.println("In-ordem");
        arvore.exibeEmOrdem();
        System.out.println();
        System.out.println("Pre-ordem");
        arvore.exibePreOrdem();
        System.out.println();
    }
}
