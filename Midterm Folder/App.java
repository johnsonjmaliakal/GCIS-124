import java.util.Set;
import java.util.TreeSet;

public class App{
    
    void mystry(int[] A){
        Set<Integer>set=new TreeSet<Integer>();
        for(int e:A){
            set.add(e);
        }
        for(int e: set){
            System.out.print(e+"");
        }
    }

    private static void main(String[] args) {
        System.out.println(mystry(5,9,4,3,2,4,5,7,9));
	}

	private static char[] mystry(int i, int j, int k, int l, int m, int n, int o, int p, int q) {
		return null;
	}
    
}