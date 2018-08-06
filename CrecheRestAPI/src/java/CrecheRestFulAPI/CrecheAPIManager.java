package CrecheRestFulAPI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author user
 */
public class CrecheAPIManager {

    public CrecheAPIManager() {
    }
    Connection con = null;
    Statement statement = null;
    ResultSet resultset = null;
    
    //list data access object
     public  List<CrecheBean> findAll() throws SQLException{
        try{
        CrecheBean Data;
        List<CrecheBean>  students = new ArrayList<>();
        con = DBConnection.createConnection();
        
        PreparedStatement sql = con.prepareStatement("SELECT * from creche");
        //sql.setString(1, school);
        resultset = sql.executeQuery();
        System.out.println("checking the query.....");
              while(resultset.next()){
                 Data = new CrecheBean();
                 
                 Data.StudentID = resultset.getString("Student_ID");
                 Data.StudentFirstName = resultset.getString("Student_Firstname");
                 Data.StudentLastName = resultset.getString("Student_Lastname");
                 Data.StudentGender = resultset.getString("Student_Gender");
                 Data.StudentAge = resultset.getString("Student_Age");
                 Data.StudentParentGuardian = resultset.getString("Student_Parent_Guardian");
                 Data.StudentAddress = resultset.getString("Student_Address");
                 Data.StudentParentContact = resultset.getString("Student_Contact");
                 Data.StudentCountry = resultset.getString("Student_Country");
                 Data.StudentClass  = resultset.getString("Student_Class");
                 Data.StudentSchool = resultset.getString("schoolname");
                 
                 students.add(Data);
              }
        
    return students;
        }catch (SQLException ex) {
            Logger.getLogger(CrecheAPIManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(CrecheAPIManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(CrecheAPIManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
     public  List<CrecheBean> findByStudentID(String StudentID) throws SQLException{
        try{
        CrecheBean Data;
        List<CrecheBean>  students = new ArrayList<>();
        con = DBConnection.getConnection();
        
        PreparedStatement sql = con.prepareStatement("SELECT * FROM Creche  WHERE Student_ID = ?");
        sql.setString(1, StudentID);
        resultset = sql.executeQuery();
        System.out.println("checking the query.....");
              while(resultset.next()){
                 Data = new CrecheBean();
                 
                 Data.StudentID = resultset.getString("Student_ID");
                 Data.StudentFirstName = resultset.getString("Student_Firstname");
                 Data.StudentLastName = resultset.getString("Student_Lastname");
                 Data.StudentGender = resultset.getString("Student_Gender");
                 Data.StudentAge = resultset.getString("Student_Age");
                 Data.StudentParentGuardian = resultset.getString("Student_Parent_Guardian");
                 Data.StudentAddress = resultset.getString("Student_Address");
                 Data.StudentParentContact = resultset.getString("Student_Contact");
                 Data.StudentCountry = resultset.getString("Student_Country");
                 Data.StudentClass  = resultset.getString("Student_Class");
                 Data.StudentSchool = resultset.getString("schoolname");
                 System.out.print(Data.StudentID +
                         "\n"+ Data.StudentFirstName +
                         "\n"+Data.StudentLastName+
                         "\n"+Data.StudentGender+
                         "\n"+Data.StudentAge+
                         "\n"+Data.StudentParentGuardian+
                          "\n==================================\n");
                 students.add(Data);
              }
        
    return students;
        }catch (SQLException ex) {
            Logger.getLogger(CrecheAPIManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(CrecheAPIManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(CrecheAPIManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
     public  List<CrecheBean> findByStudentStudentFirstName(String StudentFirstName) throws SQLException{
        try{
        CrecheBean Data;
        List<CrecheBean>  students = new ArrayList<>();
        con = DBConnection.getConnection();
        
        PreparedStatement sql = con.prepareStatement("SELECT * FROM Creche  WHERE Student_Firstname = ?");
        sql.setString(1, StudentFirstName);
        resultset = sql.executeQuery();
        System.out.println("checking the query.....");
              while(resultset.next()){
                 Data = new CrecheBean();
                 
                 Data.StudentID = resultset.getString("Student_ID");
                 Data.StudentFirstName = resultset.getString("Student_Firstname");
                 Data.StudentLastName = resultset.getString("Student_Lastname");
                 Data.StudentGender = resultset.getString("Student_Gender");
                 Data.StudentAge = resultset.getString("Student_Age");
                 Data.StudentParentGuardian = resultset.getString("Student_Parent_Guardian");
                 Data.StudentAddress = resultset.getString("Student_Address");
                 Data.StudentParentContact = resultset.getString("Student_Contact");
                 Data.StudentCountry = resultset.getString("Student_Country");
                 Data.StudentClass  = resultset.getString("Student_Class");
                 Data.StudentSchool = resultset.getString("schoolname");
                 System.out.print(Data.StudentID +
                         "\n"+ Data.StudentFirstName +
                         "\n"+Data.StudentLastName+
                         "\n"+Data.StudentGender+
                         "\n"+Data.StudentAge+
                         "\n"+Data.StudentParentGuardian+
                          "\n==================================\n");
                 students.add(Data);
              }
        
    return students;
        }catch (SQLException ex) {
            Logger.getLogger(CrecheAPIManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(CrecheAPIManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(CrecheAPIManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
     public  List<CrecheBean> findByStudentStudentLastName(String StudentLastName) throws SQLException{
        try{
        CrecheBean Data;
        List<CrecheBean>  students = new ArrayList<>();
        con = DBConnection.getConnection();
        
        PreparedStatement sql = con.prepareStatement("SELECT * FROM Creche  WHERE Student_Firstname = ?");
        sql.setString(1, StudentLastName);
        resultset = sql.executeQuery();
        System.out.println("checking the query.....");
              while(resultset.next()){
                 Data = new CrecheBean();
                 
                 Data.StudentID = resultset.getString("Student_ID");
                 Data.StudentFirstName = resultset.getString("Student_Firstname");
                 Data.StudentLastName = resultset.getString("Student_Lastname");
                 Data.StudentGender = resultset.getString("Student_Gender");
                 Data.StudentAge = resultset.getString("Student_Age");
                 Data.StudentParentGuardian = resultset.getString("Student_Parent_Guardian");
                 Data.StudentAddress = resultset.getString("Student_Address");
                 Data.StudentParentContact = resultset.getString("Student_Contact");
                 Data.StudentCountry = resultset.getString("Student_Country");
                 Data.StudentClass  = resultset.getString("Student_Class");
                 Data.StudentSchool= resultset.getString("schoolname");
                 System.out.print(Data.StudentID +
                         "\n"+ Data.StudentFirstName +
                         "\n"+Data.StudentLastName+
                         "\n"+Data.StudentGender+
                         "\n"+Data.StudentAge+
                         "\n"+Data.StudentParentGuardian+
                          "\n==================================\n");
                 students.add(Data);
              }
        
    return students;
        }catch (SQLException ex) {
            Logger.getLogger(CrecheAPIManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(CrecheAPIManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(CrecheAPIManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
     public  List<CrecheBean> findByStudentStudentGender(String StudentGender) throws SQLException{
        try{
        CrecheBean Data;
        List<CrecheBean>  students = new ArrayList<>();
        con = DBConnection.getConnection();
        
        PreparedStatement sql = con.prepareStatement("SELECT * FROM Creche  WHERE Student_Gender = ?");
        sql.setString(1, StudentGender);
        resultset = sql.executeQuery();
        System.out.println("checking the query.....");
              while(resultset.next()){
                 Data = new CrecheBean();
                 
                 Data.StudentID = resultset.getString("Student_ID");
                 Data.StudentFirstName = resultset.getString("Student_Firstname");
                 Data.StudentLastName = resultset.getString("Student_Lastname");
                 Data.StudentGender = resultset.getString("Student_Gender");
                 Data.StudentAge = resultset.getString("Student_Age");
                 Data.StudentParentGuardian = resultset.getString("Student_Parent_Guardian");
                 Data.StudentAddress = resultset.getString("Student_Address");
                 Data.StudentParentContact = resultset.getString("Student_Contact");
                 Data.StudentCountry = resultset.getString("Student_Country");
                 Data.StudentClass  = resultset.getString("Student_Class");
                 Data.StudentSchool = resultset.getString("schoolname");
                 System.out.print(Data.StudentID +
                         "\n"+ Data.StudentFirstName +
                         "\n"+Data.StudentLastName+
                         "\n"+Data.StudentGender+
                         "\n"+Data.StudentAge+
                         "\n"+Data.StudentParentGuardian+
                          "\n==================================\n");
                 students.add(Data);
              }
        
    return students;
        }catch (SQLException ex) {
            Logger.getLogger(CrecheAPIManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(CrecheAPIManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(CrecheAPIManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
     public  List<CrecheBean> findByStudentStudentAge(String StudentAge) throws SQLException{
        try{
        CrecheBean Data;
        List<CrecheBean>  students = new ArrayList<>();
        con = DBConnection.getConnection();
        
        PreparedStatement sql = con.prepareStatement("SELECT * FROM Creche  WHERE Student_Age = ?");
        sql.setString(1, StudentAge);
        resultset = sql.executeQuery();
        System.out.println("checking the query.....");
              while(resultset.next()){
                 Data = new CrecheBean();
                 
                 Data.StudentID = resultset.getString("Student_ID");
                 Data.StudentFirstName = resultset.getString("Student_Firstname");
                 Data.StudentLastName = resultset.getString("Student_Lastname");
                 Data.StudentGender = resultset.getString("Student_Gender");
                 Data.StudentAge = resultset.getString("Student_Age");
                 Data.StudentParentGuardian = resultset.getString("Student_Parent_Guardian");
                 Data.StudentAddress = resultset.getString("Student_Address");
                 Data.StudentParentContact = resultset.getString("Student_Contact");
                 Data.StudentCountry = resultset.getString("Student_Country");
                 Data.StudentClass  = resultset.getString("Student_Class");
                 Data.StudentSchool = resultset.getString("schoolname");
                 System.out.print(Data.StudentID +
                         "\n"+ Data.StudentFirstName +
                         "\n"+Data.StudentLastName+
                         "\n"+Data.StudentGender+
                         "\n"+Data.StudentAge+
                         "\n"+Data.StudentParentGuardian+
                          "\n==================================\n");
                 students.add(Data);
              }
        
    return students;
        }catch (SQLException ex) {
            Logger.getLogger(CrecheAPIManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(CrecheAPIManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(CrecheAPIManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
     
}
