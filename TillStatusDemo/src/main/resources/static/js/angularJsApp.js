var app = angular.module('app', []);
 
//#######################
//JSA CONTROLLER
//#######################
 
app.controller('jsaController', function($scope, $http, $location) {
  $scope.listCustomers = [];
  
  // $scope.getAllTillStatus = 
  function getAllTillStatus(){
    // get URL
    var url = $location.absUrl() + "/hallfordsTillStatusAttributes";
    
    // do getting
    $http.get("http://localhost:8080/hallfordsTillStatusAttributes").then(function (response) {
      $scope.getDivAvailable = true;
      $scope.listCustomers = response.data;
    }, function error(response) {
      $scope.postResultMessage = "Error Status: " +  response.statusText;
    });
  }
  
  getAllTillStatus();
/*  alert("Successfully called API")*/
});