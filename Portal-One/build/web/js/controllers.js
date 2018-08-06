/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var myApp = angular.module('myApp', ['ngRoute']);



myApp.config(function($routeProvider){
    $routeProvider.when('/',{
        templateUrl : 'view/pages/first.jsp',
        controller : 'mainController'
    }).when('/Profile',{
        templateUrl : 'view/pages/profile.jsp',
        controller : 'profileController'
    }).when('/Dashboard',{
        templateUrl : 'view/pages/Dash.jsp',
        controller : 'DashController'
    }).when('/Behaviorist',{
        templateUrl : 'view/pages/behave.jsp',
        controller : 'BehaveController'
    }).when('/Academics',{
        templateUrl : 'view/pages/Academics.jsp',
        controller : 'AcademiController'
    }).when('/Budget',{
        templateUrl : 'view/pages/budget.jsp',
        controller : 'budgetController'
    }).when('/routine',{
        templateUrl : 'view/pages/routine.jsp',
        controller : 'BehaveController'
    }).when('/Admission',{
        templateUrl : 'view/pages/admission.jsp',
        controller : 'BehaveController'
    }).when('/Exam',{
        templateUrl : 'view/pages/exam.jsp',
        controller : 'AcademiController'
    }).when('/Utilities',{
        templateUrl : 'view/pages/utilities.jsp',
        controller : 'budgetController'
    }).when('/E-learning',{
        templateUrl : 'view/pages/elearning.jsp',
        controller : 'BehaveController'
    }).when('/Attendence',{
        templateUrl : 'view/pages/Attendence.jsp',
        controller : 'BehaveController'
    }).when('/Student',{
        templateUrl : 'view/pages/TotalStudent.html',
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