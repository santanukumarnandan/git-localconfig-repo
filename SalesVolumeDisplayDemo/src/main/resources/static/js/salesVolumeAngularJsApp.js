var app = angular.module('app', []);
 
//#######################
//JSA CONTROLLER
//#######################
 
app.controller('jsaController', function($scope, $http, $location) {
  $scope.emailContents = [];
  
  // $scope.getAllTillStatus = 
  function getEmailContents(){
    // get URL
    var url = $location.absUrl() + "/readHourlyOrderValue";
    
    // do getting
    $http.get("http://localhost:8080/readHourlyOrderValue").then(function (response) {
      $scope.getDivAvailable = true;
      $scope.emailContents = response.data;
    }, function error(response) {
      $scope.postResultMessage = "Error Status: " +  response.statusText;
    });
  }
  
  getEmailContents();
  alert("Successfully called API")
});