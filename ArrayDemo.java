public class ArrayDemo {

    public static void main(String[] args){
        // let us create the multiplication table of size 4x3
        int[][] table = new int[4][3];

        for(int i=0; i<table.length; i++)
          for(int j=0; j<table[0].length; j++)
             table[i][j] = (i+1)*(j+1); 
        
        for(int i=0; i<table.length; i++){
            for(int j=0; j<table[0].length; j++)  
                System.out.print(table[i][j] + " ");
            System.out.println("\n");    
        }   
    }

    
}
