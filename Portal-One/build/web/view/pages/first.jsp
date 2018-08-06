<%-- 
    Document   : first
    Created on : Mar 2, 2018, 2:04:23 PM
    Author     : user
--%>


<%@page import="AccountUser.*"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


    <% $NonTeaching$Teaching $check = new $NonTeaching$Teaching(); %>
      
    <section class=" header">
      <h1 style="font-family:'New Times';">
        School Information
        <small style="font-family:cursive;">School Data</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active" style="font-family:cursive;">Information</li>
      </ol>
    </section>

  <section class="content">
      <!-- Small boxes (Stat box) -->
      <div class="row">
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-aqua">
            <div class="inner">
                <h1 style="font-size:50px;font-weight: bolder; text-align: center"><%=($check.$Students())%></h1>

              <b>Total Number of  Student</b>
            </div>
            <div class="icon">
              <i class="ion ion-ios-people-outline"></i>
            </div>
            <a href="#/Student" class="small-box-footer">Student info <i class="fa fa-arrow-circle-right"></i></a>
          </div>
        </div>
        <!-- ./col -->
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-green">
            <div class="inner">
                <h1 style="font-size:50px;font-weight: bolder; text-align: center"><%=($check.$Staffs())%></h1>
              

              <b>Total Number of Staff</b>
            </div>
            <div class="icon">
              <i class="ion ion-ios-people-outline"></i>
            </div>
            <a href="#" class="small-box-footer">Staff info <i class="fa fa-arrow-circle-right"></i></a>
          </div>
        </div>
        <!-- ./col -->
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-yellow">
            <div class="inner">
              <h1 style="font-size:50px;font-weight: bold; text-align: center"><%=($check.$checkteaching())%></h3>

              <b>Total Number of Teaching Staff</b>
            </div>
            <div class="icon">
              <i class="ion ion-ios-people-outline"></i>
            </div>
            <a href="#" class="small-box-footer">View Staff info <i class="fa fa-arrow-circle-right"></i></a>
          </div>
        </div>
          <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-red">
            <div class="inner">
              <h3 style="font-size:50px;font-weight: bold; text-align: center" ><%=($check.$checknonteaching())%></h3>

              <b>Total Number of  Non-Teaching<br>Staff</b>
            </div>
            <div class="icon">
              <i class="ion ion-ios-people-outline"></i>
            </div>
            <a href="#" class="small-box-footer">View Staff info <i class="fa fa-arrow-circle-right"></i></a>
          </div>
        </div>     
        <!-- ./col -->
       
      </div>
       <div class="row">
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-lime">
            <div class="inner">
              <h3  style="font-size:50px;font-weight: bolder; text-align: center"><%=($check.$Junior$Student())%></h3>

              <b>Total Number <br>Of Creche</b>
            </div>
            <div class="icon">
              <i class="ion ion-ios-people-outline"></i>
            </div>
            <a href="#" class="small-box-footer">View info <i class="fa fa-arrow-circle-right"></i></a>
          </div>
        </div>
        <!-- ./col -->
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-orange">
            <div class="inner">
                <h3  style="font-size:50px;font-weight: bolder; text-align: center"><%=($check.$Senior$Studenr())%></h3>
               <b>Total Number <br>Of Kindergarten Student</b>
            </div>
            <div class="icon">
              <i class="ion ion-ios-people-outline"></i>
            </div>
            <a href="#" class="small-box-footer">View info <i class="fa fa-arrow-circle-right"></i></a>
          </div>
        </div>
        <!-- ./col -->
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-blue">
            <div class="inner">
                <h3  style="font-size:50px;font-weight: bolder; text-align: center"><%=($check.$Senior$Studenr())%></h3>
              
      <b>Total Number <br>Of Nursery Student</b>
            </div>
            <div class="icon">
              <i class="ion ion-ios-people-outline"></i>
            </div>
            <a href="#" class="small-box-footer">View info <i class="fa fa-arrow-circle-right"></i></a>
          </div>
        </div>
        <!-- ./col -->
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-maroon">
            <div class="inner">
                <h3  style="font-size:50px;font-weight: bolder; text-align: center"><%=($check.$Senior$Studenr())%></h3>
              
                <b>Total Number<br> Of primary Student</b>
            </div>
            <div class="icon">
              <i class="ion ion-ios-people-outline"></i>
            </div>
            <a href="#" class="small-box-footer">View info <i class="fa fa-arrow-circle-right"></i></a>
          </div>
        </div>
        <!-- ./col -->
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-navy">
            <div class="inner">
              <h3  style="font-size:50px;font-weight: bolder; text-align: center"><%=($check.$Student$Paid$Fee())%></h3>
               <b>Total Number <br>Of Boys</b>
            </div>
            <div class="icon">
              <i class="ion ion-ios-people-outline"></i>
            </div>
            <a href="#" class="small-box-footer">View info <i class="fa fa-arrow-circle-right"></i></a>
          </div>
        </div>
        <!-- ./col -->
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-olive">
            <div class="inner">
                <h3  style="font-size:50px;font-weight: bolder; text-align: center"><%=($check.$Senior$Studenr())%></h3>
               <b>Total Number <br>Of Girls</b>
            </div>
            <div class="icon">
              <i class="ion ion-ios-people-outline"></i>
            </div>
            <a href="#" class="small-box-footer">View info <i class="fa fa-arrow-circle-right"></i></a>
          </div>
        </div>
        <!-- ./col -->
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-fuchsia">
            <div class="inner">
                <h3  style="font-size:50px;font-weight: bolder; text-align: center"><%=($check.$Senior$Studenr())%></h3>
              
              <b>Total Number Of  Student<br>That Have Paid There School Fee</b>
            </div>
            <div class="icon">
              <i class="ion ion-ios-people-outline"></i>
            </div>
            <a href="#" class="small-box-footer">View info <i class="fa fa-arrow-circle-right"></i></a>
          </div>
        </div>
          <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-black">
            <div class="inner">
              <h3  style="font-size:50px;font-weight: bolder; text-align: center"><%=($check.$Student$NotPaid$Fee())%></h3>

              <b>Total Number Of Student<br> That Haven't Paid There School Fee </b>
            </div>
            <div class="icon">
              <i class="ion ion-ios-people-outline"></i>
            </div>
            <a href="#" class="small-box-footer">View info<i class="fa fa-arrow-circle-right"></i></a>
          </div>
        </div>     
        <!-- ./col -->
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-red">
            <div class="inner">
              <h3  style="font-size:50px;font-weight: bolder; text-align: center"><%=($check.$Attendence())%></h3>

              <b>Student  Attendance For Today</b>
            </div>
            <div class="icon">
              <i class="ion ion-pie-graph"></i>
            </div>
            <a href="#" class="small-box-footer">View <i class="fa fa-arrow-circle-right"></i></a>
          </div>
        </div>
              
        <!-- ./col -->
         <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-teal">
            <div class="inner">
              <h3  style="font-size:50px;font-weight: bolder; text-align: center"><%=($check.$Attendence())%></h3>

              <b>Staff  Attendance For Today</b>
            </div>
            <div class="icon">
              <i class="ion ion-pie-graph"></i>
            </div>
            <a href="#" class="small-box-footer">View <i class="fa fa-arrow-circle-right"></i></a>
          </div>
        </div>
      </div>        
  </section>
  
