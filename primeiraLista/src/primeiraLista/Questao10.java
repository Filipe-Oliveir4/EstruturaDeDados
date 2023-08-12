package primeiraLista;

public class Questao10 {

	public static void main(String[] args) {
		//Faça um programa que exiba os números primos de 1 até 50
		int divisores;
		for (int i = 1; i <=50; i++) {
			divisores=0;
			for (int j =1; j <= i; j++) {
				if(i%j==0) {
					divisores++;
				}
			}
			if(divisores==2) {
				System.out.print(i+" ");
			}
			
		}
	}

}
