angular.module('SwabhavTechLabs',['ui.router'])
    .config(function($stateProvider,$urlRouterProvider){
        $stateProvider.state('home',{
            url : "/home",
            templateUrl : "partiacal/home.html"
        })
        .state('about',{
            url : "/about",
            templateUrl : "partiacal/about.html"
        })
        .state('carrer',{
            url : "/carrer",
            templateUrl : "partiacal/carrer.html"
        })
        $urlRouterProvider.otherwise('/home');
    })
    
    