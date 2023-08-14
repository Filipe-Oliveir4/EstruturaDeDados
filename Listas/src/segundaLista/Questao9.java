package segundaLista;

import java.util.Scanner;
public class Questao9 {

	public static void main(String[] args) {
		//Escreva um algoritmo para ler o salário mensal de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo usuário.
		Scanner ent = new Scanner(System.in);
		System.out.println("Insira o salário");
		double salario = ent.nextDouble(),reajuste;
		System.out.println("Insira o reajuste");
		reajuste=ent.nextDouble();
		salario+=(salario/100)*reajuste;
		System.out.println(salario);
		ent.close();
	}

}
