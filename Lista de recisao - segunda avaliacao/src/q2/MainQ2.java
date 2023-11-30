package q2;

import java.util.Scanner;

public class MainQ2 {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Pilha pilha = new Pilha();
        Scanner ent = new Scanner(System.in);
        String input="";
        do {
            System.out.println("Insira o sexo da pessoa");
            try {
                Pessoa pessoa = new Pessoa();
                input = ent.nextLine().toLowerCase();
                if (!(input.equals("m")||input.equals("f") || input.equals("r"))){
                    throw new Exception("Insira uma opção válida. Letras f, m ou r");
                }
                if(input.equals("m") || input.equals("f")){
                    pessoa.setSexo(input);
                    System.out.println("Insira um nome");
                    input = ent.nextLine();
                    if (input.equals("")){
                        throw new Exception("Insira um nome válido");
                    }
                    if (input.equals("fim")){
                        break;
                    }
                    pessoa.setNome(input);
                    if (pessoa.getSexo().equals("m")){
                        pilha.addPilha(pessoa);
                    }else{
                        fila.addFila(pessoa);
                    }
                }else{
                    fila.removerFila();
                    pilha.removerPilha();
                }

            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }while(!input.equals("fim"));
        fila.listarFila();
        pilha.listarPilha();
    }
}
