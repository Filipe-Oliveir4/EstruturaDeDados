package q4;

import java.util.Scanner;

public class MainQ4 {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite 10 numeros inteiros");
        int x = 0,num;

        while (x<10){
            System.out.println("digite o "+x+" numero");
            try {
                num = ent.nextInt();
                if (num%2==0){
                    arvore.add(num);
                }
                x++;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        arvore.imprimirPosOrdem();
    }
}
