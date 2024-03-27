import java.io.*;
public class Createfile
{
	public static void main(String []args)
	{
		try{
		String userDirectory = System.getProperty("user.dir");
	    String filename = "first_file.doc";
		
		File newfile = new File(userDirectory+"\\Files\\"+filename);  // location of the file to be created 

		if(newfile.createNewFile())
		{
			System.out.println("A new file is successfully created!!"+ newfile.getName());
		}
		else
		{
			System.out.println("The file can not be created or already exists");
		}

		if(newfile.exists() == true)
		{
			System.out.println("The file exists!!");
		}

		else
		{
			System.out.println("Could not found or does not exist");
		}
		//newfile.close();


        }
		catch(IOException io)
		{
			System.out.println("An error occured and failed to create the file");
			io.printStackTrace();
		}



	}
}
