
public class TesteSaca {
	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123, 456);
		
		conta.deposita(200);
		
		try {
			conta.saca(210.0);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println(conta.getSaldo());
		
	}
}
