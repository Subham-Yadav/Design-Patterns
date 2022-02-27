
public class Sheep implements Animal{
	public Sheep() {
		System.out.println("Sheep is made");
	}
	
	public Animal makeCopy() {
		System.out.println("Sheep is being made");
		
		Sheep clonedSheep = null;
		
		try {
			clonedSheep = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clonedSheep;
	}

	@Override
	public String toString() {
		return "I am sheep";
	}
}
