package ListaDeFila.Q4;

import java.util.Comparator;

public class AlunoComparator implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}
