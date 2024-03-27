package calculator;

import interfaced.*;



abstract class BasicCalculator implements Calculation{
    private double value1;
    private double value2;

    BasicCalculator()
    {
        System.out.println("This is basic calculator");
    }
    BasicCalculator(double v1,double v2)
    {
        this.value1=v1;
        this.value2=v2;
    }
    public void setValue1(double v1)
    {
        this.value1=v1;
    }
    public void setValue2(double v2)
    {
        this.value2=v2;
    }
    public double getValue1()
    {
        return this.value1;
    }
    public double getValue2()
    {
        return this.value2;
    }


}

