package segundaLista;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		//Faça um algoritmo que receba o salário-base de um funcionário, calcule e mostre o salário a receber, 
		//sabendo-se que esse funcionário tem gratificação de 5% sobre o salário base e paga imposto de 7% sobre o salário base.
		Scanner ent = new Scanner(System.in);
		System.out.println("Insira o salário");
		double salarioBase = ent.nextDouble();
		double gratificacao=(salarioBase/100)*5;
		double imposto=(salarioBase/100)*7;
		System.out.println("Salario base= "+salarioBase+"\nImposto= "+imposto+"\nGratificacao= "+gratificacao+"\nSalario liquido= "+(salarioBase+gratificacao-imposto));
		ent.close();
	}

}
