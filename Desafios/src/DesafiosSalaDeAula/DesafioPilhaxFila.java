package DesafiosSalaDeAula;

import java.util.*;

public class DesafioPilhaxFila {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Queue<Pessoa> fila = new LinkedList<Pessoa>();
        Stack<Pessoa> pilha = new Stack<Pessoa>();
        String entrada ="";
        while(!entrada.toLowerCase().equals("sair")){
            Pessoa pessoa = new Pessoa();
            System.out.println("Digite um nome pra pessoa");
            entrada= ent.nextLine();
            pessoa.setNome(entrada);
            System.out.println("Digite o sexo.\nM = masculino\nF = feminino ");
            entrada= ent.nextLine();
            pessoa.setSexo(entrada);
            if (pessoa.getSexo().toLowerCase().equals("m")){
                pilha.push(pessoa);
            }else{
                fila.add(pessoa);
            }
            System.out.println("Para sair escreva sair. Para continuar digite qualquer letra");
            entrada=ent.nextLine();
        }
        System.out.println("Pilha:");
        Iterator<Pessoa> pilhaIt = pilha.iterator();
        while (pilhaIt.hasNext()){
            System.out.println(pilhaIt.next());
        }
        System.out.println("Fila:");
        Iterator<Pessoa> filaIt = fila.iterator();
        while (filaIt.hasNext()){
            System.out.println(filaIt.next());
        }
    }
}

class Pessoa {
    String nome;
    String sexo;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nome+" - "+sexo;
    }
}
