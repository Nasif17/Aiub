import java.lang.*;

public class MyException extends Exception
{
	private int detail;
	//private String st;
	public MyException(){

	}

	public MyException(int a){
		detail = a;
	}
	public String getMessage(){return "user "+detail+" ";}
}