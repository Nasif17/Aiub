 abstract class  Shape {
    
    protected double dim1;
    protected double dim2;
    Shape()
    {

    }
    Shape(double dim1,double dim2)
    {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public void setDim1(double dim1)
    {
        this.dim1=dim1;
    }
     public void setDim2(double dim2)
    {
        this.dim2=dim2;
    }

    public Double getDim1()
    {
        return this.dim1;
    }
    
    public Double getDim2()
    {
        return this.dim2;
    }
    abstract void displayArea();
    
        
    
    

}

 class Rectangle extends Shape{

    
    Rectangle()
    {

    }
    Rectangle(double length,double width)
    {
        super( length, width);
    }
    public void displayArea()
    {
        System.out.println(dim1*dim2);
    }
    

}

class Triangle extends Shape{

    
    Triangle()
    {

    }
    Triangle(double base,double height)
    {
        super( base,height);
    }
    public void displayArea()
    {
        System.out.println(0.5*dim1*dim2);
    }
    

}
 class Circle extends Shape{

    
    Circle()
    {

    }
    Circle(double radius)
    {
        this.dim1=radius;
    }
    public void displayArea()
    {
        System.out.println(3.1416*dim1*dim1);
    }
    

}
public class Main{
    public static void main(String[] args) {
        Rectangle r1 =new Rectangle(10,5);
        System.out.println("The Area of Rectangle is : ");
        r1.displayArea();
        Triangle t1 =new Triangle(10,5);
         System.out.println("The Area of Triangle is : ");
        t1.displayArea();
         Circle c1 =new Circle(10);
         System.out.println("The Area of Circle is : ");
        c1.displayArea();
    }
}