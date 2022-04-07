import { useState } from "react";
import Header from "../../components/Header";
import { Feedback, KeyboardArrowLeft, KeyboardArrowRight } from "@mui/icons-material";
import Produtos from "../../components/Produtos";
import './InitialPage.css'
import Border from "../../components/Border";
import Feedbacks from "./Feedbacks/Index"

const InitialPage = () => {
    const [scrollX, setScrollX] = useState(0);
    const [cardSelected, setCardSelected] = useState(3);
    let feijuca = "batata"
    const handleLeftArrow = () => {
        let card = cardSelected + 1
        let x = scrollX + 500;
        // if (x > 0) {
        //     x = 0
        // }
        setScrollX(x)
        setCardSelected(card)
    }

    const handleRightArrow = () => {
        let x = scrollX - 500;
        // if ((window.innerWidth - cardList) > x) {
        //     x = (window.innerWidth - cardList) - 60;
        // }
        setScrollX(x)
    }

    return (
        <div>
            <div className="div--mainBox">
                <Header />
                <section className='about--content'>
                    <span className='subtitle'>Potencializando o seu tempo</span>
                    <span className='title'>Locação de máquinas</span>
                    <span className='about--onhome'>Utilize de equipamentos da mais alta qualidade,
                        com preços justos e serviços de suporte 24/7 a sua disposição!
                    </span>
                    {/* <Button >Seguir<ArrowRightAltIcon /></Button> */}
                </section>
                <Produtos />
                <section>
                    <Feedbacks title="aaaaaa"/>
                </section> 
            </div>
        </div>
    )
}


export default InitialPage;