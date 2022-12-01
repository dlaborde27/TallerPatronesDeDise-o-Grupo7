package seccionC.Decorator;

public class Signal extends NotificacionAdicional{

	public Signal(Notificable notificacion) {
		super(notificacion);
	}
	
	@Override
	public void notificar() {
		super.notificar();
		System.out.println("Notificado por Signal");
	}

}


