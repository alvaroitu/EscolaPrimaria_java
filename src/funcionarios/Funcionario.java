package funcionarios;

public class Funcionario extends Pessoa {

	private String cargo;
	private String dataAdmissao;

	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String nome, String sobrenome, String dataNascimento, String estadoCivil, String docIdentidade) {
		super(nome, sobrenome, dataNascimento, estadoCivil, docIdentidade);
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String cargo, String dataAdmissao) {
		super();
		this.cargo = cargo;
		this.dataAdmissao = dataAdmissao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

}
