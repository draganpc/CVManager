'use strict';

angular.module('cvMan.Reports', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/Reports', {
    templateUrl: 'Reports/Reports.html',
    controller: 'repoCtrl'
  });
}])

.controller('repoCtrl', [function() {

}]);