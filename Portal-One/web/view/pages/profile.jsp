<%-- 
    Document   : profile
    Created on : Feb 18, 2018, 9:45:17 PM
    Author     : user
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<style>
   
    .nlabel{
        font-family: "Times Roman";
        font-size: 30px;
        font-weight: bolder;
        
        
    }  
    .ntext{
        font-family: cursive;
        font-size: 20px;
        border: none;
        background: transparent;
        
    }
 </style>
<section class="header">
      <h1>
          &nbsp;&nbsp;<i class="fa fa-user">&nbsp;User Profile <small>Personal Data</small></i>
       
      </h1>
      <ol class="breadcrumb">
        <li><a href="AdminPortal.jsp"><i class="fa fa-home"></i> Home</a></li>
        <li class="active">Edit Profile</li>
      </ol>
    </section>
<section class="container">
    <div>
        <form>
        <div align="left">
            <div><img src="img/avatar1.png" width="200px" class="img-circle"/></div>
            <input type="file" name="Passport" value="" width="200" />
        </div>
        </form>
        <hr>
        <form>
        <div class="responsive">
               <div class="g-position--relative g-bg-color--primary">
            <div class="g-container--md g-padding-y-80--xs g-padding-y-125--sm">
                 
            <div class="row g-row-col-5 g-margin-b-50--xs">
                        <div class="col-sm-6 g-margin-b-30--xs g-margin-b-0--md">
                            <label class="nlabel">First-Name</label><input type="text"  value="oyeniyi" name="Sname" style="background-color: transparent" class="form-control s-form-v3__input ntext" id="atxt" readonly="true">
                           
                        </div>
                        <div class="col-sm-6">
                         <label class="nlabel">Last-Name</label>   <input type="text" value="Adedayo" name="Oname" style="background-color: transparent" class="form-control s-form-v3__input ntext"  id="btxt" readonly="true">
                             
                        </div>
                    </div> 
                        <br>
                    <div class="row g-row-col-5 g-margin-b-50--xs">
                        <div class="col-sm-6 g-margin-b-30--xs g-margin-b-0--md">
                            <label class="nlabel">Gender</label> <input type="text" value="Male" name="gender" style="background-color: transparent" class="form-control s-form-v3__input ntext" id="ctxt" readonly="true">
                    
                        </div>
                        <div class="col-sm-6">
                           <label class="nlabel">Phone-Contact</label> <input type="tel" name="contact" style="background-color: transparent" value="12345678"  class="form-control s-form-v3__input ntext" id="dtxt" readonly="true">
                        </div>
                    </div>
                        <br>
                       <div class="row g-row-col-5 g-margin-b-50--xs">
                        <div class="col-sm-6 g-margin-b-30--xs g-margin-b-0--md">
                           <label class="nlabel">E-Mail</label><input type="email" name="mail" style="background-color: transparent" value="MA@gmail.bom"  class="form-control s-form-v3__input ntext" id="etxt" readonly="true">
                     
                        </div>
                        <div class="col-sm-6">
                         <label class="nlabel">Address</label><input type="text" name="address" style="background-color: transparent" value="surulere"  class="form-control s-form-v3__input ntext" id="ftxt" readonly="true">
                     
                        </div>
                    </div>
                        <br>
                    <div class="row g-row-col-5 g-margin-b-50--xs">
                        <div class="col-sm-6 g-margin-b-30--xs g-margin-b-0--md">
                            <label class="nlabel">User-ID</label> <input type="text" value="admin001" name="username" style="background-color: transparent" class="form-control s-form-v3__input ntext" id="gtxt" readonly="true" >
                    
                        </div>
                        <div class="col-sm-6">
                           <label class="nlabel">Password</label> <input type="text" name="password" style="background-color: transparent" value="12345678"  class="form-control s-form-v3__input ntext" id="htxt" readonly="true">
                        </div>
                    </div>
                        <br>
                    <div class="row g-row-col-5 g-margin-b-50--xs">
                        <div class="col-sm-6 g-margin-b-30--xs g-margin-b-0--md">
                            <label class="nlabel">Religion</label> <input type="text" value="Christian" name="religion" style="background-color: transparent" class="form-control s-form-v3__input ntext" id="itxt" readonly="true" >
                    
                        </div>
                        <div class="col-sm-6">
                           <label class="nlabel">Education Qualification</label> <input type="text" name="contact" style="background-color: transparent" value="BSCE"  class="form-control s-form-v3__input ntext" id="jtxt" readonly="true">
                        </div>
                    </div>
                        
                                 </div>
                  </div>
            <br>
            <br>
           
        </div>
         <div align="center"><button id="Edit" class="btn btn-primary"style="font-weight: bold; width:150px; height: 40px;" >Edit</button>&nbsp;&nbsp;
                    <button class="btn btn-success"style="font-weight: bold; width:150px; height: 40px;"  >Save</button>&nbsp;&nbsp;
                    <button id="Cancel" class="btn btn-warning" style="font-weight: bold; width:150px; height: 40px;" >Cancel</button></div>
        </form>
    </div>
    <br>
    <br>
    <br>
</section>
 <script>
    $('#Edit').on('click', function(){
       $("#atxt").prop("readonly",false); 
       $("#atxt").css("background-color","white");
       $("#btxt").prop("readonly",false); 
       $("#btxt").css("background-color","white");
       $("#ctxt").prop("readonly",false); 
       $("#ctxt").css("background-color","white");
       $("#dtxt").prop("readonly",false); 
       $("#dtxt").css("background-color","white");
       $("#etxt").prop("readonly",false); 
       $("#etxt").css("background-color","white");
       $("#ftxt").prop("readonly",false); 
       $("#ftxt").css("background-color","white");
       $("#gtxt").prop("readonly",false); 
       $("#gtxt").css("background-color","white");
       $("#htxt").prop("readonly",false); 
       $("#htxt").css("background-color","white");
       $("#itxt").prop("readonly",false); 
       $("#itxt").css("background-color","white");
       $("#jtxt").prop("readonly",false); 
       $("#jtxt").css("background-color","white");
       
    });
    $('#Cancel').on('click', function(){
       $("#atxt").prop("readonly",true); 
       $("#atxt").css("background-color","transparent");
       $("#btxt").prop("readonly",true); 
       $("#btxt").css("background-color","transparent");
       $("#ctxt").prop("readonly",true); 
       $("#ctxt").css("background-color","transparent");
       $("#dtxt").prop("readonly",true); 
       $("#dtxt").css("background-color","transparent");
       $("#etxt").prop("readonly",true); 
       $("#etxt").css("background-color","transparent");
       $("#ftxt").prop("readonly",true); 
       $("#ftxt").css("background-color","transparent");
       $("#gtxt").prop("readonly",true); 
       $("#gtxt").css("background-color","transparent");
       $("#htxt").prop("readonly",true); 
       $("#htxt").css("background-color","transparent");
       $("#itxt").prop("readonly",true); 
       $("#itxt").css("background-color","transparent");
       $("#jtxt").prop("readonly",true); 
       $("#jtxt").css("background-color","transparent");
       
    });
 </script>