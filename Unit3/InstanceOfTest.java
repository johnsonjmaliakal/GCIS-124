
public class InstanceOfTest {

    private static int countOfDogs = 0;
    private static int countOfCats = 0;

    private static void count(Pet[] pets){
        for(int i=0; i<pets.length; i++)
            if(pets[i] instanceof Cat) 
                countOfCats++;
            else if(pets[i] instanceof Dog)
                countOfDogs++;
    }
    public static void main(String[] args){
        Pet[] arr = new Pet[100];
        for(int i=0; i<100; i++){
            if(Math.random() < 0.5){
                if(Math.random() < 0.5)
                    arr[i] = new Cat("Grey");
                else
                    arr[i] = new Dog("Black");                
            }
        }
        count(arr);
        System.out.println("count of dogs = " + countOfDogs);
        System.out.println("count of cats = " + countOfCats);
    }
}

