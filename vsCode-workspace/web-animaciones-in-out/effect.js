window.addEventListener('scroll', function() {
  
  function effect(effectType) {
      let tagIn = document.querySelectorAll('.effect_'+effectType);
        for (let i = 0; i < tagIn.length; i++) {
          let heightWp = this.window.innerHeight/1.3;
          let tagDIst  = tagIn[i].getBoundingClientRect().top;

            if (tagDIst <= heightWp) {
              tagIn[i].classList.add('scale_'+effectType);
              tagIn[i].classList.add('show');
              //tagIn[i].classList.add('scale'+effectType);
            } else {
                      //tagIn[i].classList.remove('show');
            }
        }
      }
    effect('Max')
    effect('Min')
})