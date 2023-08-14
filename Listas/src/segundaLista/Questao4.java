package segundaLista;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		//Faça um algoritmo que receba três notas, calcule e mostre a média aritmética entre as notas.
		Scanner ent = new Scanner(System.in);
		double num1=ent.nextDouble(),num2=ent.nextDouble(),num3=ent.nextDouble();
		System.out.println((num1+num2+num3)/3);
		ent.close();

	}

}
