package listaRecursividade;

import java.util.Arrays;

public class Torres {
	int[] torreA ;
	int[] torreB ;
	int[] torreC ;
	public Torres(int num) {
		super();
		this.torreA = new int[num];
		this.torreB = new int[num];
		this.torreC = new int[num];
		preencherTorreA(torreA);
	}
	public void moverDisco(int[] torreOrigem,int [] torreDestino) {
		int aux=0;
		int ultimoZero=0;
		for (int i = 0; i < torreOrigem.length; i++) {
			if(torreOrigem[i]!=0) {
				aux = torreOrigem[i];
				torreOrigem[i]=0;
				break;
			}
		}
		for (int i = 0; i < torreDestino.length; i++) {
			if(torreDestino[i]==0) {
				ultimoZero=i;
			}
		}
		torreDestino[ultimoZero]=aux;
	}
	private void preencherTorreA(int[] torreA){
		for (int i = 0; i < torreA.length; i++) {
			torreA[i]=i+1;
		}
	}
	@Override
	public String toString() {
		String retorno="";
		for (int i = 0; i < torreA.length; i++) {
			if(torreA[i]==0) {
				retorno+="  ";
			}else {
				retorno+=torreA[i]+" ";
			}
			if(torreB[i]==0) {
				retorno+="  ";
			}else {
				retorno+=torreB[i]+" ";
			}
			if(torreC[i]==0) {
				retorno+="  ";
			}else {
				retorno+=torreC[i]+" ";
			}
			retorno+="\n";
		}
		return retorno +"A B C\n";
	}
	
	
}
