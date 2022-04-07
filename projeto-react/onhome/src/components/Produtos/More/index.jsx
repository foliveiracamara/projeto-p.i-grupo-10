import GradientText from "../../GradientText";
import './style.css';
import Border from "../../Border";

const More = () => {
    return (
        <Border >
            <GradientText title="Aumente a sua produtividade com nossos produtos! om os nossos produtos" subtitle="C nosso suporte exclusivo, você irá aumentar a sua produtividade e seus lucros. Tenha uma ótima gestão da sua equipe e controle sobre seus procesos." align="left" />
            <button className="border-gradient">Saiba Mais...</button>
        </Border>
    );
};

export default More;