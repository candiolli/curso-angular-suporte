app.service('ContatoService', function($http) {
    
    this.buscarTodos = function() {
        $http({
            method: 'GET',
            url: 'localhost:8080/api/contato/buscarTodos',
            headers: {'Content-Type': 'application/json'}
        }).then(function successCallback(response) {
            return response;
        }, function errorCallback(response) {
        });
    };

    this.salvarTodos = function(contato) {
        
        return contatos.push(contato);
    };
});