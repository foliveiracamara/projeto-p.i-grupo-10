import { useState } from "react";
import Header from "../../components/Header";
import Slider from "../../components/Slider";
import { KeyboardArrowLeft, KeyboardArrowRight } from "@mui/icons-material";
import "./InitialPage.css";

const InitialPage = () => {
    const [scrollX, setScrollX] = useState(0);
    const [cardSelected, setCardSelected] = useState(3);

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
                </section>
                <section className="solutions">
                    <div className="leftArrow" onClick={handleLeftArrow}>
                        <KeyboardArrowLeft style={{ fontSize: 50 }}/>
                    </div>
                    <div className="rightArrow" onClick={handleRightArrow}>
                        <KeyboardArrowRight style={{ fontSize: 50 }}/>
                    </div>
                    <Slider scrollX={scrollX} cardSelected={cardSelected}/>
                </section>
            </div>
        </div>
    )
}

export default InitialPage;