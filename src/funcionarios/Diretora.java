package funcionarios;

public class Diretora extends Funcionario{
	
	public void selecionaProfessor(String nomeProfessor, String disciplina, String turma) {
		
		System.out.println("O professor " + nomeProfessor 
							+ " que ministra a disciplina " + disciplina
							+ " será responsável pela turma " + turma 
							+ " nesse semestre.");
		
	}

}
