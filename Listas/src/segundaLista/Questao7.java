package segundaLista;

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		// Escreva um algoritmo que receba duas notas, calcule e mostre a média ponderada destas, considerando o peso 2 para a primeira nota e o peso 3 para a segunda nota. (média ponderada).
		Scanner ent = new Scanner(System.in);
		double num1=ent.nextDouble(),num2=ent.nextDouble();
		System.out.println(((num1*2)+(num2*3))/5);
		ent.close();

	}

}
