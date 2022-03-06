import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args){
        File myfile = new File("alice.txt");
        try{
            FileReader myFileReader = new FileReader(myfile);
            BufferedReader myBufferedReader = new BufferedReader(myFileReader);
            String s;
            while((s = myBufferedReader.readLine()) != null){
                System.out.println(s);
            }
        }
        catch(IOException e){
            System.out.println("error in file read");
        }
        
    }
}
