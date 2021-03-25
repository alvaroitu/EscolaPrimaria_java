package funcionarios;

public class Professor extends Funcionario {

	private String disciplina;
	private int quantidadeSalasNesseSemestre;

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Professor(String nome, String sobrenome, String dataNascimento, String estadoCivil, String docIdentidade) {
		super(nome, sobrenome, dataNascimento, estadoCivil, docIdentidade);
		// TODO Auto-generated constructor stub
	}

	public Professor(String cargo, String dataAdmissao) {
		super(cargo, dataAdmissao);
		// TODO Auto-generated constructor stub
	}

	public Professor(String disciplina, int quantidadeSalasNesseSemestre) {
		super();
		this.disciplina = disciplina;
		this.quantidadeSalasNesseSemestre = quantidadeSalasNesseSemestre;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public int getQuantidadeSalasNesseSemestre() {
		return quantidadeSalasNesseSemestre;
	}

	public void setQuantidadeSalasNesseSemestre(int quantidadeSalasNesseSemestre) {
		this.quantidadeSalasNesseSemestre = quantidadeSalasNesseSemestre;
	}

}
