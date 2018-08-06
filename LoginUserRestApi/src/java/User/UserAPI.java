/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class UserAPI {
    public String verifyUser(User user){
        String Userschool = user.getSchoolID();
        String Username = user.getUsername();
        String UserPassword = user.getPassword();
        
          Connection con = null;
          Statement statement = null;
          ResultSet resultset = null;
          
          String usernameDB = "";
          String passwordDB ="";
          String roleDB = "";
          String schoolDB = "";
        try{
              con = DBconnection.createConnection();
              statement = con.createStatement();
              resultset = statement.executeQuery("select admin.`Admin_ID` as id, admin.`Role` as Roles, admin.`Password` as password ,admin.`Schoolname` as school from admin\n" +
"union\n" +
"select staff.`Staff_ID` as id, staff.`Role` as Roles, staff.`Password` as password, staff.`Schoolname` as school from staff\n" +
"union\n" +
"select primarysix.`Student_ID` as id, primarysix.`Student_Role` as Roles, primarysix.`Student_Password` as password,\n" +
" primarysix.schoolname as school from primarysix\n" +
"union\n" +
"select primaryfive.`Student_ID` as id, primaryfive.`Student_Role` as Roles, primaryfive.`Student_Password` as password,\n" +
"primaryfive.schoolname as school from primaryfive\n" +
"union\n" +
"select primaryfour.`Student_ID` as id, primaryfour.`Student_Role` as Roles, primaryfour.`Student_Password` as password,\n" +
"primaryfour.schoolname as school from primaryfour\n" +
"union\n" +
"select primarythree.`Student_ID` as id, primarythree.`Student_Role` as Roles, primarythree.`Student_Password` as password,\n" +
"primarythree.schoolname as school from primarythree\n" +
"union\n" +
"select primarytwo.`Student_ID` as id, primarytwo.`Student_Role` as Roles, primarytwo.`Student_Password` as password,\n" +
"primarytwo.schoolname as school  from primarytwo\n" +
"union\n" +
"select primaryone.`Student_ID` as id, primaryone.`Student_Role` as Roles, primaryone.`Student_Password` as password,\n" +
"primaryone.schoolname as school from primaryone\n" +
"union\n" +
"select nurserytwo.`Student_ID` as id, nurserytwo.`Student_Role` as Roles, nurserytwo.`Student_Password` as password,\n" +
"nurserytwo.schoolname as school from nurserytwo\n" +
"union\n" +
"select nurseryone.`Student_ID` as id, nurseryone.`Student_Role` as Roles, nurseryone.`Student_Password` as password,\n" +
"nurseryone.schoolname as school from nurseryone");
          
              System.out.println("checking the query.....");
              while(resultset.next()){
                  usernameDB = resultset.getString("id");
                  passwordDB = resultset.getString("password");
                  roleDB = resultset.getString("Roles");
                  schoolDB = resultset.getString("school");
                  System.out.println("passing the query......");
                  if(Username.equals(usernameDB)&&UserPassword.equals(passwordDB)&&roleDB.equals("admin")
                          &&Userschool.equals(schoolDB)){
                      return "ADMIN_ROLE";
                  }else if (Username.equals(usernameDB)&&UserPassword.equals(passwordDB)&&roleDB.equals("teacher")
                          &&Userschool.equals(schoolDB)){
                      return "TEACHER_ROLE";
                  }else if (Username.equals(usernameDB)&&UserPassword.equals(passwordDB)&&roleDB.equals("class-teacher")
                          &&Userschool.equals(schoolDB)){
                      return "CLASS_TEACHER_ROLE";
                  }else if (Username.equals(usernameDB)&&UserPassword.equals(passwordDB)&&roleDB.equals("student")
                          &&Userschool.equals(schoolDB)){
                      return "STUDENT_ROLE";
                  }else if (Username.equals(usernameDB)&&UserPassword.equals(passwordDB)&&roleDB.equals("accountant")
                          &&Userschool.equals(schoolDB)){
                      return "ACCOUNTANT_ROLE";
                  }
              }
          }catch(SQLException e){
              e.printStackTrace();
          }
          
          
       return "Invalid  user Details";      
          
        
    }
    
}
