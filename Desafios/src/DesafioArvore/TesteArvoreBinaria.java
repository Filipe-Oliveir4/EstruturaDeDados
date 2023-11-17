package DesafioArvore;

public class TesteArvoreBinaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("vamos testar se o que a professora fez t� certo");
		ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
		// pessoal a nossa arvore � de inteiros.. ent�o vamos come�ar... 
		/*           5
		*           /  \
		*         8     15
		* 		 / \    / \
		* 	   13	7  78  24*/
		arvoreBinaria.insereRaiz(5);

		//Esquerda e direita -> 5
		arvoreBinaria.insereEsq(5, 8);
		arvoreBinaria.insereDir(5, 15);

		//Esquerda e direita -> 8
		arvoreBinaria.insereEsq(8, 13);
		arvoreBinaria.insereDir(8, 7);

		//Esquerda e direita -> 15
		arvoreBinaria.insereEsq(15, 78);
		arvoreBinaria.insereDir(15, 24);

		System.out.println("Pre ordem");
		arvoreBinaria.exibePreOrdem();
		System.out.println();

		System.out.println("Em ordem");
		arvoreBinaria.exibeEmOrdem();
		System.out.println();

		System.out.println("Pos ordem");
		arvoreBinaria.exibePosOrdem();
		System.out.println();
	}

}
