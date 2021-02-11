
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario reny = new Funcionario();
		
		reny.setNome("Reny Grando");
		reny.setCpf("001.002.003-04");
		reny.setSalario(1000);
		
		System.out.println(reny.getNome());
		System.out.println(reny.getSalario());
		System.out.println(reny.getBonificacao());
	}
	
}
