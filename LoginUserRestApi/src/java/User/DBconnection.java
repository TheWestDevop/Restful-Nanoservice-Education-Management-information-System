/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class DBconnection {
     public static Connection createConnection(){
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/primarysystem?zeroDateTimeBehavior=convertToNull";
        String user = "root";
        String password = "";
        
        try{
            try{
                Class.forName("com.mysql.jdbc.Driver");
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }
            con = DriverManager.getConnection(url, user, password);
            System.out.println("POST ESTABLISHING A DB CONNECTION -" +con);
        }catch(Exception e){
            e.printStackTrace();
        }
          return con;      
    }
    public static Connection getConnection(){
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/primarysystem?zeroDateTimeBehavior=convertToNull";
        String user = "root";
        String password = "";
        
        try{
            try{
                Class.forName("com.mysql.jdbc.Driver");
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }
            con = DriverManager.getConnection(url, user, password);
            System.out.println("POST ESTABLISHING A DB CONNECTION -" +con);
        }catch(Exception e){
            e.printStackTrace();
        }
          return con;      
    }
}
