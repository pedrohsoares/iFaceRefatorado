
public class Mensagem
{
	private String mensagem;
	private Conta remetente;
	private Conta destinatario;
	
	public Mensagem(Conta remetente, Conta destinatario, String mensagem) {
		this.remetente = remetente;
		this.destinatario = destinatario;
		this.mensagem = mensagem;
	}

	public Conta getRemetente() {
		return remetente;
	}

	public void setRemetente(Conta remetente) {
		this.remetente = remetente;
	}

	public Conta getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Conta destinatario) {
		this.destinatario = destinatario;
	}

	public String getMensagem()
	{
		return this.mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
