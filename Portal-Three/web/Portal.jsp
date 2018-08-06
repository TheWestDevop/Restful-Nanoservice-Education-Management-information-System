
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html ng-app="myApp">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>EDUCATION | STUDENT PORTAL </title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.7 -->
  <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="bower_components/font-awesome/css/font-awesome.min.css">

  <!-- Theme style -->
  <link rel="stylesheet" href="dist/css/AdminLTE.min.css">
  <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  <link rel="stylesheet" href="dist/css/skins/_all-skins.min.css">
  <!-- bootstrap wysihtml5 - text editor -->
  <link rel="stylesheet" href="plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
  
  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->

  <!-- Google Font -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
<script src="canvasjs-2.0.1/canvasjs.min.js" type="text/javascript"></script> 
 
</head>
<body ng-controller="mainController"  data-spy="scroll" data-target=".navbar" data-offset="50" class="fixed hold-transition skin-blue sidebar-mini">
    
<div class="wrapper">

  <header class="main-header">
    <!-- Logo -->
    <a  class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"  style="font-family: cursive; Display:block;"><b style="width:auto;max-width:50px; "><%=request.getAttribute("school")%></span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"  style="font-family: cursive;"><b><%=request.getAttribute("school")%></b></span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
      <!-- Sidebar toggle button-->
      <a  class="sidebar-toggle" data-toggle="push-menu" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>

      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          <!-- Notifications: style can be found in dropdown.less -->
          <li class="dropdown notifications-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-bell-o"></i>
              <span class="label label-warning">10</span>
            </a>
            <ul class="dropdown-menu">
              <li class="header">You have 10 notifications</li>
              <li>
                <!-- inner menu: contains the actual data -->
                <ul class="menu">
                  <li>
                    <a href="#">
                      <i class="fa fa-users text-aqua"></i> 5 new members joined today
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <i class="fa fa-warning text-yellow"></i> Very long description here that may not fit into the
                      page and may cause design problems
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <i class="fa fa-users text-red"></i> 5 new members joined
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <i class="fa fa-shopping-cart text-green"></i> 25 sales made
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <i class="fa fa-user text-red"></i> You changed your username
                    </a>
                  </li>
                </ul>
              </li>
              <li class="footer"><a href="#">View all</a></li>
            </ul>
          </li>
     
          <!-- User Account: style can be found in dropdown.less -->
          <li class="dropdown user user-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <img src="img/icon/1.png" class="user-image" alt="User Image">
              <span class="hidden-xs"><i class="fa fa-sign-out"></i></span>
            </a>
              <ul style="background-color:skyblue" class="dropdown-menu">
              <!-- User image -->
              <li class="user-header" >
                <img src="img/icon/1.png" class="img-circle" alt="User Image">
                <br><b style="color: white;" ><%=request.getAttribute("username")%> STUDENT</b>
              </li>
 
              <!-- Menu Footer-->
              <li style="background-color:#338be1" class="user-footer" style="border-radius: 10px">
                   <button style="color: white;" class="btn btn-success btn-flat btn-block">My Profile</button>
                  <button style="color: white; background-color: orangered;" class="btn btn-flat btn-block">Sign out</button>
              
              </li>
            </ul>
          </li>
        </ul>
      </div>
    </nav>
  </header>
 <!-- Left side column. contains the logo and sidebar -->
  <aside id="sideba" class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
      <!-- Sidebar user panel -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="img/icon/1.png" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p><%=request.getAttribute("username")%></p>
          <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
        </div>
      </div>
      <!-- search form -->
      <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control" placeholder="Search...">
          <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
        </div>
      </form>
      <!-- /.search form -->
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu" data-widget="tree">
        <li class="header" style="color:whitesmoke; ">MAIN NAVIGATION</li>
        <li>
          <a href="#/">
            <i class="fa fa-home"></i> <span>Home</span>
            <span class="pull-right-container">
              <i class="fa  fa-hand-o-left pull-right"></i>
            </span>
          </a>
 
        </li>
        <li>
           <a href="#/Profile"  >
            <i class="fa fa-edit"></i>
            <span>Edit Profile</span>
         <span class="pull-right-container">
              <i class="fa  fa-hand-o-left pull-right"></i>
            </span>
          </a>
        </li>
         <li>
           <a href="#/Dashboard"  >
            <i class="fa fa-dashboard"></i>
            <span>Dashboard</span>
         <span class="pull-right-container">
              <i class="fa  fa-hand-o-left pull-right"></i>
            </span>
          </a>
        </li>
        <li>
           <a href="#/Behaviorist"  >
            <i class="fa fa-comment"></i>
            <span>Behaviourist</span>
         <span class="pull-right-container">
              <i class="fa  fa-hand-o-left pull-right"></i>
            </span>
          </a>
        </li>
       <li >
          <a href="#/Academics">
            <i class="fa fa-graduation-cap"></i> <span>Academics</span>
            <span class="pull-right-container">
              <i class="fa  fa-hand-o-left pull-right"></i>
            </span>
          </a>
          
        </li>
        <li >
          <a href="#/Budget">
            <i class="fa fa-money"></i>
            <span>Budget</span>
            <span class="pull-right-container">
          <i class="fa  fa-hand-o-left pull-right"></i>
            </span>
          </a>
            
        </li>
        <li >
          <a href="#/routine">
            <i class="fa fa-tasks"></i>
            <span>Subject  & Class routine</span>
            <span class="pull-right-container">
            <i class="fa  fa-hand-o-left pull-right"></i>
            </span>
          </a>
        
        </li>
        <li >
          <a href="#/Admission">
            <i class="fa fa-child"></i> <span>Admission</span>
            <span class="pull-right-container">
             <i class="fa  fa-hand-o-left pull-right"></i>
            </span>
          </a>
          
        </li>
        <li>
          <a href="#/Exam">
            <i class="fa fa-book"></i> <span>Examination</span>
            <span class="pull-right-container">
              <i class="fa  fa-hand-o-left pull-right"></i>
            </span>
          </a>
        </li>
        <li>
          <li >
          <a href="#/Utilities">
            <i class="fa fa-table"></i> <span>Utilities</span>
            <span class="pull-right-container">
              <i class="fa  fa-hand-o-left pull-right"></i>
            </span>
          </a>
          
        </li>
        </li>
        
        <li >
          <a href="#/E-learning">
            <i class="fa fa-university"></i> <span>E-Learning</span>
            <span class="pull-right-container">
          <i class="fa  fa-hand-o-left pull-right"></i>
            </span>
          </a>
          
        </li>
     
        <li ><a href="#/Attendence"><i class="fa fa-group"></i> <span>Attendance</span>
                <span class="pull-right-container">
             <i class="fa  fa-hand-o-left pull-right"></i>
            </span></a>
         
        </li>
      </ul>
    </section>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper" style="background-image:url('img/35.jpg'); background-repeat:no-repeat; background-size:cover;">
 
    <!-- Main content -->
    <div class="ng-view"></div>   
  </div>
   
  

 <!-- jQuery 3 -->
<script src="bower_components/jquery/dist/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="bower_components/jquery-ui/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
  $.widget.bridge('uibutton', $.ui.button);
</script>

<!--Angular UI -->
<script src="Angular/angular.min.js" type="text/javascript"></script>
 <script src="Angular/angular.js" type="text/javascript"></script>
 <script src="Angular/angular-route.js" type="text/javascript"></script>
<script src="PrimarySystem/controllers.js" type="text/javascript"></script>

<!-- Bootstrap WYSIHTML5 -->
<script src="plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<!-- Slimscroll -->
<script src="bower_components/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<!-- AdminLTE App -->

<script src="dist/js/adminlte.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="PrimarySystem/Chart/canvasjs.min.js" type="text/javascript"></script>
<script src="PrimarySystem/Chart/jquery.canvasjs.min.js" type="text/javascript"></script>
<script src="PrimarySystem/ControllerTwo.js"></script>
<script src="PrimarySystem/jquery-3.1.1.js" type="text/javascript"></script>


   

</body>
</html>
