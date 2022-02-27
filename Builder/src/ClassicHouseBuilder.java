
public class ClassicHouseBuilder implements HouseBuilder{
	private House house;
	
	public ClassicHouseBuilder() {
		this.house = new House();
	}

	@Override
	public void buildWall() {
		house.setWalls("Red");
	}

	@Override
	public void buildRoof() {
		house.setRoof("Black");
	}

	@Override
	public void buildDoor() {
		house.setDoor("Wooden");
	}

	@Override
	public void buildWindow() {
		house.setWindow("Glass");
	}

	@Override
	public House getHouse() {
		return this.house;
	}
	
	
}
