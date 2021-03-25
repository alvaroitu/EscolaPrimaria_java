package funcionarios;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private String dataNascimento;
	private String estadoCivil;
	private String docIdentidade;

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nome, String sobrenome, String dataNascimento, String estadoCivil, String docIdentidade) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivil;
		this.docIdentidade = docIdentidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getDocIdentidade() {
		return docIdentidade;
	}

	public void setDocIdentidade(String docIdentidade) {
		this.docIdentidade = docIdentidade;
	}

}
