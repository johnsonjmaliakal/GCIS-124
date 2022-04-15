
public class Cat extends Pet {

    public Cat(String color) {
        super(color);
    }

    @Override
    public void makeSound() {
        System.out.println("meaw");
    }

    @Override
    public void play() {
        System.out.println("play with yarn");
    }

    public void huntMice(){
        System.out.println("hunting mice");
    }
}

