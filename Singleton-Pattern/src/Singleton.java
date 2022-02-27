//

//public class Singleton {
//
//	public static void main(String[] args) {
//		Demo demo = Demo.getInstance();
//		Demo demo2 = Demo.getInstance();
//		
//		System.out.println("demo: " + demo.hashCode());
//		System.out.println("demo2: " + demo.hashCode());
//		
//	}
//
//}

//class Demo{
//	private static Demo demo = new Demo();
//	
//	private Demo() {
//		System.out.println("Instance created!");
//	}
//	
//	public static Demo getInstance() {
//		return demo;
//	}
//}

//Method 2(Its in the memory even if it is not used => static variables/instances are created while loading class)

public class Singleton{

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				Demo demo = Demo.getInstance();
				System.out.println("demo: " + demo.hashCode());
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				Demo demo2 = Demo.getInstance();
				System.out.println("demo2: " + demo2.hashCode());
			}
		};
		
		t1.start();
		t2.start();
	}

}

class Demo{
	public static Demo demo;
	
	private Demo() {
		System.out.println("Instance created");
	}
	
//	public static Demo getInstance() {
//		if(demo == null) {
//			demo = new Demo();
//		}
//		return demo;
//	}
	
	public static Demo getInstance() {
		if(demo == null) {
			synchronized (Demo.class) {
				if(demo==null) {
					demo = new Demo();
				}
			}
			
		}
		return demo;
	}
}
