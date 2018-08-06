<%-- 
    Document   : sch3
    Created on : Dec 23, 2017, 11:56:38 PM
    Author  :  Digit
--%>

<%@page import="java.sql.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html ng-app='myEntrenceApp'>
    <head>
        <title>Education Management System</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/bootstrap/dist/css/bootstrap.min.css">

  
   <link rel="stylesheet" href="css/style.css">
   <link rel="stylesheet" href="css/loginface.css" />
</head>
   
    <body ng-controller="mainController">
  <div class="heading">Leo Management System</div>
  <h1 class="adminlog">Education Login Portal</h1>
    
  <div  class="main" align="center">   
<div class="signin-form">
    <form method="post" action="Account" id="Alogin"  >
        <div class="message">
            ADMINISTRATOR STAFF<br>STUDENT CAN ACCESS THEIR SCHOOL PORTAL HERE FOR THEIR SCHOOL ACTIVITIES KINDLY LOGIN 
        </div>
        <br><br>
        
<select id='selectskul' style="width:auto; max-width:200px" name ="school"  required="true" >
     <option  value="0">&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;Pick your School</option>
     
</select>
 <br>
 <div class="login-form">
<div id="error" style="color:black"></div>
<input type="text" align="right" name="username" align="center" placeholder=" EduSoft Login ID" autocomplete="true" id="username" required>
<br>
    <input type="password" name="password" align="center" placeholder="EduSoft Password" minlength="6" id="password" required>
<br>
<span style="color:red; font-weight: bold">${errmsg}</span>
<br>
<span>

<input type="submit"  class="logbtn" align="left" value="Login">
&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" class="forgottenbtn"  align="right" value="Forgotten Password &quest;">
</span>
<div>&nbsp;</div>
<p><a href="sch2.html" style="color:white; font-family:cursive; font-weight:bolder ; font-size: 20px; margin-top:35px; ">Find Assistance Here &quest;&nbsp;<i class="fa fa-home"></i></a></p>
   
</div> 
</form>
</div>
</div>
<br><br>

<footer style="padding-bottom:20px; font-weight: bold; color:#dbdb6a;background-color:transparent;text-align:center;"> &copy;
                    <script>                            document.write(new Date().getFullYear());
                    </script> <a href="@yourDigit" style="color:orangered; font-size:35px; font-family:The New Times,serif;">Digit</a>&nbsp;It is our commitment to make it easy and better</footer>
                    
               <script src="js/jquery-3.1.1.js" type="text/javascript"></script>
               <script src="js/Angular/angular.min.js" type="text/javascript"></script>
               <script type="text/javacript" src="css/bootstrap/dist/js/bootstrap.min.js"></script>
               <script src="js/controllers.js" type="text/javascript"></script>
    </body>
   
</html>
