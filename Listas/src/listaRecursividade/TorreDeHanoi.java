package listaRecursividade;

public class TorreDeHanoi {

	public static void main(String[] args) {
		TorreHanoi(3, "inicio", "meio", "fim");
		Torres torre = new Torres(3);
		TorreHanoiObj(torre, torre.torreA.length, torre.torreA, torre.torreB, torre.torreC);

	}
	public static void TorreHanoi(int disco,String inicio, String meio, String fim) {
		if(disco>=1) {
			 TorreHanoi(disco-1, inicio, fim, meio);
			 System.out.println("O disco "+ disco +" moveu de "+ inicio +" para " + fim);
			 TorreHanoi(disco-1, meio, inicio, fim);
		}
	}
	
	public static void TorreHanoiObj(Torres torre,int numDisk,int[] torreA,int[] torreB,int[] torreC) {
		if(numDisk>=1) {
			TorreHanoiObj(torre, numDisk-1,torreA, torreC,torreB);
			torre.moverDisco(torreA, torreC);
			System.out.println(torre);
			TorreHanoiObj(torre, numDisk-1, torreB, torreA, torreC);
		}
	}
}
