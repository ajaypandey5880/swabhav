var app = angular.module('SwabhavTechlabs',['ngRoute']);
     
    app.config(function($routeProvider){
        $routeProvider.when('/form',{templateUrl : 'form.html',
                    controller : 'formcontroller'

    }).when('/display',{templateUrl : 'display.html',
                    controller : 'displaycontroller'

    }).when('/home',{templateUrl : 'home.html'
    }).when('/edit/:UID',{templateUrl : 'edit.html',
                        controller : 'editcontroller'
    })
})


    app.factory('StudentDetailService',['$http','$q',function($http,$q){
    var serviceobj = {};

        serviceobj.updateStudentData = function(uid,Studentobj){
            return $q(function(resolve,reject){
                $http.put('http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/'+uid, Studentobj).then(function(response){
                    alert("Data of "+Studentobj.name+" Added");
                    window.location = "#/display";
                }, function(reject){
                    alert("Problem Occured");
                });
            })
        }

        serviceobj.getEmployeeById = function(uid){
            return $q(function(resolve,reject){
                $http({
                    method : "GET",
                    url : "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+uid
                }).then(function(response){
                    if(response.status== 200){
                        resolve(response.data);
                    }else{
                        reject("Data Can't Be Fetched");
                    }
                }).catch(function(err){
                    reject("Data Can't Be Fetched")

                })
            })
        }

        serviceobj.getEmployeeList = function(){
                return $q(function(resolve,reject){
                    $http({
                        method : "GET",
                        url : "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"
                    }).then(function(response){
                        if(response.status== 200){
                            resolve(response.data);
                        }else{
                            reject("Data Can't Be Fetched");
                        }
                    }).catch(function(err){
                        reject("Data Can't Be Fetched")

                    })
                })
            }

            serviceobj.addNewStudent = function(Studentobj){
                    $http.post('http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/', Studentobj).then(function(response){
                    alert("Data of "+Studentobj.name+" Added");
                    window.location = "#/display";
                }, function(reject){
                    alert("Problem Occured");
                });
                
                
            }

            return serviceobj;
        }])

        app.controller('displaycontroller',['$scope','StudentDetailService',function($scope,StudentDetailService){
            $scope.SpinnerHide = true;
            $scope.StudentDetailList ;
            $scope.SpinnerHide = false;
            StudentDetailService.getEmployeeList().then(function(response){
            $scope.StudentDetailList = response;
            console.log($scope.StudentDetailList);
            $scope.SpinnerHide = true;
            $scope.hidden = false; 
            }).catch(function(reject){
                $scope.SpinnerHide = true;
                alert(reject);
            }) 

        }])

        app.controller('editcontroller',['$scope','$routeParams','StudentDetailService',function($scope,$routeParams,StudentDetailService){
            $scope.uid = $routeParams.UID;
            $scope.studentobj ;

            StudentDetailService.getEmployeeById($scope.uid).then(function(response){
            $scope.studentobj = response;
            console.log($scope.serviceobj);
            $scope.inputRollNo = $scope.studentobj.rollno;
            $scope.inputName = $scope.studentobj.name;
            $scope.inputAge = $scope.studentobj.age;
            $scope.inputEmail = $scope.studentobj.email;
            $scope.inputDate = $scope.studentobj.date;
            $scope.isMale = $scope.studentobj.isMale;

            $scope.editStudentData = function(){
                let newStudentobj = {
                    rollNo : $scope.inputRollNo,
                    name : $scope.inputName,
                    age : $scope.inputAge,
                    email : $scope.inputEmail,
                    date : Studentdate,
                    isMale : $scope.GenderOption
                }
                StudentDetailService.updateStudentData($scope.uid,newStudentobj)
            }
            $scope.SpinnerHide = true;
            }).catch(function(reject){
                $scope.SpinnerHide = true;
                alert(reject);
            }) 
        }])

        app.controller('formcontroller',['$scope','$filter','StudentDetailService',function($scope,$filter,StudentDetailService){

            $scope.addStudentDetails = function(){
                let Studentdate = $filter('date')($scope.inputDate,'short');
                let studentobj = {
                    rollNo : $scope.inputRollNo,
                    name : $scope.inputName,
                    age : $scope.inputAge,
                    email : $scope.inputEmail,
                    date : Studentdate,
                    isMale : $scope.GenderOption
                }
                console.log(studentobj);
                StudentDetailService.addNewStudent(studentobj);
               
            }
        }])    