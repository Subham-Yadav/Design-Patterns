
public class RedDecoration extends ShoeDecorator{

	public RedDecoration(Shoes shoe) {
		super(shoe);
	}
	
	
	public void name() {
		decoratedShoe.name();
		setRedColor(decoratedShoe);
	}
	
	private void setRedColor(Shoes decoratedShoe) {
		System.out.println("Shoe color: Red");
	}
}
