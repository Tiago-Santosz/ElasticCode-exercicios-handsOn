package heranca.abstract_140;

public class ProgramTrab {

	public static void main(String[] args) {
		
		TrabalhadorPorComissao [] trabalhadorporcomissao = new TrabalhadorPorComissao[2];
		trabalhadorporcomissao[0] = new TrabalhadorPorComissao("330001B", 2, "Maria Batista");
		trabalhadorporcomissao[1] = new TrabalhadorPorComissao("350601B", 3, "Milena Joaquina ");
		
		Chefe[] chefe = new Chefe[2];
		chefe[0] = new Chefe("Marcos","Silveriano", "2900803A",5);
		chefe[1] = new Chefe("Jackson", "Miliano",  "2900819B", 1);
		
		
		System.out.println("Legislacao do Seguro: " + SeguroSaude.LEGISLACAO);
		
		for(TrabalhadorPorComissao trab: trabalhadorporcomissao ) {
			System.out.println("Matricula do Plano: " + trab.getMatriculaPlano());
			System.out.println("Nome Completo do Titular: " + trab.getNomeCompletoTitular());
			System.out.println("Quantidade de Dependentes: " + trab.getQtdeDependentes());
			System.out.println("---------------------------------------------------");
		}
		
		for(Chefe trab1: chefe ) {
			System.out.println("Matricula do Plano: " + trab1.getMatriculaPlano());
			System.out.println("Nome Completo do Titular: " + trab1.getNomeCompletoTitular());
			System.out.println("Quantidade de Dependentes: " + trab1.getQtdeDependentes());
			
			System.out.println("---------------------------------------------------");
		}
		
		
	}

}
