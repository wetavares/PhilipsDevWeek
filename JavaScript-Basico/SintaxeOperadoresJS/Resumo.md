# :beginner: Sintaxe básica em JavaScript

    Objetivos

:dart: Explicar de forma educativa, teórica e prática o que é JavaScript, para que serve e como utili´z-lo em projetos.

## O que é o JS:question:

 O JavaScript é uma linguagem de programação de alto nível, que integra o desenvolvimento de apps e páginas web.

 Podemos usar o JS de várias formas, o mais comum se dá no desenvolvimento de apps e páginas web, juntamente com as linguagens HTML e CSS.

## Entendendo variáveis e seus valores

    Objetivos

&nbsp;1&nbsp;Como funciona a tipagem em JS?

&nbsp;2&nbsp;O que são variáveis e como declarar;

&nbsp;3&nbsp;Diferenças entre atribuição, comparação e comparação idêntica;

&nbsp;4&nbsp;Operadores aritméticos, relacionais e lógicos.

## Tipagem?

 Funciona como uma regra de uso de dados, quanto mais forte for a tipagem, mais obrigatório é a declaração do tipo de dado.

 Em JavaScript é fraca, a declaração dos dados acontece de modo dinâmico.

Ex.: var numero = 1; // o JS já converte o valor 1 para o tipo Number.

## Declaração de variáveis

### Tipos primitivos

   As variáveis em JS podem guardar tipos de dados que chamamos de tipos primitivos.

   Variáveis podem guardar valores dos tipos: Boolean; null; undefined; Number; String; Array; Object; Function.

   Os modos de declarar as variáveis em JS são 3:

* var - declaração no escopo global e local, pode ter seu valor alterado, se não tiver um valor inicial será tratada como null;
* let - declaração no escopo local de bloco, pode ter seu valor alterado, se não tiver um valor inicial será tratada como null;
* const - declaração no escopo local de bloco, somente leitura, o valor inicial é obrigatório e não pode ser alterado.

### Escopo

   O escopo em JS define a limitação e visibilidade de um bloco de código.

**Escopo global** - quando a variável é declarada fora de qualquer bloco de código, sua visibilidade fica disponível em todo o código.

**Escopo local** - quando a variável é declarada dentro de um bloco de código, sua visibilidade pode ficar disponível ou não.

## Diferenças entre atribuição, comparação e comparação idêntica

### Atribuição

​    O sinal de igualdade "=" em JS significa atribuição.

### Comparação

​    Para fazermos uma comparação de valores em JS usamos "==".

### Comparação idêntica

​    Para fazermos uma comparação de valores e tipos em JS usamos "===".

## Operadores aritméticos, relacionais e lógicos

### Operadores aritméticos

​    São tipos de operadores matemáticos com valor numéricos:

* '+' adição;
* '-' subtração;
* '*' multiplicação;
* '/' divisão real;
* '%' divisão inteira;
* '**' potenciação.

### Operadores relacionais

* '>' maior que;
* '<' menor que;
* '>=' maior ou igual a;
* '<=' menor ou igual a.

### Operadores lógicos

​    São os tipos de operadores que consultam valores lógicos:

* '&&'  "e" considera que todos os valores sejam true;
* '||' "ou" considera que qualquer valor seja true;
* '!' "não" inverte o valor de true para false ou vice-versa.

# Vetores e Objetos


    Objetivos

&nbsp;1&nbsp;O que são vetores ou arrays;
&nbsp;2&nbsp;Como manipular arrays;
&nbsp;3&nbsp;O que são objetos;
&nbsp;4&nbsp;Desestruturando Objetos.

## O que são vetores ou arrays?

 Arrays são um tipo de lista, ou matriz de variáveis, onde cada variavel possui um índice. Os valores podem ser de vários tipos.

:arrow_right: Array: deve ser declarado entre colchetes"[ ]" e podem guardar qualquer valor dentro de seus índices, inclusive outros arrays.

:telescope: O índice só é acessado por um número inteiro, onde 0 (zero) é o primeiro índice. Cada índice é separado por vírgula.

### Manipulando Arrays

* forEach() - itera um array;
* push() - add item no final do array;
* pop() - remove item no final do array;
* shift() - remove item no início do array;
* unshift() - add item no início do array;
* indexOf() - retorna o índice de um valor;
* splice() - remove ou substitui um item pelo índice;
* slice() - retorna uma parte de um array existente;

### Objetos

