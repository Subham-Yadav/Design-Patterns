
public class FactoryProducer {
	public static AbstractFactory getFactory(String name) {
		if(name.equalsIgnoreCase("Toy")) {
			return new ToyFactory();
		} else {
			return new RecycleFactory();
		}
	}
}
