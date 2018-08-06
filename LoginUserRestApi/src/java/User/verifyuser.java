/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
public class verifyuser extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            HttpSession session = request.getSession();
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String school_name = request.getParameter("schoolid");
          
           System.out.println(username);
          System.out.println(password);
           System.out.println(school_name);
         
  
           User accountbean = new User(username,password,school_name);
            accountbean.setUsername(username);
            accountbean.setPassword(password);
            accountbean.setSchoolID(school_name);
            
            UserAPI accountdao = new UserAPI();
                       
            
            try{
                String UserValidate = accountdao.verifyUser(accountbean);
                switch (UserValidate) {
                    case "ADMIN_ROLE":
                        System.out.println("ADMIN HOME");
                        session = request.getSession();
                        session.setAttribute("Admin", username);
                        request.setAttribute("username", username.toUpperCase());
                        request.setAttribute("school", school_name.toUpperCase());
           
                
                     request.getRequestDispatcher("http:localhost:8080/Admin/Portal.jsp").forward(request, response);
                  
                        break;
                    case "TEACHER_ROLE":
                        System.out.println("STAFF HOME");
                        session = request.getSession();
                        session.setAttribute("Staff", username);
                        request.setAttribute("UserName", username);
                        request.setAttribute("school", school_name.toUpperCase());
                        
                        request.getRequestDispatcher("http:localhost:8080/Staff/Portal.jsp").forward(request, response);
                       
                        break;
                    case "STUDENT_ROLE":
                        System.out.println("STUDENT HOME");
                        session = request.getSession();
                        session.setAttribute("Student", username);
                        request.setAttribute("UserName", username);
                        request.setAttribute("school", school_name.toUpperCase());
                        
                        request.getRequestDispatcher("http:localhost:8080/Student/Portal.jsp").forward(request, response);
                        
                        break;
                    case "CLASS_TEACHER_ROLE":
                        System.out.println("STUDENT HOME");
                        session = request.getSession();
                        session.setAttribute("Student", username);
                        request.setAttribute("UserName", username);
                        request.setAttribute("school", school_name.toUpperCase());
                        
                        request.getRequestDispatcher("http:localhost:8080/Class-Teacher/Portal.jsp").forward(request, response);
                        
                        break; 
                    case "ACCOUNTANT_ROLE":
                        System.out.println("STUDENT HOME");
                        session = request.getSession();
                        session.setAttribute("Student", username);
                        request.setAttribute("UserName", username);
                        request.setAttribute("school", school_name.toUpperCase());
                        
                        request.getRequestDispatcher("http:localhost:8080/Accountant/Portal.jsp").forward(request, response);
                        
                        break;
                        
                    default:
                        System.out.println("Error Message = " + UserValidate);
                        request.setAttribute("errmsg", UserValidate);
                        request.getRequestDispatcher("http:localhost:8080/EduSoftEntrance/Entrance.jsp").forward(request, response);
                        break;
                }
                      
            
          
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e1){
            e1.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
