
public class TestaCondicionalNovamente {
	public static void main(String[] args) {
		int idade = 18;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2;
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Ok! você está liberadx para entrar!");
		} else {
			System.out.println("opa! Peraí, você não pode entrar!");
		}
	}
}
