angular.module('modB',[])
            .controller('controllerB',['$scope',function($scope){
            console.log("inside Controller B");
            $scope.controllerB = {
                message:"Controller B says hii"
            }
        }]);