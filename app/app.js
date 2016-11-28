'use strict';

// Declare app level module which depends on views, and components
angular.module('cvMan', [
  'ngRoute',
  'cvMan.Reports',
  'cvMan.Employee',
  'cvMan.version'
]).
config(['$locationProvider', '$routeProvider', function($locationProvider, $routeProvider) {
  $locationProvider.hashPrefix('!');

  $routeProvider.otherwise({redirectTo: '/Reports'});
}]);
