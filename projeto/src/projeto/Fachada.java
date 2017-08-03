package projeto;

import easyaccept.EasyAccept;

public class Fachada {

	public static void main(String[] args) {
		args = new String[] {"projeto.Fachada", "projeto/acceptance_test/us1_test.txt", "projeto/acceptance_test/us2_test.txt",
				"projeto/acceptance_test/us3_test.txt", "projeto/acceptance_test/us4_test.txt"};
	    EasyAccept.main(args);
		
	}
	private Sistema sistema;
	
	public void iniciarSistema() throws Exception {
		this.sistema = new Sistema();
	}
	
	/**
	 * METODOS DE CADASTRO.
	 */
	
	public void cadastrarUsuario(String nome, String email, String telefone) throws Exception {
		sistema.cadastraUsuario(nome,email,telefone);
	}
	public void cadastraItem(int usuario, String nome) throws Exception {
		sistema.cadastraItem(usuario, nome);
	}

	/**
	 * METODOS DE MANIPULA��O.
	 */

	public void atualizaUsuario(int posicao,String nome, String email, String telefone) throws Exception {
		sistema.atualizaUsuario(posicao, nome, email, telefone);
	}
	
	public void deletaUsuario(int posicao) throws Exception {
		sistema.deletaUsuario(posicao);
	}
	
	public void atualizaItem(int usuario, int item, EstadoItem estado) throws Exception {
		sistema.atualizaItem(usuario, item, estado);
	}
	
	public void deletaItem(int usuario, int item) throws Exception {
		sistema.deletaItem(usuario, item);
	}
}
