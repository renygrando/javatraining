class Conta {
	//Esses são valores referentes à instância
	//para acessarmos esses utilizamos o this.
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	// Esses são valores referentes à classe
	// para acessarmso esses utilizamos o nome da classe, Conta.
	private static int total = 0;
	
	//este aqui é o contrutor que nós criamos. Contrutor padrão o java ja coloca automaticamente.
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		total++;
		System.out.println("Criando uma nova conta");
	}
		
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} 
		return false;
		
		
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			saca(valor);
			destino.deposita(valor);
			return true;
		} 
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
	public static int getTotal(){
		return Conta.total;
	}
	
	
}