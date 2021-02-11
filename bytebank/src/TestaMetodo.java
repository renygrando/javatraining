
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoReny = new Conta();
		contaDoReny.titular = "Reny";
		Conta contaDaNathany = new Conta(); 
		contaDaNathany.titular = "Nathany";
		
		contaDoReny.deposita(50);
		System.out.println(contaDoReny.titular + " seu saldo é de R$" + contaDoReny.saldo);
		contaDaNathany.deposita(50);
		System.out.println(contaDaNathany.titular + " seu saldo é de R$" + contaDaNathany.saldo);
		contaDoReny.saca(10);
		System.out.println(contaDoReny.titular + " seu saldo agora é de R$ " + contaDoReny.saldo);
		
		boolean sucessoTransferencia = contaDoReny.transfere(100, contaDaNathany);
		if(sucessoTransferencia) {
			System.out.println("transferência com sucesso!");
		} else {
			System.out.println("Saldo insuficiênte para transferir");
		}
		System.out.println(contaDaNathany.titular + " seu saldo é de R$ " + contaDaNathany.saldo);
	}
	
}
