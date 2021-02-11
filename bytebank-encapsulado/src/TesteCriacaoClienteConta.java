
public class TesteCriacaoClienteConta {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1190, 805963);
		
		Cliente reny = new Cliente();
		
		
		conta.setTitular(reny);
		
		conta.getTitular().setNome("Reny Grando");
		conta.getTitular().setCpf("222.222.222-22");
		conta.getTitular().setProfissao("programador");
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getCpf());
		System.out.println(conta.getTitular().getProfissao());
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		System.out.println("O total de contas é: " + Conta.getTotal());
		
	}
}
