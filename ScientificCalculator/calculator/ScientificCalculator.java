package calculator;
import interfaced.*;





    public  class ScientificCalculator extends BasicCalculator  implements ScientificCalculation{
    public ScientificCalculator()
    {
       System.out.println("This is Scientific Calculator");
    }
    
   public ScientificCalculator(double v1,double v2)
    {
          super( v1,v2);
    }
    public double add()
    {
        return getValue1()+getValue2();
    }
    public double substact()
    {
        return getValue1() - getValue2();
    }
    public double multiply()
    {
        return getValue1() * getValue2();
    }
    public double divide()
    {
        return getValue1()/getValue2();
    }
      public double toThePow()
    {
        double w=1;
        for (int i=0; i<3;i++)
        {
           w  = w*getValue2();
       
        }
        return w;
    }
    
}