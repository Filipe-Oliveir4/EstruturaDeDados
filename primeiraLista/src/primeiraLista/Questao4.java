package primeiraLista;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		/*Crie uma classe java em que o usuário informe dois números e a operação que deve executar e apresente o resultado.*/
		
		char op =' ';
		Scanner ent = new Scanner(System.in);
		System.out.println("insira dois numeros");
		int num1=ent.nextInt(), num2=ent.nextInt();
		System.out.println("Qual a operação?\n + -> soma\n - -> subtracao\n * -> multiplicacao\n / -> divisap");
		ent.nextLine();
		op =ent.nextLine().charAt(0);

		switch (op) {
		case '+': {
			System.out.println(num1+num2);
			break;
		}
		case '-': {
			System.out.println(num1-num2);
			break;
		}
		case '*': {
			System.out.println(num1*num2);
			break;
		}
		case '/': {
			System.out.println(num1/num2);
			break;
		}
		}
		ent.close();

	}
}
