package listaTAD;

public class Questao2 implements Questao2_Interface{
	String aluno, semestre;

	public Questao2(String aluno, String semestre) {
		super();
		this.aluno = aluno;
		this.semestre = semestre;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	
}
