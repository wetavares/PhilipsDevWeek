let array = [];

console.log(array[0]);

array.push(6);
array.push(9);  //adiciona item no final do vetor
array.forEach((element ,index, array) => {
    console.log(`indice ` + index + ` = `, element,` vetor `, array);
});

const SOCIAL_NET_WORK = [`youtuber`, `twitter`, `instagram`, `facebook`];

SOCIAL_NET_WORK.forEach( (element, index) =>{
    console.log(index, element);
} 

)