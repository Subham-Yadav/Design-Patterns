
public class House implements HousePlan{
	private String wall;
	private String roof;
	private String door;
	private String window;
	
	public void setWalls(String color) {
		this.wall = color;
	}
	
	public void setRoof(String color) {
		this.roof = color;
	}
	
	public void setDoor(String material) {
		this.door = material;
	}
	
	public void setWindow(String material) {
		this.window = material;
	}
	
	public String getWall() {
		return this.wall;
	}
	
	public String getRoof() {
		return this.roof;
	}
	
	public String getDoor() {
		return this.door;
	}
	
	public String getWindow() {
		return this.window;
	}
}
