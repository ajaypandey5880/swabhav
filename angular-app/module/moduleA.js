angular.module('modA',['modB','modC'])
            .controller('controllerA',['$scope','$rootScope',function($scope,$rootScope){
            console.log("inside Controller A");
            $scope.controllerA = {
                message:"Controller A says hii"
            }
            $rootScope.company='swabhavTechlabs'
            console.log($rootScope);
        }]);