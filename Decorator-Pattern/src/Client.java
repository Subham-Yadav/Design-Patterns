
public class Client {

	public static void main(String[] args) {
		Shoes shoe = new Nike();
		Shoes redNike = new RedDecoration(new Nike());
		Shoes redPuma = new RedDecoration(new Puma());
		
		System.out.println("Normal Nike: ");
		shoe.name();
		
		System.out.println("Red Nike: ");
		redNike.name();
		
		System.out.println("Red Puma: ");
		redPuma.name();
	}

}
