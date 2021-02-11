
public class CalculoIR {
	public static void main(String[] args) {
		double salario = 3300.0;
		boolean foraDaFaixaSalarialParaDeclaracao = salario <= 1900.0;
		boolean primeiraFaixaSalarial = salario >= 1900.0 && salario <= 2800.0;
		boolean segundaFaixaSalarial = salario > 2800.0 && salario <= 3751.0;
		boolean terceiraFaixaSalarial = salario > 3751.0;
		
		if(foraDaFaixaSalarialParaDeclaracao) {
			System.out.println("Você não precisa declarar o IR");
		} else {
			if(primeiraFaixaSalarial) {
				System.out.println("Sua al�quota de IR � de 7.5% e poderá deduzir um valor de R$ 142,00");
			}
			if(segundaFaixaSalarial) {
				System.out.println("Sua alíquota de IR é de 15% e poderá deduzir um valor de R$ 350,00");
			}
			if(terceiraFaixaSalarial) {
				System.out.println("Sua alíquota de IR é de 22.5% e poderá deduzir um valor de R$ 636,00");
			}
		}
		
	}
}
