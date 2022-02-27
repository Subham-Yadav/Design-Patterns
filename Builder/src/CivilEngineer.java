
public class CivilEngineer {
	
	private HouseBuilder builder;
	
	public CivilEngineer(HouseBuilder sampleHouse) {
		this.builder = sampleHouse;
	}
	
	public House getHouse() {
		return builder.getHouse();
	}
	
	public void makeHouse() {
		builder.buildWall();
		builder.buildRoof();
		builder.buildDoor();
		builder.buildWindow();
	}
}
