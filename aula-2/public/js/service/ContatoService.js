app.service('ContatoService', function($http) {
    
    var lista = [
        {id:1,name:'JOAO',telefone:989698966,idOperadora:14},
        {id:2,name:'Maria',telefone:989698965,idOperadora:41},
        {id:3,name:'Priscila',telefone:989698964,idOperadora:21}
    ];

    this.buscarTodos = function(callback) {
        
        // return lista;

        $http({
            method: 'GET',
            url: 'http://localhost:8080/api/contato/buscarTodos'
        }).then(function successCallback(response) {
            return callback(response);
        }, function errorCallback(response) {
        });
    };

    this.salvarTodos = function(contato) {
        
        return contatos.push(contato);
    };
});