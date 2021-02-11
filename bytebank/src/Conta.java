class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println(this.titular + " você sacou R$" + valor);
			return true;
		} else {
			System.out.println(this.titular + " você tentou fazer um saque no valor de R$" + valor + " porém seu saldo é insuficiente.");
			return false;
		}
		
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			saca(valor);
			destino.deposita(valor);
			System.out.println(this.titular + " você transferiu o valor de R$ " + valor + " para " + destino.titular);
			return true;
		} 
		return false;
	}
	
}