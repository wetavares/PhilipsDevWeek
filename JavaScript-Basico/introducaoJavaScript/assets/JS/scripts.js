var currentNumberWarapper = document.getElementById("currentNumber");
var buttonDisable = document.getElementsByTagName('button');

var currentNumber = 0;

console.log(buttonDisable);
function increment(){
    currentNumber = currentNumber + 1;
    if(currentNumber >=0 ){
        currentNumberWarapper.style.color = ''
    }
    if(currentNumber === 10){
        buttonDisable['adicionar'].disabled = true;
        alert('Conta somente até 10');
    }
    else{
        buttonDisable['subtrair'].disabled = false;
    }
    currentNumberWarapper.innerHTML = currentNumber;

}

function decrement(){
    currentNumber = currentNumber - 1;
    if(currentNumber < 0){
        currentNumberWarapper.style.color = 'red';
    }
    if(currentNumber === -10){
        buttonDisable['subtrair'].disabled = true;
        alert('Conta somente até -10');
    }
    else{
        buttonDisable['adicionar'].disabled = false;
    }
    currentNumberWarapper.innerHTML = currentNumber;
}