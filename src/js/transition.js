const target = document.querySelectorAll('[data-transition]');
const animationClass = 'animate';

function animeAtScroll() {
    console.log(window.pageYOffset)
    const windowTop = window.pageYOffset + (window.innerHeight * 0.75);
    target.forEach((element) => {
        if (windowTop > element.offsetTop) {
            element.classList.add(animationClass)
        }
    })
}

window.addEventListener('scroll', () => {
    if (window.pageYOffset > 100) {
        animeAtScroll()
    }
})

var menu = document.querySelector('nav');
var menuIcon = document.querySelector('.menu-icon')
var closeIcon = document.querySelector('.close-icon')
menuIcon.addEventListener('click', ()=> {
    menu.classList.add('active')
})
closeIcon.addEventListener('click', ()=> {
    menu.classList.remove('active')
})