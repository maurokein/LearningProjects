//CREACIÓN DE UN SERVIDOR CON NODE JS 

// const http = require('http');

// const server = http.createServer((req, res) => {
//     res.status = 200;
//     res.setHeader('Content-Type', 'text/plain');
//     res.end('Hello World');
// });

// server.listen(3000, () => {
//     console.log('Server on port 3000');
// })

//CREACIÓN DE UN SERVIDOR CON EXPRESS JS

const express = require('express');

const app = express(); //requiero el módulo, se devuelve un objeto almacenado en la constante app, que es el servidor 

app.use(express.json());

app.get('/user',(req, res) => {
    res.json({
        username: 'James',
        lastname: 'Cameron'
    });
});//por defecto los navegadores hacer PETICIONES GET HTTP al servidor (ruta inicial de la app)

//creación dinámica de rutas con : 
app.post('/user/:id', (req, res) => {
    console.log(req.body);
    console.log(req.params);
    res.send('Post request received');
});

app.put('/contact', (req, res) => {
    res.send('Put request received');
});

app.delete('/test', (req, res) => {
    res.send('<h1>DELETE REQUESTE RECEIVED</h1>');
});

app.listen(3000, () => {
    console.log('Server on port 3000');
});