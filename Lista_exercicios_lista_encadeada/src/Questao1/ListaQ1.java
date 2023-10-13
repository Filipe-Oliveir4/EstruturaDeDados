package Questao1;

public class ListaQ1 {
	private No inicio;
	private No ultimo;
	private No atual;
	
	public ListaQ1() {
		
	}

	public No getInicio() {
		return inicio;
	}

	public void setInicio(No inicio) {
		this.inicio = inicio;
	}	
	
	
	public No getUltimo() {
		return ultimo;
	}

	public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}

	public No getAtual() {
		return atual;
	}

	public void setAtual(No atual) {
		this.atual = atual;
	}
	
	public void add(Professor professor) {
		No no = new No(professor);
		if(this.inicio==null) {
			this.inicio=no;
			this.ultimo=no;
		}else {
			this.ultimo.setProximo(no);
			this.ultimo=no;
		}
	}
	
	public boolean temProximo() {
		if(this.inicio==null) {
			return false;
		}else if(atual==null){
			this.atual=inicio;
			return true;
		}else {
			boolean temProximo = atual.getProximo() !=null ? true: false;
			atual = atual.getProximo();
			return temProximo;
		}
	}
	
	public No recuperarPenultimo(No no) {
		if(no.getProximo().equals(ultimo)) {
			return no;
		}
		return recuperarPenultimo(no.getProximo());	
	}
	
	public void remover() {
		if(inicio.getProximo()!=null) {
			No no = recuperarPenultimo(inicio);
			ultimo=no;
			no.setProximo(null);
		}else {
			inicio=ultimo=null;
		}
	}

	public int verificarTamanho(No no){
		if (no!=null){
			return 1+verificarTamanho(no.getProximo());
		}else{
			return 0;
		}
	}

	public boolean listaVazia(){
		if(this.inicio==null&&this.ultimo==null){
			return  true;
		}else{
			return false;
		}
	}

	public void apagarLista(ListaQ1 lista){
		while (!lista.listaVazia()){
			lista.remover();
		}
	}

	public void listarProfessores(){
		atual =inicio;
		while(atual!=null){
			System.out.println(atual);
			atual=atual.getProximo();
		}
	}

	public String buscaRecursiva(No no,String nome){
		if(no==null){
			return "Sem resultado";
		}else if (no.getProfessor().getNome().equals(nome)){
			return no.getProfessor().toString();
		}else{
			return buscaRecursiva(no.getProximo(),nome);
		}
	}
}
