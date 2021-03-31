package funcionarios;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Professor p1 = new Professor();
		Professor p2 = new Professor();
		Diretora d1 = new Diretora();

		p1.setNome("Alvaro");
		p1.setSobrenome("Pereira");
		p1.setDisciplina("Matematica");

		p2.setNome("Will");
		p2.setSobrenome("Smith");
		p2.setDisciplina("Portugues");

		d1.setNome("Maria");
		d1.setSobrenome("da Silva");

		System.out.println("A diretora " + d1.getNome() + d1.getSobrenome() + " passou as seguintes ordens...");
		System.out.println("Ordem 1 :");
		d1.selecionaProfessor(p1.getNome() + " " + p1.getSobrenome(), p1.getDisciplina(), "A e B");
		System.out.println("Ordem 2 :");
		d1.selecionaProfessor(p2.getNome() + " " + p2.getSobrenome(), p2.getDisciplina(), "B e C");

	}

}
