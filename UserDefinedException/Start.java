import java.lang.*;
import java.util.Scanner;

public class Start
{
	static void compute(int a) throws MyException{
		System.out.println("Called compute("+a+")");
		
		if(a > 10){
			throw new MyException(a);
		}
		
		System.out.println("Normal Exit");
	} 
	public static void main(String args[])
	{
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		try
		{
			if(s.length() > 6)
			{
				System.out.println("Invalid String");
				throw new MyException();
			}
			else
			{
				System.out.println("Valid String");
			}
		}
		catch(MyException me)
		{
			System.out.println(me.getMessage());
			//me.printStackTrace();
		}
		finally{
			System.out.println("Checking how Finally works!!!");
		}

		 try{
		compute(1);
		 	System.out.println(" ");
		 	compute(11);
		 }catch(MyException e){
		 	System.out.println("Caught "+ e);
		 }

		System.out.println("End");
	}
}