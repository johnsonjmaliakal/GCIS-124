
public class PolymorphismTest {

    private static void showPolymorphism(Pet pet){
        pet.makeSound();
        pet.play();
    }

    public static void main(String[] args){
        Cat myCat = new Cat("grey");
        Dog myDog = new Dog("black");

        myCat.setAge(3);
        myCat.setOwner("Waleed");
        myDog.setAge(4);
        myDog.setOwner("Hasan");

        showPolymorphism(myCat);
        showPolymorphism(myDog);
    }
}

