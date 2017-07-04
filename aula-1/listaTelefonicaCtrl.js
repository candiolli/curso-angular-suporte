var app = angular.module("listaTelefonica", []);

app.controller("listaTelefonicaCtrl", function ($scope) {
    $scope.app = "Lista Telefonica";
    $scope.mensagem = "Hello World! Angular JS";
    $scope.contato = {};

    $scope.contatos = [
        {id: 1, nome: "Joao", telefone:989698966},
        {id: 2, nome: "Maria", telefone:989698965},
        {id: 3, nome: "Priscila", telefone:989698964}
    ];

    $scope.operadoras = [
        {nome: "Oi", codigo: 14, categoria: "Celular"},
        {nome: "Vivo", codigo: 15, categoria: "Celular"},
        {nome: "Tim", codigo: 41, categoria: "Celular"},
        {nome: "GVT", codigo: 25, categoria: "Fixo"},
        {nome: "Embratel", codigo: 21, categoria: "Fixo"}
    ];

    $scope.adicionarContato = function(contato) {
        $scope.contatos.push(angular.copy(contato));
        delete $scope.contato;
    };

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