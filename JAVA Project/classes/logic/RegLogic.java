package classes.logic;

import java.lang.*;
import java.io.*;
import java.nio.*;
import java.nio.file.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.time.*;
import java.time.format.*;
import abstractCls.*;

public class RegLogic extends RegAbstract {

    private String fName, lName, dob, gender, position, mail, user, nation, pass, rePass, ques, ans;
    private File userFile;
    private FileWriter fWriter;
    private BufferedWriter bFWriter;
    private PrintWriter pWriter;
    private LocalDateTime dateTime;
    private DateTimeFormatter dtFormat;
    private String timeAndDate;
    private int m = 0;
    String adminPath= ".\\.\\File\\admin.txt";
    String teacherPath = ".\\.\\File\\teacher.txt";
    String studentPath = ".\\.\\File\\student.txt";
    String emPath = ".\\.\\File\\employee.txt";
    RegLogic() {
    }

    public RegLogic(String fName, String lName, String dob, String gender, String position, String mail,
            String user, String nation, String pass, String rePass, String ques, String ans) {
        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.gender = gender;
        this.position = position;
        this.mail = mail;
        this.user = user;
        this.nation = nation;
        this.pass = pass;
        this.rePass = rePass;
        this.ques = ques;
        this.ans = ans;
    }

    public String empty() {
        if (fName.isEmpty() || lName.isEmpty() || dob.isEmpty() || gender.isEmpty() || mail.isEmpty()
                || user.isEmpty() || nation.isEmpty() || pass.isEmpty() || rePass.isEmpty() || ans.isEmpty()) {
            return "true";
        } else {
            return "false";
        }
    }

    public int checkPass() {
        if (pass.equals(rePass)) {
            return 1;
        } else {
            return 0;
        }
    }

    public int createUser() {
        try { 
            if(this.position=="Admin"){
                userFile = new File(adminPath);
            }else if(this.position=="Teacher"){
                userFile = new File(teacherPath);
            }else if(this.position=="Student"){
                userFile = new File(studentPath);
            }else if(this.position=="Employee"){
                userFile = new File(emPath);
            }else{System.out.println("Error");}

            if (!userFile.exists()) {
                userFile.createNewFile();
            }
            
            fWriter = new FileWriter(userFile, true);
            bFWriter = new BufferedWriter(fWriter);
            pWriter = new PrintWriter(bFWriter);

            dateTime = LocalDateTime.now();
            dtFormat = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");
            timeAndDate = dateTime.format(dtFormat);

            pWriter.println("AdminMarker====================");
            pWriter.println("User Name: "+ this.user);
            pWriter.println("Password: "+ this.pass);
            pWriter.println("First Name: "+ this.fName);
            pWriter.println("Last Name: "+ this.lName);
            pWriter.println("DOB: "+ this.dob);
            pWriter.println("Gender: "+ this.gender);
            pWriter.println("Position: "+ this.position);
            pWriter.println("Email: "+ this.mail);
            pWriter.println("Nationality: "+ this.nation);
            pWriter.println("Security Question: "+ this.ques);
            pWriter.println("Answer: "+ this.ans);
            pWriter.println("Date and Time: "+ timeAndDate);
            pWriter.close();
            m = 1;
        } catch (Exception e) {
            System.out.println(e);
              e.printStackTrace();
        }
        return m;

    }

}
