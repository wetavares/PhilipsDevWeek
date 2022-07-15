const BASE_URL = 'https://api.thecatapi.com/v1/images/search/';

const btn = document.getElementById('change-cat');
const img = document.getElementById('cat');

const loadImg = async () => {
    const img = document.getElementById('cat');
    img.width="200" ;
    img.height="200";
    img.src = await getCats();
};

const getCats = async () => {
    try{
        const data = await fetch(BASE_URL);
        const jsonData = await data.json();
        return jsonData[0].url;
    }catch(e){
        console.log(e.message);
    }
};

btn.addEventListener('click', loadImg);

loadImg();