package quetoes_recusividade_internet;

public class Soma_array {

	public static void main(String[] args) {
		int []array = {1,2,3,4,5};
		System.out.println(somarray(array, array.length-1));

	}
	
	public static int somarray(int [] array, int length ) {
		if (length ==0)
			return length = array[0];
		else
			return length = array[length]+somarray(array, --length);
	}
}
