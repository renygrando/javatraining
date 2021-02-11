
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200.00;
		
		Conta segundaConta = primeiraConta;
		
		System.out.println(segundaConta.saldo);
		
		segundaConta.saldo += 100.00;
		
		System.out.println(primeiraConta.saldo);
	}
}
