const target = document.querySelectorAll('[data-transition]');
const animationClass = 'animate';

function animeAtScroll() {
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

const menu = document.querySelector('nav')
const menuBurguer = document.querySelector('.nav--burguer')

menuBurguer.addEventListener('click', () => {
    menu.classList.toggle('active')
})