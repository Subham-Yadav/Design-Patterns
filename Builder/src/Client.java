
public class Client {

	public static void main(String[] args) {
		HouseBuilder builder = new ClassicHouseBuilder();
		
		CivilEngineer engineer = new CivilEngineer(builder);
		engineer.makeHouse();
		
		House newHouse = engineer.getHouse();
		
		System.out.println("House walls: " + newHouse.getWall());
		System.out.println("House door: " + newHouse.getDoor());
		System.out.println("House roof: " + newHouse.getRoof());
		System.out.println("House winodows: " + newHouse.getWindow());
		
	}

}
