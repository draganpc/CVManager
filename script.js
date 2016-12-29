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

cvManager.controller('uploadController', ['$scope', 'fileUpload', function($scope, fileUpload){
    $scope.uploadFile = function(){
        var file = $scope.myFile;

        console.log('file is ' );
        console.dir(file);

        //VNESI LEGIT URL
        var uploadUrl = "/fileUpload";
        fileUpload.uploadFileToUrl(file, uploadUrl);
    };
}]);


cvManager.controller('mainController', function($scope){
    $scope.message = 'i ova raboti';
});

cvManager.controller('employeeController', function($scope) {

  $scope.newUser = {};
  $scope.clickedUser = {};

    $scope.users = [
        {firstName: "Goce", lastName: "Delcev"},
        {firstName: "Pitu", lastName: "Guli"},
        {firstName: "Dame", lastName: "Gruev"}
    ];

  $scope.saveUser = function(){
      $scope.users.push($scope.newUser);
      $scope.newUser = {};
  };

  $scope.selectUser = function (user) {
      $scope.clickedUser = user;
  };

  $scope.updateUser = function(){

  };

  $scope.deleteUser = function(){
      $scope.users.splice($scope.users.indexOf($scope.clickedUser), 1);
  };
});

