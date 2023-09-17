package listaRecursividade;

public class Mdc {

	public static void main(String[] args) {
		System.out.println(CalculaMDC(8, 4));
		System.out.println(CalculaMDCRecursiva(8, 4));

	}
	
	public static int CalculaMDC(int m, int n){
		int r;
		do{
		r = m%n;
		m = n;
		n = r;
		} while (r != 0);
		return m;
		}
	public static int CalculaMDCRecursiva(int m, int n) {
		int r = m%n;
		m = n;
		n = r;
		if(r==0) {
			return m;
		}else {
			return CalculaMDCRecursiva(m, n);
		}
	}
}
