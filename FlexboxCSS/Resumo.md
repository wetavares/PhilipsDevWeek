# 🔛 Flex Box

# Fundamentos do Flex-Box parte 1

 ##   Display: flex

:heavy_check_mark: Torna a tag um elemento do tipo flex container, e assim automaticamente tosos os seus filhos diretos desta tag, tornam-se em flex itens.

## Propriedades 

### :arrow_right: Flex-direction

​	Estabelece o eixo principal do container, definindo assim a direção que os flex itens são colocados no flex container.

### Os eixos...

1. row (padrão): texto esquerda para direita;
2. row-reverse: texto oposto direita para esquerda;
3. column: ordenação de cima para baixo em uma coluna única;
4. column-reverse: texto em coluna de baixo para cima;

:arrow_right: Flex-wrap

​    Define se os itens devem ou não quebrar as linhas, por defaul não quebram as linhas.

1. nowrap (padrão): não quebra a linha;
2. wrap: permite a quebra de linha, itens na ordem direita para esquerda;
3. wrap-reverse: quebra a linha com os itens na ordem inversa da direita para a esquerda;

:arrow_right: Flex-flow

​    É um atalho para as propriedades flex-direction e flex-wrap, seu uso não é tão comum. Pois ao mudarmos o flex-direction para column, mantemos o padrão do flex-wrap que é nowrap

:arrow_right: Justify Content

​    É encarregada de alinhar os itens dentro do container de acordo a direção pretendida e tratar a distribuição de espaçamentos entre eles.

:telescope: Caso os itens ocupem 100% do container, justify content não se aplica.

     Variações 


1. flex-start: início do container;
2. flex-end: final do container;
3. center: ao centro do container;
4. space-between: espamento igual entre os elementos, sendo o primeiro e o ultimo proximo as bordas do container.
5. space-around: os espaçamento do meio são duas vezes maiores que o inicial e final.

:arrow_right: Align-itens

​    Trata o alinhamento dos flex itens de acordo o eixo do container. O alinhamento é diferente para quando os itens estão em colunas ou linhas. Permite o alinhamento central no eixo vertical.

     Tipos de alinhamento

1. center: alinhamento dos itens ao centro;
2. stretch: padrão, e os flex itens cresçam igualmente;
3. flex-start: alinhamento dos itens no início;
4. flex-end: alinhamento dos itens no final;
5. baseline: alinhamento de acordo com a linha da base da tipografia dos itens

:arrow_right: Align-content

​    Para utilizar precisamos que:

* O container utilize quebra de linhas;

* A altura do container seja maior que a soma das linhas dos itens. 

O container precisa implementar o flex wrap com modo wrap.


     Tipos de alinhamento

1. center: alinhamento dos itens ao centro;
2. stretch: é o padrão e os flex itens crescem igualmente;
3. flex-start: alinhamento dos itens no início;
4. flex-end: alinhamento dos itens no final;
5. space-between: cria um espaçamento igual entre os elementos;
6. space-around: os espaçamentos do meio são duas vezes maiores que o inicial e final.

# Fundamentos do Flex-Box parte 2

## Flex-grow

:heavy_check_mark: Define a proporcionalidade de crescimento dos itens, respeitando o tamanho de seus conteúdos internos.

:telescope: Não funcionar caso tenhamos adicionado justify-content ao flex container. Ao trabalhar com flex-grow só podemos usar numeros, será zero ou numero que refere a proporção de crescimento.

## Flex-basis
:heavy_check_mark: Propriedade que estabelece o tamanho inicial do item antes das distribuição de espaço restante denteo dele, usando como base o conteúdo interno disposto.

     tipos de Valores possíveis

* auto: caso o item não tenha tamanho, este será proporcional ao conteúdo do item;
* px, %, em , ...: são valores exatos previamente definidos;
* 0 (zero): terá relação com a definição do flex-grow.


## Flex-shrink
:heavy_check_mark: É a propriedade que estabelece a capacidade de redução ou compressão do tamanho de um item.


## Flex
:heavy_check_mark: Propriedade é como um atalho ou abreviação de escrita para: grow, shrink e basis.

:arrow_right: Order: lida diretamente com a ordenação dos itens. Define diretamente qual o item será o primeiro, segundo etc, independente da forma que foi escrito no código.


:arrow_right: Align-self: Estabelece o alinhamento de modo individual sobre um determinado item.

:arrow_right: Align-self:

     Tipos de valores possíveis
* auto: valor padrão, irá respeitar a definição de align-items do container;
* flex-star: ao início do container;
* flex-end: ao final do container;
* center: relativo ao centro de acordo com o eixo;
* stretch: ocupa todo o espaço relativo;
* baseline: utiliza a linha base da tipografia.
