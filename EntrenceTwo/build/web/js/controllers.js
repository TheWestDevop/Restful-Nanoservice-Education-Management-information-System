/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var myEntrenceApp = angular.module('myEntrenceApp', []);



myEntrenceApp.controller('mainController', function($scope,$http) {
    $.ajax({
     type:'Post',
     url:'http://localhost:8080/ListOfSchool/getschool',
     headers:{
         Accept:"application/json; charset=utf-8",
         "Content-Type" : "application/json; charset=utf-8"
     }, 
    // dataType:'json',
     success: function(data){
        var student = $.parseJSON(data);
         var s = '';
         
         for(var a = 0; a<student.length; a++){
          
         s+='<option value="'+ student[a].SchoolID +'">'+ student[a].SchoolName+'&nbsp'+'</option>';
       
     
     }
    $('#selectskul').append(s);
     
     }
    
             });

}); 

