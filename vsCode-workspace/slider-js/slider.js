
window.onload = function () {
  // Variables
  const SLIDE__IMAGE = [
      'img/avatars-1.png',
      'img/avatars-2.png',
      'img/avatars-3.png',
  ];
  const TIEMPO_INTERVALO_MILESIMAS_SEG = 3000;
  let posicionActual = 0;
  let $botonRetroceder = document.querySelector('#retroceder');
  let $botonAvanzar = document.querySelector('#avanzar');
  let $imagen = document.querySelector('#slide-imagen');
  let $botonPlay = document.querySelector('#play');
  let $botonStop = document.querySelector('#stop');
  let intervalo;

  // Funciones

  /**
   * Funcion que cambia la foto en la siguiente posicion
   */
  function pasarFoto() {
      if(posicionActual >= SLIDE__IMAGE.length - 1) {
          posicionActual = 0;
      } else {
          posicionActual++;
      }
      renderizarImagen();
  }

  /**
   * Funcion que cambia la foto en la anterior posicion
   */
  function retrocederFoto() {
      if(posicionActual <= 0) {
          posicionActual = SLIDE__IMAGE.length - 1;
      } else {
          posicionActual--;
      }
      renderizarImagen();
  }

  /**
   * Funcion que actualiza la slide-imagen de slide-imagen dependiendo de posicionActual
   */
  function renderizarImagen () {
      $imagen.style.backgroundImage = `url(${SLIDE__IMAGE[posicionActual]})`;
  }

  /**
   * Activa el autoplay de la slide-imagen
   */
  function playIntervalo() {
      intervalo = setInterval(pasarFoto, TIEMPO_INTERVALO_MILESIMAS_SEG);
      // Desactivamos los botones de control
      $botonAvanzar.setAttribute('disabled', true);
      $botonRetroceder.setAttribute('disabled', true);
      $botonPlay.setAttribute('disabled', true);
      $botonStop.removeAttribute('disabled');

  }

  /**
   * Para el autoplay de la slide-imagen
   */
  function stopIntervalo() {
      clearInterval(intervalo);
      // Activamos los botones de control
      $botonAvanzar.removeAttribute('disabled');
      $botonRetroceder.removeAttribute('disabled');
      $botonPlay.removeAttribute('disabled');
      $botonStop.setAttribute('disabled', true);
  }

  // Eventos
  $botonAvanzar.addEventListener('click', pasarFoto);
  $botonRetroceder.addEventListener('click', retrocederFoto);
  // $botonPlay.addEventListener('click', playIntervalo);
  $botonStop.addEventListener('click', stopIntervalo);
  // Iniciar
  renderizarImagen();
  playIntervalo();
}


