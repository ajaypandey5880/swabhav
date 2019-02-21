angular.module('modC',[])
            .controller('controllerC',['$scope',function($scope){
            console.log("inside Controller C");
            $scope.controllerC = {
                message:"Controller C says hii"
            }
        }]);