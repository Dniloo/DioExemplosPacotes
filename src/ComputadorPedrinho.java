import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstatanea;
import apps.Telegram;

public class ComputadorPedrinho {

	public static void main(String[] args) {
		ServicoMensagemInstatanea smi = null;
		
		
		String appEscolhido="tlg";
		
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
		smi.enviarMensagem();
		smi.receberMensagem();

	}

}
