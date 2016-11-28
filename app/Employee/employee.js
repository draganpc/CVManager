'use strict';

angular.module('cvMan.Employee', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/Employee', {
    templateUrl: 'Employee/Employee.html',
    controller: 'employeeCtrl'
  });
}])

.controller('employeeCtrl', [function() {

}]);