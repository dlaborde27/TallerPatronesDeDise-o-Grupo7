package seccionC.Decorator;

public abstract class NotificacionAdicional implements Notificable {
	
	private Notificable notificacion;
	
	public NotificacionAdicional(Notificable notificacion) {
		this.notificacion = notificacion;
	}
	
	@Override
	public void notificar() {
		this.notificacion.notificar();
	}
}
