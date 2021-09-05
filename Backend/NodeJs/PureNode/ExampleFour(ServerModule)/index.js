const http = require('http');

const colors = require('colors');

const handleServer = function(req, res){
    res.writeHead(200, { 'Content-Type': 'text/html' });
    res.writeHead(200, { 'Content-Type': 'text plain' });
    res.write('<h1>Hola amigo, Node JS te saluda</h1>');
    res.write('This is a simple text');
    res.end();//una vez enviada la respuesta, puede seguir recibiendo peticiones de otros usuarios. 
}

const server = http.createServer(handleServer);

server.listen(3000, function(){
    console.log('Server on port 3000'.blue);
});