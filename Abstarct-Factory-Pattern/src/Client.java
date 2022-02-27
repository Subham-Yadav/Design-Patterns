
public class Client {

	public static void main(String[] args) {
		AbstractFactory factory = FactoryProducer.getFactory("Toy");
		Product p1 = factory.getProduct("Dog");
		p1.name();
		Product p2 = factory.getProduct("Cat");
		p2.name();
		
		AbstractFactory factory2 = FactoryProducer.getFactory("Recycle");
		Product p3 = factory2.getProduct("Board");
		p3.name();
		Product p4 = factory2.getProduct("Grain");
		p4.name();
	}

}
