package listaRecursividade;

public class TransfBinario {
	//Escreva em java um método recursivo que receba um número inteiro na
	//base decimal e realize a conversão deste número para base binária. 
	public static void main(String[] args) {
		System.out.println(bin(10));

	}
	public static String bin(int num) {
		if(num==0) {
			return "";
		}else {
			if(num%2==0) {
				num=num/2;
				return bin(num)+" "+0;
			}else {
				num=num/2;
				return bin(num)+" "+1;
			}
		}
	}

}
