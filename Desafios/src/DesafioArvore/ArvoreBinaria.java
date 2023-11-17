package DesafioArvore;

public class ArvoreBinaria {
	
	private No raiz;
	
	
	//instanciando uma �rvore... sem dados... logo a sua raiz � null
	public ArvoreBinaria() {
		raiz = null;
	}
	
	//vamos pensar na busca de elementos
	public boolean vazia() {
		return (raiz == null);
	}

	//metodo de busca apenas para retornar as dreferencias de hierarquias
	public No busca(int valor) {
		if (vazia())
			return null;

		return busca(raiz, valor);
	}

	//vamos pensar em um m�todo de busa
	
	private No busca (No T, int valor) {
		if (T == null)
			return null;
		
		//condi��o de parada
		if(T.getConteudo() == valor) {
			return T; // retornei T pq encontrei o elemento
		}
			
		//vamos pensar em um caso recursivo 
		No aux = busca(T.getEsq(), valor);
		if (aux == null) 
			aux = busca(T.getDir(), valor);
		
		return aux;
		
	}
	
	// metodo para inserir (raiz, esq, dir) ent�o ser�o 3 m�todos        | |       | |
	// inserir raiz 
	public boolean insereRaiz (int valor) {
		if(raiz != null)
			return false; // professora a arvore j� tem uma raiz
		
		No novoNo = new No();
		novoNo.setConteudo(valor);
		novoNo.setEsq(null);
		novoNo.setDir(null);
		
		raiz = novoNo;
		return true;
	}

		
	//insere direita
	
	public boolean insereDir(int vPai, int vFilho) {
		
		//verificar se o elemento j� existe
		No filho = busca(vFilho);
		if(filho != null)
			return false; //o dado j� existe por isso deu erro
		
		No pai = busca(vPai);
		if (pai == null)
			return false; // n�o existe esse n� pai
		
		if (pai.getDir() != null)
			return false; // olha bem.. um no s� pode ter 2 filhos,,, um na esq e outro na dir... e j� tem um na direita remova e depois insira
		
		No novoNo = new No(); // cria a casinha
		novoNo.setConteudo(vFilho);
		novoNo.setEsq(null);
		novoNo.setDir(null);
		pai.setDir(novoNo);
		
		return true;
		
	}

	//insere esquerda
	public boolean insereEsq(int vPai, int vFilho) {

		//verificar se o elemento j� existe
		No filho = busca(vFilho);
		if(filho != null)
			return false; //o dado j� existe por isso deu erro

		No pai = busca(vPai);
		if (pai == null)
			return false; // n�o existe esse n� pai

		if (pai.getEsq() != null)
			return false; // olha bem.. um no s� pode ter 2 filhos,,, um na esq e outro na dir... e j� tem um na direita remova e depois insira

		No novoNo = new No(); // cria a casinha
		novoNo.setConteudo(vFilho);
		novoNo.setEsq(null);
		novoNo.setDir(null);
		pai.setEsq(novoNo);

		return true;

	}
	
	
	// imprimir os dados 
	//pre ordem
	
	private void exibePreOrdem(No T) {
		if(T == null)
			return;
		
		System.out.print(" " + T.getConteudo());
		
		if(T.getEsq() != null)
			exibePreOrdem(T.getEsq());
		
		if(T.getDir() != null)
			exibePreOrdem(T.getDir());		
	}
	
	public void exibePreOrdem() {
		if(raiz == null)
			System.out.println("Sua �rvore n�o possui elementos.. ela est� vazia");
		else
			exibePreOrdem(raiz);
	}


	// inordem
	private void exibeEmOrdem(No T) {
		if(T == null)
			return;

		if(T.getEsq() != null)
			exibeEmOrdem(T.getEsq());

		System.out.print(" " + T.getConteudo());

		if(T.getDir() != null)
			exibeEmOrdem(T.getDir());
	}

	public void exibeEmOrdem() {
		if(raiz == null)
			System.out.println("Sua �rvore n�o possui elementos.. ela est� vazia");
		else
			exibeEmOrdem(raiz);
	}


	//posordem
	private void exibePosOrdem(No T) {
		if(T == null)
			return;

		if(T.getEsq() != null)
			exibePosOrdem(T.getEsq());

		if(T.getDir() != null)
			exibePosOrdem(T.getDir());

		System.out.print(" " + T.getConteudo());
	}

	public void exibePosOrdem() {
		if(raiz == null)
			System.out.println("Sua �rvore n�o possui elementos.. ela est� vazia");
		else
			exibePosOrdem(raiz);
	}
	

}
