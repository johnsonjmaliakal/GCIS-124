public class Point2D {
    // attributes
    private final double x;
    private final double y;

    // constructor
    public Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    //behaviour
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    @Override
    public String toString(){
        String str = "Point2D object with coordinates x=" + x + ", and y=" + y ;
        return str;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj==null || !(obj instanceof Point2D))
            return false;
        Point2D other = (Point2D) obj ; // casting
        if(this.x != other.x || this.y != other.y)
            return false;
        return true;    
    }
    
}
