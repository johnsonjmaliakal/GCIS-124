
public class PetTest {

    public static void main(String[] args){
        Cat myCat = new Cat("grey");
        Dog myDog = new Dog("black");

        myCat.setAge(3);
        myCat.setOwner("Waleed");
        myDog.setAge(4);
        myDog.setOwner("Hasan");

        myCat.makeSound();
        myCat.play();
        myCat.huntMice();

        myDog.makeSound();
        myDog.play();
        myDog.scareStrangers();
    }
}


