package listaRecursividade;

public class SomaDigitosNumero {

	public static void main(String[] args) {
	System.out.println(SumDigNum(123123));

	}
	public static int SumDigNum(int num) {
		if(num==0) {
			return 0;
		}else {
			return (num%10)+SumDigNum(num/10);
		}
	}
}
