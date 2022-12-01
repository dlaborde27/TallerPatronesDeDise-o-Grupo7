package seccionC.Decorator;

public class Mensaje implements Notificable{

	@Override
	public void notificar() {
	   System.out.println("notificado por mensaje SMS y por correo electrónico");
	}

}
