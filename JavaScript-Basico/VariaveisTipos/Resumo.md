# :id: Variáveis e Tipos

   :dart: Objetivos

 * Explicar o que são variáveis;
 * Explicar o que são constantes;
 * Explicar a diferença entre var, const e let.

### Atribuições de valores:

 Convenções para declaração de variáveis:
**Sempre utilizar o tipo Camel Case**
ex.: declararUmaVariável.

    Var e Let

Usado para fazer declaração dinâmica, ou seja, podem ser alteradas durante a execução do código.

**Let** tem escopo de bloco;

**Var** tem escopo global;

### :heavy_exclamation_mark: Hoisting

 Consistem em declarar um valor para a variável antes de utiliza-la, apenas utilizado com VAR.
 As variáveis podem ser redeclaradas e reatribuidas.

Ex.: var numero = 1;

## Declaração de Constantes

* É declarada em modo SNAKE_UPPER_CASE;
* Tem escopo de bloco;
* Não faz hoisting.

:telescope: Precisa ser inicializada antes do uso.

### Resumindo

|           | VAR  | CONST | LET  |
|---        |---   |---    |---   |
| ESCOP     |Global/local| Bloco| Bloco|
| REDECLARR |sim        | nao  | nao  |
| REATRIBUIR|sim        | nao  | sim  |
| HOISTING  |sim        | nao  | nao  |

**Escopo global** - quando a variável é declarada fora de qualquer bloco de código, sua visibilidade fica disponível em todo o código.

**Escopo local** - quando a variável é declarada dentro de um bloco de código, sua visibilidade pode ficar disponível ou não.

## Estrutura de Dados

     Objetivos

​    Apresentar as principais estruturas de dados do javascript e seus principais métodos.

:paperclip: javascript é uma linguagem de tipagem dinâmica, ou seja, antes de declarar um valor não é necessário especificar o tipo de dado.

### Grupos de tipos de dados

&nbsp;1 - &nbsp;Dados Primitivos:
   * numbers;
   * strings;
   * boolean;
   * null;
   * undefined.
  
&nbsp;2 - &nbsp;Dados Compostos ou não Primitivos:
   * objects;
   * arreys.
  
    Strings

 Comumente utilizada para textos, os valores são declarados entre ""(aspas) ou ``(crase).

:paperclip: Pode trabalhar com interpolação: ex.: let fullName = 'Nome completo: \${firstName} ${lastName}';

#### Métodos importantes

   * Concatenação: usado para unir caracteres ou strings;
   * Propriedade length: pode usar para verificar o tamanho da string;
   * Iterabilidade: usada para ver o que existe em cada indice da string e extrair separadamente;
   * Formatação: usado para mudar para maiúsculos ou miniúsculo, retirar espaços, separar os caracteres;
   * Index das letras;

    Numeros

#### Inteiros ou Décimais

​    São declarados sem aspas. Podem ser usados juntos com biblioteca Math.


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
``&nbsp;[condição] ? [instrução1] : [instrução2];
jogador1 > 0 ? console.log(‘marcou ponto’) : console.log(‘não
marcou ponto”);
``&nbsp;

    Usando o switch / case

   O 'switch/case' funciona como uma estrutura condicional também:&nbsp;
ex.:
``switch (${expressao}) {
case 1:
`  ${instrução};
    break;
case 2:
${instrução};
break;
}

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
 
 