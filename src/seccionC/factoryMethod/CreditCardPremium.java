package seccionC.factoryMethod;

public class CreditCardPremium extends CreditCardFactory {

	@Override
	public ICard makeCard() {
		return new Premium();
	}

}
