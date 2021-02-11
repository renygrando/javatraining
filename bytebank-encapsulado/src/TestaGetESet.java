
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1190, 50308);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		paulo.setNome("Paulo Silveira");
		
		System.out.println(paulo.getNome());
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		System.out.println(conta.getTitular().getProfissao());
		
		
		
		
		
		
	}
}
