app.controller("formTelefonicaCtrl", function ($scope, $rootScope) {
    
    $scope.app = "Form Telefonica";

    $scope.adicionarContato = function(contato) {
        $rootScope.contatos.push(angular.copy(contato));
        delete $rootScope.contato;
    };
    
});