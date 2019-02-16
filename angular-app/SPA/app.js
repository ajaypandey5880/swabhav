angular.module('SwabhavTechLabs',['ngRoute'])
    .config(function($routeProvider){
        $routeProvider.when('/',{templateUrl : 'partiacal/home.html',
                                controller : 'homecontroller'
    }).when('/home',{templateUrl : 'partiacal/home.html',
                    controller : 'homecontroller'

    }).when('/about',{templateUrl : 'partiacal/about.html',
                    controller : 'aboutcontroller'
    }).when('/carrer',{templateUrl : 'partiacal/carrer.html',
                    controller : 'carrercontroller'
    })
    })