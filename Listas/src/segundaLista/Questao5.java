package segundaLista;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		// Faça um algoritmo que receba quatro números inteiros calcule e mostre a soma destes números.
		Scanner ent = new Scanner(System.in);
		int num1=ent.nextInt(),num2=ent.nextInt(),num3=ent.nextInt();
		System.out.println(num1+num2+num3);
		ent.close();
	}

}
