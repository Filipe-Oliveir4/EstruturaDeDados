package primeiraLista;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		//Crie uma classe java que contenha um método que receba dois números inteiros e imprima o maior entre eles.
		
		Scanner ent = new Scanner(System.in);
		int num1=ent.nextInt(), num2=ent.nextInt();
		if(num1>num2) {
			System.out.println("Num 1 maior");
		}else if(num1<num2){
			System.out.println("Num 2 maior");
		}else {
			System.out.println("Numeros iguais");
		}
		ent.close();
	}

}
