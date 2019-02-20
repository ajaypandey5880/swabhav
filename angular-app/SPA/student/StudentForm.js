var app = angular.module('SwabhavTechlabs',['ngRoute']);
     
    app.config(function($routeProvider){
        $routeProvider.when('/form',{templateUrl : 'form.html',
                    controller : 'formcontroller'

    }).when('/display',{templateUrl : 'display.html',
                    controller : 'displaycontroller'

    }).when('/home',{templateUrl : 'home.html'
    }).when('/edit/:UID',{templateUrl : 'edit.html',
                        controller : 'editcontroller'
    }).when('/login',{templateUrl : 'login.html',
                    controller : 'logincontroller'
    })
})

    app.constant('constant',{
            StudentUrl: 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/'
        });

    app.factory('loginService',['$rootScope',function($rootScope){
    var serviceobj = {};

        serviceobj.login = function(userName){
            if(sessionStorage.getItem('isvalid')==null){  
                
                $rootScope.isValidUser = true;
                sessionStorage.setItem('isvalid',JSON.stringify($rootScope.isValidUser));
            }  
        }

        serviceobj.logout = function(){
            sessionStorage.clear();
            window.location = "#/display"
        }
        

    return serviceobj;
    }])

    app.factory('StudentDetailService',['$http','$q','$rootScope','constant',function($http,$q,$rootScope,constant){
    var serviceobj = {};
    

        serviceobj.updateStudentData = function(uid,Studentobj){
            return $q(function(resolve,reject){
                $http.put(constant.StudentUrl+uid, Studentobj).then(function(response){
                    alert("Data of "+Studentobj.name+" Added");
                    window.location = "#/display";
                }, function(reject){
                    alert("Problem Occured");
                });
            })
        }

        serviceobj.getStudentbyId = function(uid){
            return $q(function(resolve,reject){
                $http({
                    method : "GET",
                    url : constant.StudentUrl+uid
                }).then(function(response){
                    if(response.status== 200){
                        console.log(response.data);
                        let data = response.data[0];
                        resolve(data);
                    }else{
                        reject("Data Can't Be Fetched");
                    }
                }).catch(function(err){
                    reject("Data Can't Be Fetched")

                })
            })
        }

        serviceobj.getStudentList = function(){
                return $q(function(resolve,reject){
                    $http({
                        method : "GET",
                        url : constant.StudentUrl
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
                    $http.post(constant.StudentUrl, Studentobj).then(function(response){
                    alert("Data of "+Studentobj.name+" Added");
                    window.location = "#/display";
                }, function(reject){
                    alert("Problem Occured");
                });
                
                
            }

            serviceobj.deleteStudentByID = function(UID){
                return $q(function(resolve,reject){
                    $http.delete(constant.StudentUrl+UID).then(function(response){
                        alert("Student data deleted");
                        window.location = "#/display";
                    }, function(reject){
                        alert("Problem Occured");
                    });
                })
            }

            return serviceobj;
        }])

        app.controller('logincontroller',["$rootScope",'loginService',"$scope",function($rootScope,loginService,$scope){
            $rootScope.isValidUser = sessionStorage.getItem('isvalid');
            $scope.checkUser = function(){             
                if($scope.UserName == $scope.Password){
                    
                    loginService.login($scope.UserName);
                    window.location = "#/display"              
            }
        }

            $scope.logout = function(){
                loginService.logout();
            }

        }])

        app.controller('displaycontroller',['$scope','$rootScope','StudentDetailService',function($scope,$rootScope,StudentDetailService){

            $rootScope.isValidUser = sessionStorage.getItem('isvalid');
            
            console.log($rootScope.isValidUser);
            $scope.SpinnerHide = true;
            $scope.StudentDetailList ;
            $scope.SpinnerHide = false;
            $scope.studentList = function(){
                StudentDetailService.getStudentList().then(function(response){
                $scope.StudentDetailList = response;
                console.log($scope.StudentDetailList);
                $scope.SpinnerHide = true;
                $scope.hidden = false; 
                }).catch(function(reject){
                    $scope.SpinnerHide = true;
                    alert(reject);
                }) 
        };
        $scope.studentList();
        }])

        app.controller('deletecontroller',['$scope','StudentDetailService',function($scope,StudentDetailService){

            $scope.deleteStudentData = function(uid){
                var ans = confirm("Do you want to delete data");
                if(ans){
                StudentDetailService.deleteStudentByID(uid);
                $scope.studentList();
                }
            }
        }])

        app.controller('editcontroller',['$scope','$filter','$routeParams','StudentDetailService',function($scope,$filter,$routeParams,StudentDetailService){
            $scope.uid = $routeParams.UID;
            $scope.studentobj ;

            StudentDetailService.getStudentbyId($scope.uid).then(function(response){
            console.log(response);
            $scope.inputRollNo = response.rollNo;
            $scope.inputName = response.name;
            $scope.inputAge = response.age;
            $scope.inputEmail = response.email;
            $scope.inputDate = new Date(response.date);
            $scope.GenderOption = response.isMale;
            console.log($scope.GenderOption);
           /*if($scope.GenderOption){
                $('input:radio[name=male]').checked = true ;
            }else{
                $('input:radio[name=female]').checked = true ;
            }*/

            $scope.editStudentData = function(){
                let Studentdate = $filter('date')($scope.inputDate,'short');
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

        app.directive('pageHeader',function(){
            return{
                templateUrl : 'header.html'
            };
        })

        app.directive('pageFooter',function(){
            return{
                templateUrl : 'footer.html'
            };
        })

        