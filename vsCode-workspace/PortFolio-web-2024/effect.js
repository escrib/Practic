window.addEventListener('scroll', function() {
  
  function effect(effectType) {
      let tagIn = document.querySelectorAll('.efe');
        for (let i = 0; i < tagIn.length; i++) {
          let heightWp = this.window.innerHeight*0.95;
          let topWp = this.window.innerHeight*0.4;
          let tagDistBot = tagIn[i].getBoundingClientRect().bottom;
          let tagDIst  = tagIn[i].getBoundingClientRect().top;


            if (tagDIst <= heightWp) {
              tagIn[i].classList.add('scale_Min');
              tagIn[i].classList.add('show');
              //tagIn[i].classList.add('scale'+effectType);

            } else {
                      //tagIn[i].classList.remove('show');
            }

            if (tagDistBot <= topWp) {
              tagIn[i].classList.remove('scale_Min');
            tagIn[i].classList.add('scale_Max');

          }





        }
      }
    effect('Max')
    effect('Min')
})