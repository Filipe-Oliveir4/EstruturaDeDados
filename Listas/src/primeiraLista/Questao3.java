package primeiraLista;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		/*Crie uma classe java que contenha um método que receba dois números e efetue a multiplicação destes números.*/
		
		Scanner ent = new Scanner(System.in);
		int num1=ent.nextInt(), num2=ent.nextInt();
		System.out.println(num1*num2);
		ent.close();
	}

}
