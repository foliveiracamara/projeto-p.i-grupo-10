import Title from "../Title";

import './style.css';

const TextWithImage = (props) => {
    return (
        <div className="textWithImage" style={{ flexDirection: props.reverse }}>
            <Title label={props.label} title={props.title} subtitle={props.subtitle} align="left"/>
            <img src={props.image} alt={props.alt} />
        </div>
    );
};

export default TextWithImage;