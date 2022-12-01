package seccionC.factoryMethod;

public abstract class CreditCardFactory {
	protected double limit;
	protected double charge;
	
	public abstract ICard makeCard();
	public void pay() {
		ICard card = makeCard();
		card.payment();
	}
}
