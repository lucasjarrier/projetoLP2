package usuario;

import java.io.Serializable;

/**
 * Identificador de usu�rios (nome e telefone) que funciona como chave de acesso
 * para o objeto. 
 * 
 * @author Higor
 *
 */

public class UsuarioID implements Serializable {

	private String nome;
	private String telefone;
	
	/**
	 * Constr�i um identificador atrav�s de um nome e telefone.
	 * 
	 * @param nome nome do usu�rio
	 * @param telefone telefone do usu�rio
	 */

	public UsuarioID(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioID other = (UsuarioID) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

}