
class Box{

    private double length;
    private double width;

    public Box(){

    }

    public Box(double length, double width ){

        this.length = length;
        this.width = width;

    }

    void showDetails(){

        System.out.println("Length = " + this.length);
        System.out.println("Width = " + this.width);
    }

    
}