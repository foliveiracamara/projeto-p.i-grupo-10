import Title from "../Title";

import './style.css';

const More = () => {
    return (
        <div className="border-gradient" style={{ borderRadius: "20px", padding: "40px" }}>
            <Title title="Aumente a sua produtividade com nossos produtos!" subtitle="Com os nossos produtos e nosso suporte exclusivo, você irá aumentar a sua produtividade e seus lucros. Tenha uma ótima gestão da sua equipe e controle sobre seus procesos." align="left" />
            <button className="border-gradient">Saiba Mais...</button>
        </div>
    );
};

export default More;