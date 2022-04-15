
public class Dog extends Pet {

    public Dog(String color) {
        super(color);
    }

    @Override
    public void makeSound() {
        System.out.println("bark");
    }

    @Override
    public void play() {
        System.out.println("play fetch");
    }

    public void scareStrangers(){
        System.out.println("barking at strangers");
    }
}

