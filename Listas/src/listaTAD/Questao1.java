package listaTAD;

public class Questao1 implements Questao1_Interface {
	String titulo,editora,anoDePublicacao;

	public Questao1(String titulo, String editora, String anoDePublicacao) {
		super();
		this.titulo = titulo;
		this.editora = editora;
		this.anoDePublicacao = anoDePublicacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(String anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}
	
	
}
