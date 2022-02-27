public class Main {
  
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
  
        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
    }
}

enum SingletonEnum {
    INSTANCE;
    int value;
  
    public int getValue() {
        return value;
    }
  
    public void setValue(int value) {
        this.value = value;
    }
}


//Advantages
//Easy to write
// Handle serialization by themselves
// Thread safe -> no need of double checked lock