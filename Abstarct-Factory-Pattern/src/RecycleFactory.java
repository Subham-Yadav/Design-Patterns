
public class RecycleFactory extends AbstractFactory{
	public Product getProduct(String name) {
		if(name.equalsIgnoreCase("Board")) {
			return new Board();
		} else {
			return new Grains();
		}
	}
}
