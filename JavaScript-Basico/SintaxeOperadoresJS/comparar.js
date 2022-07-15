function comparar(valor1,valor2){
    let num1 = Number(valor1);
    let num2 = Number(valor2);

   if(valor1 == "" || valor2 == "") return alert('Digite dois numeros.');
   if(isNaN(num1) || isNaN(num2)) return alert('Digite apenas Numeros. (' + num1 +' - '+ num2 +')'); //typeof(num1)

    const primeiraFrase = montaPrimeiraFrase(num1, num2);
    const segundaFrase = montaSegundaFrase(num1, num2);

    alert(primeiraFrase + segundaFrase);
}

function montaPrimeiraFrase(num1, num2){
    let saoIguais = '';

    if(num1 !== num2){
        saoIguais = ' não';
    }

    return 'Os numeros '+ num1 + ' e ' + num2 + saoIguais + ' são iguais. ';
}

function montaSegundaFrase(num1, num2){
    const soma = num1 + num2;

    let entre10 = 'menor';
    let entre20 = 'menor';

    const compara10 = soma > 10;
    const compara20 = soma > 20;

    if(compara10){
        entre10 = 'maior';
    }

    if(compara20){
        entre20 = 'maior';
    }

        return 'Sua soma é '+ soma +', que é '+ entre10 +' que 10 e '+ entre20 +' que 20';
}
