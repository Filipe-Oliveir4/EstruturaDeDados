package segundaLista;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// Escreva um algoritmo para ler um número inteiro e exibir seu sucessor e o seu antecessor.
		Scanner ent = new Scanner(System.in);
		int num =ent.nextInt();
		System.out.println("Antecessor= "+(num-1)+"\nSucessor= "+(num+1));
		ent.close();
	}

}
