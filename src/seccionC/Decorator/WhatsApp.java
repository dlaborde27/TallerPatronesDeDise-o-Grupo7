package seccionC.Decorator;

public class WhatsApp extends NotificacionAdicional{

	public WhatsApp(Notificable notificacion) {
		super(notificacion);
	}
	
	@Override
	public void notificar() {
		super.notificar();
		System.out.println("Notificado por WhatsApp");
	}

}
