package segundaLista;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		// Faça um algoritmo que receba o valor de um depósito e o valor da taxa de juros,
		//calcule e mostre o valor do rendimento e o valor total depois do rendimento.
		Scanner ent = new Scanner(System.in);
		System.out.println("Insira o deposito");
		double deposito = ent.nextDouble();
		System.out.println("Insira taxa de juros");
		double taxaDeJuros=ent.nextDouble();
		double rendimento=(deposito/100)*taxaDeJuros;
		System.out.println("Valor rendimento= "+rendimento+"\nValor total= "+(deposito+rendimento));
		ent.close();
	}

}