São dados que possuem **propriedades** e **valores** que definem suas características. Deve ser declarado entre chaves "{ }".

&nbsp; ```var xicara = {
cor: 'azul',
tamanho: 'p',
funcao: tomarCafe( )
}``` &nbsp;

### Manipulando objetos

 As propriedades de objetos podem ser atribuídas às variáveis, facilitando a manipulação do objeto. Chamamos isso de desestruturação.

:pushpin: ex: **var** xicara = { cor: 'azul', tamanho: 'p', funcao: tomarCafe() }

**var** { cor, tamanho, funcao } = xicara;

## Estruturas condicionais


    Objetivos

&nbsp;1&nbsp;O que são estruturas condicionais;

&nbsp;2&nbsp;Estruturas de decisão;

&nbsp;3&nbsp;Estruturas de repetição.

### :twisted_rightwards_arrows: Estruturas condicionais

   São instruções para realizar determinadas tarefas a partir de uma condição, seja de decisão ou repetição.


### :left_right_arrow: Estruturas de decisão

    IF

   Podemos usar as palavras reservadas "if" para estabelecer uma condição:&nbsp;

ex.:
``var jodador1 = 0;
var jodador2 = 0;
if (jodador1 > 0){
   console.log('jodadr1 marcou ponto');
}
`` &nbsp;

    ELSE

​    No caso da condição não ser atendida podemos usar o "else":&nbsp;

ex.: 
``var jodador1 = 0;
var jodador2 = 0;
if (jodador1 > 0){
   console.log('jodadr1 marcou ponto');
} else{
   console.log('ninguem marcou ponto';)
}
`` &nbsp;

    ELSE IF

  Caso haja mais de uma condição usamos o "else if": &nbsp;
ex.:
``var jodador1 = 1;
var jodador2 = 0;
if (jodador1 > 0){
   console.log('jodadr1 marcou ponto');
} else if (jogador2 > 0){
   console.log('jogador2 marcou ponto');
} else {
   console.log('ninguem marcou ponto';)
}
`` &nbsp;

    Aninhamento de IF

  Podemos também usar o "if" dentro de um outro "if", chamamos isso de anonhamento de if's ou ninho de if's:&nbsp;
ex.:
``var jodador1 = 1;
if(jodador1 = -1){;
if (jodador1 > 0){
   console.log('jodadr1 marcou ponto');
} else if (jogador2 > 0){
   console.log('ninguém marcou ponto');
   }
} else {
   console.log('jodador inválido';)
}
`` &nbsp;

    IF TERNÁRIO

  Podemos també fazer uma verificação em uma única linha usando o "if" ternário:&nbsp;

ex.:
``[condição] ? [instrução1] : [instrução2];
jogador1 > 0 ? console.log(‘marcou ponto’) : console.log(‘não
marcou ponto”);
``&nbsp;

    Usando o switch / case

   O 'switch/case' funciona como uma estrutura condicional também:&nbsp;
ex.:
``switch (${expressao}){ ``
``case 1:
  ${instrução};
    break;``
``case 2:
${instrução};
break;``
``}``

## :arrows_clockwise: Estruturas de Repetição

    Laços de repetição

 São estruturas condicionais que repetem uma instrução até atingir determinada condição:

* For;
* For / in;
* For / of;
* While;
* Do / While;

    For
    

 Funciona como uma repetição de instrução até que a condição seja falsa:
 ex.:
```
switch (${expressao}) {
case 1:
   ${instrucao};
   break;
case 2:
   ${instrução};
   break;
}
```
    For / in

 Funciona como uma repetição a partir de uma propriedade:
 ex.:
 ```
 for([indice] in [objeto ou array]){
   declaração
 }
 ```
    For / of

 Funciona como uma repetição a partir de um valor:

 ```
 for([indice] of [array]){
 declaração;
 }
 ```
:paperclip: O for / of não funciona com objetos pois as propriedades variam, diferentes do índice em um array que sempre serão números inteiros.
ex.:

```
for( i of object.propriedade){
   console.log( i );
}
```

    While


Executa uma instrução "enquanto" determinada condição for verdadeira, a verificação é feita antes da execução.
ex.:
```
var a = 0;
while( a < 10){
   a++;
   console.log( a );
}
```

    Do / While

 Executa uma instrução "até que" determinada condição seja falsa, a verificação é feita depois da execução;
 ex.:
 ```
 var a = 0;
 do{
    a++;
    console.log( a);
 }while( a < 10)
 
 