
public class TestaMeuPrimeiroCliente {
	public static void main(String[] args) {
		
		Cliente reny = new Cliente();
		Conta contaDoReny = new Conta(1190, 805963);
		
		contaDoReny.setTitular(reny);
		//reny.setNome("Reny Grando");
		//reny.setCpf("222.222.222-22");
		//reny.setProfissao("Programador");
		
		
		
		contaDoReny.getTitular().setNome("Reny Grando");
		contaDoReny.getTitular().setCpf("222.222.222-22");
		contaDoReny.getTitular().setProfissao("programador");
		//contaDoReny.setTitular(reny);
		//contaDoReny.setAgencia(1190);
		//contaDoReny.setNumero(805963);
		
		System.out.println(contaDoReny.getTitular().getNome());
		System.out.println(contaDoReny.getTitular().getCpf());
		System.out.println(contaDoReny.getTitular().getProfissao());
		System.out.println(contaDoReny.getAgencia());
		System.out.println(contaDoReny.getNumero());
		
	}
}
