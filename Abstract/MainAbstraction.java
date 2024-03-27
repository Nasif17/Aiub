abstract class Bike{ 
      public Bike(){
        System.out.println("Empty Superclass Constructor");
    }
     public Bike(int a){
         this(a, 5);
        System.out.println("Parameterize Superclass Constructor");
    }
    public Bike(int a, int h){
        this();
        System.out.println("two Parameterize Superclass Constructor");
    }
    abstract void run(); 
     static{
        System.out.println("static from superclass");
    } 
  }  



class Honda4 extends Bike{ 

     Honda4(){
        super(5, 6);
        System.out.println("Empty Subclass Constructor");
    }

     Honda4(int k){
        System.out.println("Par Subclass Constructor");
    }

    Honda4(int l, int x){
        super();
       System.out.println("two Parameterize sub");
    }

   
    void run()
    {   
        System.out.println("running safely");
    }  
}



public class MainAbstraction{
     static{
        System.out.println("1st static from main ");
    } 
public static void main(String args[]){ 

  System.out.println("Random print from main");
   Bike obj1 = new Honda4();
   

   //Bike obj = new Honda4(4);  
   // empty sup
   //par sub
   obj1.run();  
  }  

   static{
        System.out.println("2nd static from main");
    } 
}  

