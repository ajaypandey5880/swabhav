angular.module('SwabhavTechLabs')
    .controller('homecontroller',function($scope){
        $scope.data = "This is home Controller";
    }).controller('aboutcontroller',function($scope){
        $scope.data = "This is About Controller"
    }).controller('carrercontroller',function($scope){
        $scope.data = "This is Carrer Controller"
    })