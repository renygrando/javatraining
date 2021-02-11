
public class TesteReferencias {
	public static void main(String[] args) {
		
		Gerente gerente  = new Gerente();
		
		gerente.setNome("Reny Grando");
		gerente.setSalario(5000.0);
		
		EditorVideo editorVideo = new EditorVideo();
		editorVideo.setSalario(2500.0);
		
		Designer designer = new Designer();
		designer.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(gerente);
		System.out.println(gerente.getBonificacao());
		
		controle.registra(editorVideo);
		System.out.println(editorVideo.getBonificacao());
		
		controle.registra(designer);
		System.out.println(designer.getBonificacao());
		
		System.out.println(controle.getSoma());
	}
}
