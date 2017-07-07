var app = angular.module("listaTelefonica", ["ngRoute"]);

app.config(function($routeProvider, $locationProvider) {
    $routeProvider
        .when('/lista', {
            templateUrl: 'index.html',
            controller: 'ListaTelefonicaCtrl',
            resolve: {
                delay: function($q, $timeout) {
                    var delay = $q.defer();
                    $timeout(delay.resolve, 1000);
                    return delay.promise;
                }
            }
        })
        .when('/form/:id', {
            templateUrl: 'form.html',
            controller: 'FormTelefonicaCtrl'
        });
        $locationProvider.html5Mode(true);
});