
public class TestaFuncionario {
	public static void main(String[] args) {
		
		Funcionario reny = new Gerente();
		
		reny.setNome("Reny Grando");
		reny.setCpf("001.002.003-04");
		reny.setSalario(2000.00);
		
		System.out.println(reny.getNome());
		System.out.println(reny.getBonificacao());
	}
}
