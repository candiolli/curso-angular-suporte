app.controller("CadastroTelefonicaCtrl", function ($scope, $rootScope, ContatoService) {
    
    $scope.adicionarContato = function(contato) {
        ContatoService.salvarTodos(contato);
        delete $rootScope.contato;
    };
    
    $scope.operadoras = [
        {nome: "Oi", codigo: 14, categoria: "Celular"},
        {nome: "Vivo", codigo: 15, categoria: "Celular"},
        {nome: "Tim", codigo: 41, categoria: "Celular"},
        {nome: "GVT", codigo: 25, categoria: "Fixo"},
        {nome: "Embratel", codigo: 21, categoria: "Fixo"}
    ];

});