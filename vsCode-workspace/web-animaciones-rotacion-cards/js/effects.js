window.addEventListener('click', function() {

  let home = this.document.getElementById('home');
  let about = this.document.getElementById('about');
  let services = this.document.getElementById('services');
  let portfolio = this.document.getElementById('portfolio');
  let contact = this.document.getElementById('contact');
  let divHome = this.document.getElementById('div-home');

    if (home) {
    services.classList.add("transfo");
    

    } 

  setTimeout(() =>{
    home.classList.add('transla');
  }, '1500');

  
  
})