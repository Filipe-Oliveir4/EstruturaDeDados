package segundaLista;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		// Escrever um algoritmo para ler dois números inteiros e exibir a soma, a diferença e o produto dos mesmos. A saída deve mostrar os operandos, o operador e o resultado de cada operação.
		Scanner ent = new Scanner(System.in);
		int num1=ent.nextInt(),num2=ent.nextInt();
		System.out.println("| "+num1+" + "+num2+" = "+(num1+num2));
		System.out.println("| "+num1+" - "+num2+" = "+(num1-num2));
		System.out.println("| "+num1+" / "+num2+" = "+(num1/num2));
		ent.close();
	}

}
