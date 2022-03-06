import java.io.File;

public class FileDemo0 {
    public static void main(String[] args){
        File f = new File("alice.txt");
        System.out.println(f.exists()); // true
        System.out.println(f.getName()); // alice.txt
        System.out.println(f.getPath());  // alice.txt
        System.out.println(f.getAbsolutePath()); // C:\.../alice.txt
        System.out.println(f.isFile());  // true
        System.out.println(f.isDirectory()); // false
        System.out.println(f.length());
    }
}
