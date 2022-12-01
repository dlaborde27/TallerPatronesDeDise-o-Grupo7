package seccionC.Decorator;

public class Cliente {
	public static void main(String[] args) {
		Notificable notificacion = new Mensaje(); // notificacion normal
		notificacion = new WhatsApp(notificacion); // agregar notificacion con WhatsApp
		notificacion = new Signal(notificacion); // agregar notificacion con Signal
		notificacion.notificar();
	}
}
