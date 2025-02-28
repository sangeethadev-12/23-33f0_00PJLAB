abstract class Shapes{
    abstract double area();
}class Circle extends Shapes{
    double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shapes{
    double length;
    double width;
    public Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    public double area()
    {
        return length*width;
    }
}
public class MainShapes{
    public static void main(String[] args)
    {
        Shapes circle=new Circle(5);
        Shapes rectangle=new Rectangle(4,6);
        System.out.println("Circle area:"+circle.area());
        System.out.println("Rectangle area:"+rectangle.area());
    }
}
