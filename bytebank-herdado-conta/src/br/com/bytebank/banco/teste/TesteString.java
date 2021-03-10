package br.com.bytebank.banco.teste;

public class TesteString {
	public static void main(String[] args) {
		
		String nome = "Reny"; //object literal
		String outro = new String("Alura");
		
		String novo = outro.replace("A", "a");
		String nomeNovo = nome.replace("y", "i");
		
		System.out.println(novo);
		System.out.println(nomeNovo);
		
		char caracter = nome.charAt(2);
		System.out.println(caracter);
		
		int position = nome.indexOf("ny");
		System.out.println(position);
		
		String sub = nome.substring(2);
		System.out.println(sub);
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		
	}
}
