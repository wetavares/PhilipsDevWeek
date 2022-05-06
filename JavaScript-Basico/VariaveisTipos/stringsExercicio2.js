let nome = new String('Wemerson');

let sobreNome = ' Tavares';

console.log(sobreNome.split(""));

let concatena = nome.concat(sobreNome);

console.log(concatena.split(""));

let esplode = concatena.split(" "); //esplode a string ao encontrar o caracter indicado " ", 
//caso não tenha nada indicado divide toda a string caracter por caracter.

console.log(esplode);

console.log(esplode.includes("Tavares")); // verifica se possui a string indicada " "

console.log(concatena.startsWith("T")); //verifica se começa com a string indicada " "

console.log(concatena.endsWith("s")); //verifica se termina com a string inidicada " "

console.log(concatena.replace(" ","-"));

console.log(concatena.replace("-"," ")); //muda o caracter conforme o solicitado "-" por " "

