package listaTAD;

public class Questao3 implements Questao3_Intefarce {
	String nome,codigoDaDisciplina;

	public Questao3(String nome, String codigoDaDisciplina) {
		super();
		this.nome = nome;
		this.codigoDaDisciplina = codigoDaDisciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoDaDisciplina() {
		return codigoDaDisciplina;
	}

	public void setCodigoDaDisciplina(String codigoDaDisciplina) {
		this.codigoDaDisciplina = codigoDaDisciplina;
	}
	
}
