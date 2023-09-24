package quetoes_recusividade_internet;

import java.util.Iterator;

public class Inverter_array {

	public static void main(String[] args) {
		int []array = {1,2,3,4,5};
		inverterArray(array, 0, array.length-1);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	public static void inverterArray(int[] array, int pivoEsq, int pivoDir) {
		if(pivoEsq>=pivoDir) {
			return;
			}else {
			array[pivoEsq]=array[pivoEsq]^array[pivoDir];
			array[pivoDir]=array[pivoDir]^array[pivoEsq];
			array[pivoEsq]=array[pivoEsq]^array[pivoDir];
			inverterArray(array, ++pivoEsq, --pivoDir);
		}
	}
}
