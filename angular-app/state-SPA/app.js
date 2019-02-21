angular.module('SwabhavTechLabs',['ui.router'])
    .config(function($stateProvider,$urlRouterProvider){
        $stateProvider.state('home',{
            url : "/home",
            controller : 'homecontroller',
            templateUrl : "partiacal/home.html"
        })
        .state('about',{
            url : "/about",
            controller : 'aboutcontroller',
            templateUrl : "partiacal/about.html"
        })
        .state('carrer',{
            url : "/carrer",
            controller : 'carrercontroller',
            templateUrl : "partiacal/carrer.html"
        })
        .state('contact',{
            url : '/contact',
            templateUrl :"partiacal/contact.html"
        })
        .state('contact.list',{
            url : '/List',
            templateUrl :"partiacal/contactList.html"
        })
        .state('contact.summary',{
            url : '/Summary',
            templateUrl :"partiacal/contactSummary.html"
        })
        $urlRouterProvider.otherwise('/home');
    })
    
    