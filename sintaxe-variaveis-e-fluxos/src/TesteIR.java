public class TesteIR {

	public static void main(String[] args) {

		double salario = 2600;

		if (salario < 2600.0) {
			System.out.println("A sua aliquota é de 15%");
			System.out.println("Você pode deduzir até R$ 350");
		}
		if (salario >= 2600.0) {
			System.out.println("A sua aliquota é de 22,5%");
			System.out.println("Você pode deduzir até R$ 636");
		}
	}
}