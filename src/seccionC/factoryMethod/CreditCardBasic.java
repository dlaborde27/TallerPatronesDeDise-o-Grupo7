package seccionC.factoryMethod;

public class CreditCardBasic extends CreditCardFactory {

	@Override
	public ICard makeCard() {
		return new Basic();
	}

}
