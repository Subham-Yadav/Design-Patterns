
public class ToyFactory extends AbstractFactory{
	public Product getProduct(String name) {
		if(name.equalsIgnoreCase("Dog")) {
			return new Dog();
		} else {
			return new Cat();
		}
	}
}
