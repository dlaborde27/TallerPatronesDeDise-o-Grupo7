package seccionC.Decorator;

public class Telegram extends NotificacionAdicional {

	public Telegram(Notificable notificacion) {
		super(notificacion);
	}
	
	@Override
	public void notificar() {
		super.notificar();
		System.out.println("Notificado por Telegram");
	}
	
}

