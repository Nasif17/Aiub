package classes.logic;

import java.lang.*;
import java.io.*;
import java.nio.*;
import java.nio.file.*;


public class AdminInfo {
    private String userName, firstName, lastName, dob,
            gender, position, email, nation;
    private String adminPath = ".\\.\\File\\admin.txt";
    
    public AdminInfo(){}
    public AdminInfo(String uName){
        this.userName = uName;
        try{
            File userFile = new File(adminPath);

            if(userFile.exists()){
            BufferedReader buffReader = new BufferedReader(new FileReader(adminPath));
            int totalLines = 0;
            while (buffReader.readLine() != null){
                totalLines++;
            }
            buffReader.close();

            for (int i = 0; i <= totalLines; i++) {
                String matchUser = Files.readAllLines(Paths.get(adminPath)).get(i).substring(11);
                if (matchUser.equals(this.userName)) {
                    this.firstName = Files.readAllLines(Paths.get(adminPath)).get(i + 2).substring(12);
                    this.lastName = Files.readAllLines(Paths.get(adminPath)).get(i + 3).substring(11);
                    this.dob = Files.readAllLines(Paths.get(adminPath)).get(i + 4).substring(5);
                    this.gender = Files.readAllLines(Paths.get(adminPath)).get(i + 5).substring(7);
                    this.position = Files.readAllLines(Paths.get(adminPath)).get(i + 6).substring(10);
                    this.email = Files.readAllLines(Paths.get(adminPath)).get(i + 7).substring(7);
                    this.nation = Files.readAllLines(Paths.get(adminPath)).get(i + 8).substring(13);
                    break;
                }
            }     
            }

        } catch (Exception ex) {
            System.out.println(ex);
              ex.printStackTrace();
        }
    }

    public String getFName(){ return this.firstName;}
    public String getLName(){ return this.lastName;}
    public String getDob(){ return this.dob;}
    public String getGender(){ return this.gender;}
    public String getPosition(){ return this.position;}
    public String getEmail(){ return this.email;}
    public String getNation(){ return this.nation;}
}
