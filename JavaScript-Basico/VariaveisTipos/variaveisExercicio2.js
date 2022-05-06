var firstName = 'joão';
var lastName = 'Souza';

if(firstName === 'joão'){
    let lastName = 'Rodrigues'
    var firstName = 'Pedro';
    lastName = 'Silva';

    console.log('reatribuição de lastName -> ' + lastName);
}

console.log(`-> ${firstName} - ${lastName}`);