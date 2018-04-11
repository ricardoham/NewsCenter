package comum;



public class Pacote_Disconnect extends Cliente 
{
	private static final long serialVersionUID = 1L;
    private final String nome;
	private final String endereco;
    private final int porta;

    public Pacote_Disconnect(String name, String end, int port)
    {
    	this.nome = name;
        this.endereco = end;
        this.porta = port;
    }

    public String getNome()
    {
        return nome;
    }
    public String getEndereco()
    {
        return endereco;
    }
    public int getPorta()
    {
        return porta;
    }

    

    
}
