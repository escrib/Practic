window.onload = function() {
    const SLIDE__IMG = [
        'img/avatars-1.png',
        'img/avatars-2.png',
        'img/avatars-3.png',
        'img/avatars-4.png',
        'Martin',
        'Carito',
        'Sebas',
        'Alison',];

    let slidePosition = 0;

    function passImagen() {
            if (slidePosition >= SLIDE__IMG.length - 5) {
                slidePosition = 0;
            } else {
                slidePosition++;
            }
            document.getElementById("slide-imagen").style.backgroundImage = `url(${SLIDE__IMG[slidePosition]})`;
            document.getElementById("slide-imagen").innerHTML = '<a id="link_portfolio1" className="link_portfolio"' +
                ' href="https://www.martin.com">'+`${SLIDE__IMG[slidePosition + 4]}`+'</a>';
    }


    passImagen();
    setInterval(passImagen, 2000);
}