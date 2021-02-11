
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		System.out.println(contaDoPaulo.getSaldo());
		contaDoPaulo.saca(10);
		System.out.println(contaDoPaulo.getSaldo());
	}
}
