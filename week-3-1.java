public class Rectangle{
    private double length;
    private double width;
    public Rectangle(){
        this.length=3.0;
        this.width=3.0;
        System.out.println("Default constructor called");
    }
    public Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
        System.out.println("constructor with length and width called");
    }
    public Rectangle(double side){
        this.length=side;
        this.width=side;
        System.out.println("constructor with side called:");
    }
    public double calculateArea(){
        return this.length*this.width;
    }               
    public void displayDetails(){
        System.out.println("Length:"+this.length);
        System.out.println("Width:"+this.width);
        System.out.println("Area:"+calculateArea());
        System.out.println("-------");
    }
    public static void main(String[] args)
    {
        Rectangle rect1=new Rectangle();
        rect1.displayDetails();
        Rectangle rect2=new Rectangle(5.0,10.0);
        rect2.displayDetails();
        Rectangle rect3=new Rectangle(7.0);
        rect3.displayDetails();
    }
}

