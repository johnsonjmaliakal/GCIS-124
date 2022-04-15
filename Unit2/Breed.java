
public enum Breed {
    BASSET ("Basset Hound"), 
    ABYSSINIAN ("Abyssinian"), 
    FLEMISH_GIANT ("Flemish Giant"),
    MIXED ("Mixed Heritage");

    private String breed_name;

    private Breed (String name) {
        breed_name = name;
    }
    
    @Override
    public String toString () {
        return breed_name;
    }
}
