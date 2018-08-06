/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountUser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author user
 */
public class $NonTeaching$Teaching {
    public int $checkteaching() throws SQLException{
    
          Connection con = null;
          PreparedStatement statement = null;
          ResultSet resultset = null;
         
         
          
          
      
              con = DBConnection.createConnection();
           
                  System.out.println("connecting.....");
                  statement = con.prepareStatement("SELECT * FROM school_a.staff");
              
           
                  System.out.println("checking ......");
                  resultset = statement.executeQuery("SELECT COUNT(*) FROM school_a.staff WHERE staff_position=1");
                 System.out.println("now checking.....");
                  resultset.next();
              System.out.println("checking teaching staff the query.....");
  
             
                  int $teaching =resultset.getInt(1);
                 System.out.println($teaching);
                
                  System.out.println("passing the total......");
                 
        
                 
         return $teaching;
    }
    public int $checknonteaching() throws SQLException{
    
          Connection con = null;
          PreparedStatement statement = null;
          ResultSet resultset = null;
         
         
          
          
      
              con = DBConnection.getConnection();
           
                  System.out.println("connecting.....");
                  statement = con.prepareStatement("SELECT * FROM school_a.staff");
              
           
                  System.out.println("checking ......");
                  resultset = statement.executeQuery("SELECT COUNT(*) FROM school_a.staff WHERE staff_position=0");
             
                  resultset.next();
              System.out.println("checking non teaching the query.....");
  
             
                  int $isNoTteaching =resultset.getInt(1);
                 System.out.println( $isNoTteaching);
                
                  System.out.println("passing the total......");
                 
        
                 
         return  $isNoTteaching;
    }
     public int $Students() throws SQLException{
    
          Connection con = null;
          PreparedStatement statement = null;
          ResultSet resultset = null;
         
         
          
          
      
              con = DBConnection.getConnection();
           
                  System.out.println("connecting.....");
                  statement = con.prepareStatement("SELECT * FROM school_a.students");
              
           
                  System.out.println("checking ......");
                  resultset = statement.executeQuery("SELECT COUNT(*) FROM school_a.students");
             
                  resultset.next();
              System.out.println("checking student query.....");
  
             
                  int $total$student =resultset.getInt(1);
                 System.out.println($total$student);
                
                  System.out.println("passing the total......");
                 
        
                 
         return $total$student;
    }
     public int $Staffs() throws SQLException{
    
          Connection con = null;
          PreparedStatement statement = null;
          ResultSet resultset = null;
         
         
          
          
      
              con = DBConnection.getConnection();
           
                  System.out.println("connecting.....");
                  statement = con.prepareStatement("SELECT * FROM school_a.staff");
              
           
                  System.out.println("checking ......");
                  resultset = statement.executeQuery("SELECT COUNT(*) FROM school_a.staff");
             
                  resultset.next();
              System.out.println("checking total staff  query.....");
  
             
                  int $total$staff =resultset.getInt(1);
                 System.out.println($total$staff);
                
                  System.out.println("passing the total......");
                 
        
                 
         return $total$staff;
    }
     public int $Junior$Student() throws SQLException{
    
          Connection con = null;
          PreparedStatement statement = null;
          ResultSet resultset = null;
         
         
          
          
      
              con = DBConnection.getConnection();
           
                  System.out.println("connecting.....");
                  statement = con.prepareStatement("SELECT * FROM school_a.students");
              
           
                  System.out.println("checking ......");
                  resultset = statement.executeQuery("SELECT COUNT(*) FROM school_a.students WHERE student_class < 4 ");
             
                  resultset.next();
              System.out.println("checking junior the query.....");
  
             
                  int totalJstudent =resultset.getInt(1);
                 System.out.println(totalJstudent);
                
                  System.out.println("passing the total......");
                 
        
                 
         return totalJstudent;
    }
     public int $Senior$Studenr() throws SQLException{
    
          Connection con = null;
          PreparedStatement statement = null;
          ResultSet resultset = null;
         
         
          
          
      
              con = DBConnection.getConnection();
           
                  System.out.println("connecting.....");
                  statement = con.prepareStatement("SELECT * FROM school_a.students");
              
           
                  System.out.println("checking ......");
                  resultset = statement.executeQuery("SELECT COUNT(*) FROM school_a.students WHERE student_class > 3");
             
                  resultset.next();
              System.out.println("checking  senior the query.....");
  
             
                  int totalsenior =resultset.getInt(1);
                 System.out.println(totalsenior);
                
                  System.out.println("passing the total......");
                 
        
                 
         return totalsenior;
    }
     public int $Student$Paid$Fee() throws SQLException{
    
          Connection con = null;
          PreparedStatement statement = null;
          ResultSet resultset = null;
         
         
          
          
      
              con = DBConnection.getConnection();
           
                  System.out.println("connecting.....");
                  statement = con.prepareStatement("SELECT * FROM school_a.students");
              
           
                  System.out.println("checking ......");
                  resultset = statement.executeQuery("SELECT COUNT(*) FROM school_a.students WHERE student_fee_payment_info = 1");
             
                  resultset.next();
              System.out.println("checking school fee query.....");
  
             
                  int $pFee =resultset.getInt(1);
                 System.out.println($pFee);
                
                  System.out.println("passing the total......");
                 
        
                 
         return $pFee;
    }
     public int $Student$NotPaid$Fee() throws SQLException{
    
          Connection con = null;
          PreparedStatement statement = null;
          ResultSet resultset = null;
         
         
          
          
      
              con = DBConnection.getConnection();
           
                  System.out.println("connecting.....");
                  statement = con.prepareStatement("SELECT * FROM school_a.students");
              
           
                  System.out.println("checking ......");
                  resultset = statement.executeQuery("SELECT COUNT(*) FROM school_a.students WHERE student_fee_payment_info = 0");
             
                  resultset.next();
              System.out.println("checking haven't pay fee query.....");
  
             
                  int $nFee$=resultset.getInt(1);
                 System.out.println($nFee$);
                
                  System.out.println("passing the total......");
                 
        
                 
         return $nFee$;
    }
     public int $Attendence() throws SQLException{
    
          Connection con = null;
          PreparedStatement statement = null;
          ResultSet resultset = null;
         
         
          
          
      
              con = DBConnection.getConnection();
           
                  System.out.println("connecting.....");
                  statement = con.prepareStatement("SELECT * FROM school_a.student_attendance");
              
           
                  System.out.println("checking ......");
                  resultset = statement.executeQuery("SELECT COUNT(*) FROM school_a.student_attendance WHERE Attendence = 1");
             
                  resultset.next();
              System.out.println("checking the attendence query.....");
  
             
                  int $getattend =resultset.getInt(1);
                 System.out.println($getattend);
                
                  System.out.println("passing the total......");
                 
        
                 
         return $getattend;
    }
     
}     
