import { products } from "./jsonDB.js";

const links = document.querySelectorAll('.nav-link');
links.forEach((elem) => {
   elem.addEventListener('click', (el) => {
      route(el);
      el.preventDefault();
   });
});

const route = (e) => {
   const page = "<div>Привет</div>";
   window.history.pushState({}, "", e.target.href);
   handleLocation();
};

const routers = {
   '/': '/pages/home.html',
   '/about': '/pages/about.html',
   '/contact': '/pages/contact.html'
};

const handleLocation = async () => {
   const path = window.location.pathname;
   const html = await fetch(routers[path]).then((data) => data.text());
   const wrap = document.querySelector('.wrap');
   wrap.innerHTML = html;
   if (path == '/') {
      getPage();
   }
};



function getPage() {
   const dataBase = JSON.parse(products);

   const content = document.querySelector('.json__content');

   dataBase.forEach(({ imgProduct, nameProduct, descriptionProduct, priceProduct }) => {
      const divProduct = document.createElement('div');
      divProduct.classList.add('product');
      content.appendChild(divProduct);

      const img = document.createElement('img');
      img.classList.add('product__img');
      img.src = imgProduct;
      img.width = 200
      divProduct.appendChild(img);

      const divProductWrap = document.createElement('div');
      divProductWrap.classList.add('product__wrap');
      divProduct.appendChild(divProductWrap);

      const productName = document.createElement('h2');
      productName.textContent = nameProduct;
      divProductWrap.appendChild(productName);

      const productDescription = document.createElement('p');
      productDescription.textContent = descriptionProduct;
      divProductWrap.appendChild(productDescription);

      const productPrice = document.createElement('p');
      productPrice.textContent = priceProduct;
      divProductWrap.appendChild(productPrice);
   });
}


window.onpopstate = hendleLocation;
window.route = route;
handleLocation();