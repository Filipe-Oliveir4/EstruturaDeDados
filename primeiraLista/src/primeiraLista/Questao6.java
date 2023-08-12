package primeiraLista;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		/*Crie uma classe que receba como entrada o nome, a altura e o sexo da pessoa. Faça o cálculo do peso ideal obedecendo a 
		 * seguinte fórmula: para homens = (72.7*h) – 58 e para mulheres = (62.1 *h) - 44.7.*/
		
		Scanner ent = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String nome = ent.nextLine();
		System.out.println("digite:\nH - homem\nM - mulher");
		char genero = ent.nextLine().toLowerCase().charAt(0);
		System.out.println("Qual sua altura?");
		double altura=ent.nextDouble();
		switch (genero) {
		case 'h': {
			System.out.println("nome: "+ nome +"\npeso ideal: "+((72.7*altura)-58));
			break;
		}
		case 'm': {
			System.out.println("nome: "+ nome +"\npeso ideal: "+((62.1*altura)-44.7));
			break;
		}
		default:
			System.out.println("Algo deu errado, tente novamente");
		}
		ent.close();
	}

}
