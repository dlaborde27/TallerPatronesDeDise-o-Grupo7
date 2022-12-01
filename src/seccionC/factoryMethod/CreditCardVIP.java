package seccionC.factoryMethod;

public class CreditCardVIP extends CreditCardFactory {

	@Override
	public ICard makeCard() {
		return new VIP();
	}

}
