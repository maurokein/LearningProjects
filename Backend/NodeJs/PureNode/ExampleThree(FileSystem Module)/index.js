const fs = require('fs');

fs.writeFile('./text.txt', 'Line 1', function (err) {
    if(err){
        console.log(err);
    }else{
        console.log('File created succesfully');
    }
})

fs.writeFile('./text2.txt', 'Line 1 Text 2', function (err) {
    if(err){
        console.log(err);
    }else{
        console.log('File created succesfully');
    }
});

fs.readFile('./text.txt', function(err, data) {
    if(err){
        console.log(err)
    }else{
        console.log(data.toString());
    }
} )

console.log('Last code line');