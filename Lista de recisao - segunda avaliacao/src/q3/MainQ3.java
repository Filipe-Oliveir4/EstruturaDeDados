package q3;



import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class MainQ3 {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        int input=0;
        Scanner ent = new Scanner(System.in);
        do {
            System.out.println("Insira um número inteiro");
            try {
                input= ent.nextInt();
            }catch (InputMismatchException exception){
                System.out.println("Insira somente um numero inteiro");
                input=0;
                ent.nextLine();
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
            if (input%2==0 && input>0){
                pilha.push(input);
                System.out.println("Numero adicionado");
            }else{
                System.out.println("Não adicionado");
            }
        }while (input>=0);
        Iterator<Integer> it = pilha.iterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }
    }
}
