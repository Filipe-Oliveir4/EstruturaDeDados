package listaRecursividade;
//2 - Desenvolva um programa em java que calcule o fatorial de um número x.
public class Fatorial {

	public static void main(String[] args) {
		System.out.println(fat(7));
	}
	
	public static int fat(int num) {
		if(num==1) {
			return 1;
		}else {
			return num *fat(--num);
		}
	}
}
