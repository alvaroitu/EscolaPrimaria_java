package funcionarios;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Professor p1 = new Professor();
		
		p1.setNome("Alvaro");
		p1.setSobrenome("Pereira");
		p1.setDataNascimento("11/01/1990");
		p1.setEstadoCivil(null);
		p1.setDocIdentidade(null);
		System.out.println(p1.getNome() + "xxx" + p1.getSobrenome());
		

	}

}
