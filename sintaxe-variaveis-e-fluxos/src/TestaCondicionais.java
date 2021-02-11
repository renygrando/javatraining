
public class TestaCondicionais {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 17;
		boolean acompanhado = false;
		if(idade >= 18) {
			System.out.println("Você tem " + idade +" anos, então pode entrar!");
		} else {
			if(acompanhado == true) {
			System.out.println("Você tem " + idade + " porém está acompanhado, então pode entrar!");
			} else {
				System.out.println("Voce tem " + idade + " e está sozinho(a), então NÃO pode entrar!");
			}
		}
	}
}
