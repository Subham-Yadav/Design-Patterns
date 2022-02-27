
public class Client {

	public static void main(String[] args) {
		CloneFactory factory = new CloneFactory();
		Sheep sheep = new Sheep();
		
		System.out.println(sheep);
		Sheep clonedSheep = (Sheep)factory.getClone(sheep);
		System.out.println(clonedSheep);
		
		System.out.println("Sheep: " + sheep.hashCode());
		System.out.println("Cloned sheep: " + clonedSheep.hashCode());
	}
}
