
public class Teste {
	public static void main(String[] args) {
		FuncionarioTeste pipoca = new FuncionarioTeste();
		
		pipoca.setSalario(1000);
		pipoca.setTipo(3);
		System.out.println(pipoca.getBonificacao());
	}
}
