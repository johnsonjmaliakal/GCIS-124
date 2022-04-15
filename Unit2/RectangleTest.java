

public class RectangleTest {

    private static void updateWithRandomParameters(Rectangle rc){

        double width =  Math.random() * 10;
        double height =  Math.random() * 10;
        rc.setWidth(width);
        rc.setHeight(height);
    }

    public static void main(String[] args){
        Rectangle rc = new Rectangle();
        updateWithRandomParameters(rc);
        System.out.println("Circle area is " + rc.getArea());
        System.out.println();
    }
}

