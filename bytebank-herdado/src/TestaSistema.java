
public class TestaSistema {

	public static void main(String[] args) {
		
		Autenticavel gerente = new Gerente();
		Autenticavel administrador = new Administrador();
		Autenticavel cliente = new Cliente();
		
		SistemaInterno si = new SistemaInterno();
		
		gerente.setSenha(2222);
		administrador.setSenha(2221);
		cliente.setSenha(2222);
		
		si.autentica(gerente);
		si.autentica(administrador);
		si.autentica(cliente);
		
		

	}

}
