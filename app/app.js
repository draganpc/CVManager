var cvMan = angular.module('cvMan', ['ngRoute']);

cvMan.config(function($routeProvider) {
    $routeProvider

        .when('/', {
        templateUrl: 'index.html'
    })

        .when('/reports', {
        templateUrl:'./app/reports/reports.html',
        controller: 'reportsController'
    })

        .when('/employee', {
            templateUrl:'./app/employee/employee.html',
            controller: 'employeeController'
        })

        .when('/upload', {
            templateUrl: './app/upload/upload.html',
            controller: 'uploadController'
        });
});




