public class Reverse {
    
    /*
    Write a function that, for a given inpur string, it returns
    the reverse of the string
    */

    public static String reverse(String s){
        String str = "";
        for(int i=s.length()-1; i>=0; i--){
            str = str + s.charAt(i);
        }
        return str;
    }
}
