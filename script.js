var cvManager = angular.module('cvManager',['ngRoute']);

cvManager.config(function ($routeProvider) {
    $routeProvider

        .when ('/', {
            templateUrl: 'pages/home.html',
            controller: 'homeController'
        })
        .when ('/upload', {
            templateUrl: 'pages/upload.html',
            controller: 'uploadController'
    })
        .when('/reports', {
            templateUrl: 'pages/reports.html',
            controller: 'reportsController'
        })
        .when ('/employee', {
        templateUrl:'pages/employee.html',
        controller: 'employeeController'
    })
        .when ('/smartsearch', {
        templateUrl: 'pages/smartsearch.html',
        controller: 'smartsearchController'
    })

        .otherwise({
            redirectTo: '/'
        });
});

cvManager.controller('homeController', function($scope) {
    $scope.message = 'I HOME RABOTI'
});

cvManager.controller('uploadController', function($scope){
    $scope.message = 'UPLOAD page eve sfakas'
});

cvManager.controller('reportsController', function($scope) {
    $scope.message = 'eve go da recime'
});

cvManager.controller('mainController', function($scope){
    $scope.message = 'i ova raboti';
});

cvManager.controller('employeeController', function($scope) {
    $scope.message = 'I EMPLOYEE RABOTIIIII'
});

cvManager.controller('smartsearchController', function($scope) {
    $scope.message = 'I SMART SRCHO RABOTIII INSHALA'
});