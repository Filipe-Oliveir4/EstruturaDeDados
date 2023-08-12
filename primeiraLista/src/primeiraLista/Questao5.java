package primeiraLista;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		/*Crie uma classe em java para calcular o estoque médio de um produto. O estoque médio é calculado pela formula
		 * : estoque médio = (quantidade mínima + quantidade máxima)/2. Deverá ser solicitado ao usuário o nome do produto, 
		 * a quantidade mínima e a quantidade máxima do produto.*/

		Scanner ent = new Scanner(System.in);
		int estoqueMin, estoqueMax;
		String nomeProduto;
		System.out.println("Qual nome do produto?");
		nomeProduto=ent.nextLine();
		System.out.println("Qual estoque minimo?");
		estoqueMin=ent.nextInt();
		System.out.println("Qual estoque maximo?");
		estoqueMax=ent.nextInt();

		System.out.println("Nome do produto: "+nomeProduto+"\nEstoque medio: "+((estoqueMax+estoqueMin)/2));
		ent.close();
	}

}
