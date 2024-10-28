import java.util.*;
abstract class Shape {
public abstract void numberOfSides() 
}
    Class Rectangle extends Shape{
    public void numberOfSides(){     
    System.out.println("Number of sides for the rectangle= 4");
    }
    }
    Class Triangle extends Shape{
    public void numberOfSides(){
        System.out.println("Number of sides of triangle= 3");
    }
    }
    Class Hexagon extends Shape{
    public void numberOfSides(){   
        System.out.println("Number of sides of hexagon = 6");
    }
    }
class Test {
    public static void main(String[] args) {

        Rectangle R = new Rectangle();
        Triangle T = new Triangle();
        Hexagon H = new Hexagon();
        
        R.numberOfSides();
        T.numberOfSides();
        H.numberOfSides();
        
    }
}
