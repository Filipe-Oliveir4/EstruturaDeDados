package ListaDeFila.Q4;


import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class FilaQ4 {

    public FilaQ4() {
        //Criação de um construtor vazio
    }

    Queue<Aluno> fila = new PriorityQueue<>(new AlunoComparator());

    public void inserirAluno(String nome, int idade){
        if(!nome.equals("") && idade>0){
            Aluno aluno = new Aluno(nome,idade);
            fila.add(aluno);
            System.out.println("Aluno adicionado");
        }else{
            System.out.println("Nome vazio ou idade<=0");
        }
    }

    public void listar(){
        Iterator it = fila.iterator();
        if(it.hasNext()){
            System.out.println("Alunos");
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }else{
            System.out.println("Lista vazia");
        }
    }
}
