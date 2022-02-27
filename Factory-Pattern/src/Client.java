import com.toy.*;

public class Client {

	public static void main(String[] args) {
		ToyFactory tf = new ToyFactory();
		ToyAnimal toy = tf.getInstance("dog");
		toy.speak();
	}

}
