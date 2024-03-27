package classes.logic;
import java.lang.*;

import java.io.*;
import java.nio.*;
import java.nio.file.*;

public class loginLogic {
    private String userName,password,usertype,userData="";
    private int check = 0,totalLines=0,match = 0;
    private FileReader file;
    private BufferedReader buffReader;
    String admin =".\\.\\File\\admin.txt";
    String teacher=".\\.\\File\\teacher.txt";
    String student=".\\.\\File\\student.txt";
    String employee=".\\.\\File\\employee.txt";

    public loginLogic(String user,String pass,String userType){
        this.userName = user;
        this.password = pass;
        this.usertype = userType;
    }

    public int check(){
        if(userName.isEmpty()||password.isEmpty()){
            check = 1;
        }else{
            check = 0;
        }
        return check;
    }

    public int matchUser(){
       try {
            String user = "User Name: " + userName;
            String pass = "Password: " + password;
            if(usertype.equals("admin")){  
                userData = admin;
             }else if(usertype.equals("teacher")){
                 userData = teacher;
             }else if(usertype.equals("student")){
                 userData = student;
             }else if(usertype.equals("employee")){
                 userData = employee;
             }
            BufferedReader buffReader = new BufferedReader(new FileReader(userData));

            int totalLines = 0;
            while (buffReader.readLine() != null)
                totalLines++;
            buffReader.close();

            for (int i = 0; i < totalLines-1; i++) {
                String matchUser = Files.readAllLines(Paths.get(userData)).get(i);
                if (matchUser.equals(user)) {
                    String matchPass = Files.readAllLines(Paths.get(userData))
                            .get((i + 1));
                    if (matchPass.equals(pass)) {

                        match = 1;
                        break;

                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
              ex.printStackTrace();
        }
        return match;
    }
    
}
