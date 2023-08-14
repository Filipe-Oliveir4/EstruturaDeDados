package segundaLista;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		// Faça um algoritmo que receba o salário de um funcionário, calcule
		//e mostre o novo salário, sabendo-se que sofreu um aumento de 25%.
		Scanner ent = new Scanner(System.in);
		double salario = ent.nextDouble();
		salario+=(salario/100)*25;
		System.out.println(salario);
		ent.close();
	}
}
