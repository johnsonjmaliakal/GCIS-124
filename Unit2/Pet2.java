
public class Pet2 {

    private String name;
    private Breed breed;
    private int age;
    public static final int MIN_AGE = 1 ;

    public Pet2(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public Pet2(String name, Breed breed) {
        this.name = name;
        this.breed = breed;
        this.age = MIN_AGE;
    }

    @Override
    public String toString() {
        return "Pet2 [age=" + age + ", breed=" + breed + ", name=" + name + "]";
    }
}

