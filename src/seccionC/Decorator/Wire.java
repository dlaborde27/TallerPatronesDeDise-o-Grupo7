package seccionC.Decorator;

public class Wire extends NotificacionAdicional{

	public Wire(Notificable notificacion) {
		super(notificacion);
	}
	
	@Override
	public void notificar() {
		super.notificar();
		System.out.println("Notificado por Wire");
	}
	
}


