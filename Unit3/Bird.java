
public class Bird implements Flyable {
    private String species;
    private String color;
    public Bird(String species, String color) {
        this.species = species;
        this.color = color;
    }
    public String getSpecies() {
        return species;
    }
    public String getColor() {
        return color;
    }
    
    @Override
    public void fly() {
        System.out.println("Fly with wings");
    }   
}



