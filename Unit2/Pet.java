
public abstract class Pet {

    private int age;
    private String owner;
    private final String color;

    protected Pet(String color){
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public abstract void makeSound();
    public abstract void play();
}

