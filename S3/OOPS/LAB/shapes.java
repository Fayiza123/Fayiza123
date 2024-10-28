import java.util.*;
abstract class Shape {
public abstract void numberOfSides(); 
}
    class Rectangle extends Shape{
    public void numberOfSides(){     
    System.out.println("Number of sides for the rectangle = 4");
    }
    }
    class Triangle extends Shape{
    public void numberOfSides(){
        System.out.println("Number of sides of triangle = 3");
    }
    }
    class Hexagon extends Shape{
    public void numberOfSides(){   
        System.out.println("Number of sides of hexagon = 6");
    }
    }
pclass Test {
    public static void main(String[] args) {

        Rectangle R = new Rectangle();
        Triangle T = new Triangle();
        Hexagon H = new Hexagon();
        
        R.numberOfSides();
        T.numberOfSides();
        H.numberOfSides();
        
    }
}
