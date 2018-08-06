/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var myApp = angular.module('myApp', ['ngRoute']);



myApp.config(function($routeProvider){
    $routeProvider.when('/',{
        templateUrl : 'PrimarySystem/pages/first.jsp',
        controller : 'mainController'
    }).when('/Profile',{
        templateUrl : 'PrimarySystem/pages/profile.jsp',
        controller : 'profileController'
    }).when('/Dashboard',{
        templateUrl : 'PrimarySystem/pages/Dash.jsp',
        controller : 'DashController'
    }).when('/Behaviorist',{
        templateUrl : 'PrimarySystem/pages/behave.jsp',
        controller : 'BehaveController'
    }).when('/Academics',{
        templateUrl : 'PrimarySystem/pages/Academics.jsp',
        controller : 'AcademiController'
    }).when('/Budget',{
        templateUrl : 'PrimarySystem/pages/budget.jsp',
        controller : 'budgetController'
    }).when('/routine',{
        templateUrl : 'PrimarySystem/pages/routine.jsp',
        controller : 'BehaveController'
    }).when('/Admission',{
        templateUrl : 'PrimarySystem/pages/admission.jsp',
        controller : 'BehaveController'
    }).when('/Exam',{
        templateUrl : 'PrimarySystem/pages/exam.jsp',
        controller : 'AcademiController'
    }).when('/Utilities',{
        templateUrl : 'PrimarySystem/pages/utilities.jsp',
        controller : 'budgetController'
    }).when('/E-learning',{
        templateUrl : 'PrimarySystem/pages/elearning.jsp',
        controller : 'BehaveController'
    }).when('/Attendence',{
        templateUrl : 'PrimarySystem/pages/Attendence.jsp',
        controller : 'BehaveController'
    }).when('/Student',{
        templateUrl : 'PrimarySystem/pages/TotalStudent.html',
        controller : 'StudentController'
    });
});


myApp.controller('mainController', function($scope) {


}); 


myApp.controller('StudentController', function($scope,http) {
   
   
});
myApp.controller('profileController', function($scope) {


});
myApp.controller('DashController', function($scope) {


});
myApp.controller('BehaveController', function($scope) {


});