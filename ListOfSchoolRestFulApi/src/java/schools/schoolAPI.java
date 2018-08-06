/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class schoolAPI {
    Connection con = null;
    Statement statement = null;
    ResultSet resultset = null;
    
    //list data access object
     public  List<school> ListAllSchools() throws SQLException{
        try{
        school Data;
        List<school> schools = new ArrayList<>();
        con = DBconnection.getConnection();
        
        PreparedStatement sql = con.prepareStatement("SELECT * from schoolname");
        //sql.setString(1, school);
        resultset = sql.executeQuery();
        System.out.println("processing the query.....");
              while(resultset.next()){
                 Data = new school();
                 Data.SchoolID = resultset.getString("School_ID");
                 Data.SchoolName = resultset.getString("schoolname");
                 schools.add(Data);
              }
              return schools;
        }catch (SQLException ex) {
            Logger.getLogger(schoolAPI.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(schoolAPI.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(schoolAPI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
   }
       public  String InsertNewSchool() throws SQLException{
        try{
        school Data = new school();
        con = DBconnection.createConnection();
        
        PreparedStatement sql = con.prepareStatement("Insert Into schoolname Value(?,?,?,?)");
        sql.setString(1, Data.getSchoolID());
        sql.setString(2, Data.getSchoolName());
        sql.setString(3, Data.getReg_Date());
        sql.setString(4, Data.getExp_Date());
        sql.executeQuery();
        System.out.println("inserted the query.....");
        
         return "success";
        }catch (SQLException ex) {
            Logger.getLogger(schoolAPI.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(schoolAPI.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(schoolAPI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
   }
}
