app.controller("ListaTelefonicaCtrl", function ($scope, $rootScope, $http, ContatoService) {
    
    $scope.app = "Lista Telefonica";
    
    $scope.contato = {};

    ContatoService.buscarTodos(function(data){
        $scope.contatos = data.data;
    });

    $scope.apagarContatos = function (contatos) {
        $scope.contatos = contatos.filter(function (contato) {
            if (!contato.selecionado) return contato;
        });
    };

    $scope.isContatoSelecionado = function (contatos) {
        return contatos.some(function (contato) {
            return contato.selecionado;
        });
    };
    
});