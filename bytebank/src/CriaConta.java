
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.00;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50.00;
		segundaConta.agencia = 1090;
		
		System.out.println("A primeira conta tem R$ " + primeiraConta.saldo);
		System.out.println("A segunda conta tem R$ " + segundaConta.saldo);
		
		System.out.println(primeiraConta.numero);
		System.out.println(segundaConta.agencia);
		
	}
}
