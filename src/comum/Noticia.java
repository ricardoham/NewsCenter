package comum;

import java.io.Serializable;
import java.util.Date;

public class Noticia extends Cliente {
	private Date data;
	private String titulo;
	private String local;
	private Cliente reporter;
	private String IP;
	private String texto;
	private String imagem;

	
	public Noticia() {
		this.data = new Date();		
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Cliente getReporter() {
		return reporter;
	}

	public void setReporter(Cliente reporter) {
		this.reporter = reporter;
	}

	public String getIP() {
		return IP;
	}

	public void setIP(String iP) {
		IP = iP;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
