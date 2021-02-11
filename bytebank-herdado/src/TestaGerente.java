
public class TestaGerente {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Reny Grando");
		g1.setCpf("001.002.003-04");
		g1.setSalario(1000);
		g1.setSenha(1234);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		boolean autenticou = g1.autentica(1234);
		
		System.out.println(autenticou);
		System.out.println(g1.getBonificacao());

	}
}
