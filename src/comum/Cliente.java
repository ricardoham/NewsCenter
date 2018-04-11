package comum;

import java.io.Serializable;

//import java.io.Serializable;

public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	
	protected String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
}
