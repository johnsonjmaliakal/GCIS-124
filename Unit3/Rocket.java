
public class Rocket implements Flyable {
    private String name;

    public Rocket(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    @Override
    public void fly() {
        System.out.println("Fly with engine");    
    }   
}

