

public class Pet2Test {
    public static void main(String[] args){
        Pet2 p1 = new Pet2("cat", Breed.ABYSSINIAN); // age = 1
        Pet2 p2 = new Pet2("dog",Breed.BASSET, 3);
        System.out.println(p1);
        System.out.println(p2);
    }

}

