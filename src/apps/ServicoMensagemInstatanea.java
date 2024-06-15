package apps;

public abstract class ServicoMensagemInstatanea {
	
	public abstract void enviarMensagem();
	public abstract void receberMensagem();

	
	public abstract void salverHistoricoMensagem();
	//Somente os filhs conhecem este metodo
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado!!!");
	}

}
