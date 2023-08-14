package primeiraLista;

import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		/*Crie uma classe java que contenha um método que receba dois números e indique se são iguais ou
		se são diferentes. Mostre o maior e o menor (nesta sequência).*/
		
		Scanner ent = new Scanner(System.in);
		int num1=ent.nextInt(), num2=ent.nextInt();
		if(num1>num2) {
			System.out.println("Diferentes "+num1+" "+num2);
		}else if(num1<num2){
			System.out.println("Diferentes "+num2+" "+num1);
		}else {
			System.out.println("Numeros iguais");
		}
		ent.close();
	}
}
