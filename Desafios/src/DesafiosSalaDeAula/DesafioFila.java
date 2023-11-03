package DesafiosSalaDeAula;

import java.util.*;

public class DesafioFila {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Queue<Integer> fila = new LinkedList<Integer>();
        int num,entrada=0;
        System.out.println("Digite 10 numeros inteiros");
        while(entrada<10){
            try {
                num=ent.nextInt();
                if(num<=0){
                    throw new MenorOuIgualA0();
                }else{
                    fila.add(fatorial(num));
                    entrada++;
                }
            }catch(InputMismatchException exception){
                System.out.println("Coloca numero inteiro!!!");
                ent.next();
            }catch (MenorOuIgualA0 ex){
                System.out.println(ex.getMessage());
                ent.next();
            }catch (Exception exception){
                System.out.println("Parabens, crashou o programa!!!");
            }
        }
        Iterator<Integer> it = fila.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }

    private static int fatorial(int num){
        if (num==1){
            return 1;
        }else{
            return num * fatorial(num-1);
        }
    }
}

class MenorOuIgualA0 extends Exception {
    public MenorOuIgualA0() {
        super("O numero tem que ser positivo!!!");
    }
}