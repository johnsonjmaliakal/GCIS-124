import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileDemo2 {
    public static void main(String[] args){
        try(FileWriter myFileWriter = new FileWriter("a.txt");
            PrintWriter myPrintWriter = new PrintWriter(myFileWriter);){
                myPrintWriter.write("try-with-resource is awesome!");
                myPrintWriter.flush();
        }
        catch(IOException e){
            System.out.println("error in file write");
        }
    }
}
