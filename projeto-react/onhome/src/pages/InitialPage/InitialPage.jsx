import Header from "../../components/Header/Header";
import "./InitialPage.css"

const InitialPage = () => {
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
            </div>
        </div>
    )
}

export default InitialPage;