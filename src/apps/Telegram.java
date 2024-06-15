package apps;
public class Telegram extends ServicoMensagemInstatanea  {

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		// TODO Auto-generated method stub
		System.out.println("Enviando mensagem pelo Telegram Messenger");
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Enviando mensagem pelo Telegram Messenger");
	}

	@Override
	public void salverHistoricoMensagem() {
		// TODO Auto-generated method stub
		
	}
	
	

}
