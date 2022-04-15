
public class FlayableTest {
    public static void main(String[] args){

        Flyable flyable = new Bird("sparrow","eagle");
        flyable.fly();
        flyable = new Rocket("Apollo-11");
        flyable.fly();
    }
    
}

