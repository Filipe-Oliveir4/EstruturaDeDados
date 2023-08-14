package segundaLista;

import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {
		//Faça um programa que pergunte um número ao usuário e depois mostre a seguinte informação da tabuada na tela:
		Scanner ent = new Scanner(System.in);
		int num = ent.nextInt(), resultado;
		System.out.println("+--Resultado--+");
		for (int i = 1; i <= 10; i++) {
			resultado = i*num;
			String impressao="| ";
			if(i<10) {
				impressao+=" ";
			}
			
			impressao+=i+" * "+num+" = ";
			if(resultado<10) {
				impressao+=" ";
			}
			impressao+=resultado+" |";
			System.out.println(impressao);
		}
		System.out.println("+-------------+");
		ent.close();
	}

}
