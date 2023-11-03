package DesafiosSalaDeAula;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class DesafioPilha {
    public static void main(String[] args) {
        int numIncluidos=0,numEscolhido=0;
        Scanner ent = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<Integer>();
        while (numIncluidos<15){
            try {
                System.out.println("Digite um numero");
                numEscolhido= ent.nextInt();
                if(numPrimo(numEscolhido)){
                    pilha.push(numEscolhido);
                    System.out.println("Numero primo adicionado");
                    numIncluidos++;
                }else{
                    System.out.println("Nao e um numero primo, digite outro");
                }
            }catch (InputMismatchException ex){
                System.out.println("Insira um inteiro!!!");
                ent.next();
            }catch (Exception ex){
                System.out.println("Bugou meu programa!!!");
            };
        }
        Iterator<Integer> it = pilha.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
    }
    public static boolean numPrimo(int n){
        int d;
        if(n <= 1) return false;
        for (d = 2; d < n; d++) {
            if (n%d == 0)  // d divide n?
                return false;
        }
        return true;
    }
}
