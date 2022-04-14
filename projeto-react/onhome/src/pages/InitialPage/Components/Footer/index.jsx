import Button from "../../../../components/Button"
import GradientText from "../../../../components/GradientText"

import "./style.css"

const Footer = () => {
    const subtitle = "A empresa certa para você que tem equipes que necessitem de equipamentos de ponta, suporte exclusivo e que forneça o que você necessita para tomar decisões melhores para o seu negócio"
    const footerTitle = ["Site", "Empresa", "Legale", "Nos siga!"]
    const footerOptions = [
        ["Features", "Serviços", "Suporte"],
        ["Sobre nós", "Nosso time", "Nossa história"],
        ["Política de Privacidade", "Termos e Condições", "Políticas da empresa"],
        ["Twitter", "Facebook", "LinkedIn"]
    ]

    return (
        <div className="footer--container">
            <div className="footer--description">
                <GradientText title={"OnHome"} subtitle={subtitle}/>
                <Button value={"Seguir"} margin={"20px 0"}/>
            </div>
            <div className="footer--links">
                {footerTitle.map((title, index) => (
                    <div className="footer--link--title">
                        <li>{title}</li>
                        {footerOptions[index].map(option => (
                            <li className="footer--option">
                                {option}
                            </li>
                        ))}
                    </div>
                ))}
            </div>
        </div>
    )
}

export default Footer