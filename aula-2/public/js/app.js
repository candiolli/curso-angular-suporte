var app = angular.module("listaTelefonica", ['ngRoute', 'ngAnimate']);

app.config(function($routeProvider, $locationProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'home.html'
        })
        .when('/lista', {
            templateUrl: 'lista.html',
            controller: 'ListaTelefonicaCtrl'
        })
        .when('/cadastro', {
            templateUrl: 'cadastro.html',
            controller: 'CadastroTelefonicaCtrl'
        })
        .otherwise({redirectTo: '/'});

        $locationProvider.html5Mode({
            enabled: true,
            requireBase: false
        });

});