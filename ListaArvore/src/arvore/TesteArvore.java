package arvore;

public class TesteArvore {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        //add raiz
        arvore.insereRaiz(5);

        //add esquerda e direita 5
        arvore.insereEsq(5,3);
        arvore.insereDir(5,9);

        //add direita 3
        arvore.insereDir(3,4);

        //add esquerda e direita 9
        arvore.insereEsq(9,7);
        arvore.insereDir(9,11);

        //a
        System.out.println("In order");
        arvore.exibeEmOrdem();
        System.out.println("\n");

        //b
        System.out.println("Pré order");
        arvore.exibePreOrdem();
        System.out.println("\n");

        //c
        System.out.println("Pós order");
        arvore.exibePosOrdem();
        System.out.println("\n");

        //d
        System.out.println("Exibir folhas");
        arvore.exbirFolhas();
        System.out.println("\n");

        //e
        System.out.println("Exibir raiz e filhos");
        arvore.exbirRaizFilhos();
    }
}
