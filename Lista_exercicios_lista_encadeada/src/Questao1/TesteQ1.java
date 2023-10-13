package Questao1;

public class TesteQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TesteQ1 testaListaEncadeada = new TesteQ1();
		ListaQ1 listaEncadeada = new ListaQ1();
		
		System.out.println("Vamos começar adicionando os contatos");
		testaListaEncadeada.addContato(listaEncadeada);
		System.out.println("Seus contatos foram adicionados na lista");
		
		//agora prof? como fazer para testar, ou melhor listar esses contato?? 
		System.out.println("Provando que os contatos foram adicionados");
		listaEncadeada.listarProfessores();
		
	//agora vamos remover
		System.out.println("Mostra a remoção prof");
		testaListaEncadeada.removerContato(listaEncadeada);
		System.out.println("Contato removido com sucesso");
		System.out.println("Depois da remoção a lista ficou assim");
		listaEncadeada.listarProfessores();
		System.out.println(listaEncadeada.buscaRecursiva(listaEncadeada.getInicio(),"Osvaldo"));
		listaEncadeada.apagarLista(listaEncadeada);
		System.out.println(listaEncadeada.listaVazia());

		

	}
	
	public void addContato(ListaQ1 listaEncadeada) {
		Professor p1 = new Professor("Angela", "Estrutura de dados");
		Professor p2 = new Professor("Osvaldo", "Raciocinio Logico");
		Professor p3 = new Professor("Fernado", "LPA");
		Professor p4 = new Professor("Semiramis", "Programação WEB");
		Professor p5 = new Professor("Marco", "Redes");
		
		listaEncadeada.add(p1);// |Alex | |-->
		listaEncadeada.add(p2);// |Alex | |-->| Ester| |-->
		listaEncadeada.add(p3);// |Alex | |-->| Ester| |-->|Big| |-->
		listaEncadeada.add(p4);// |Alex | |-->| Ester| |-->|Big| |--> |Felipe| |-->
		listaEncadeada.add(p5);// |Alex | |-->| Ester| |-->|Big| |--> |Felipe| |-->|Dandara| |-->
	}
	
	public void removerContato(ListaQ1 listaEncadeada) {
		listaEncadeada.remover();
		listaEncadeada.remover();
	}

}
