
public abstract class ShoeDecorator implements Shoes{
	protected Shoes decoratedShoe;
	
	public ShoeDecorator(Shoes shoe) {
		this.decoratedShoe = shoe;
	}
	
	public void name() {
		decoratedShoe.name();
	}
}
