package segundaLista;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		//Faça um algoritmo que receba dois números, calcule e mostre a subtração do primeiro pelo segundo.
		Scanner ent = new Scanner(System.in);
		int num1=ent.nextInt(), num2=ent.nextInt();
		System.out.println(num1-num2);
		ent.close();
	}

}
