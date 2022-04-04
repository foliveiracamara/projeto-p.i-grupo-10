import './style.css';

const Title = (props) => {
    const className = props.className ?? "";
    const textAlign = props.align ?? "center";
    const marginHorizontal = textAlign==="center" ? "auto" : "0";

    return (
        <div className={`text ${className}`} style={{ textAlign: textAlign }}>
            <div className="label">
                {props.label}
            </div>
            <div className="title" style={{ margin: marginHorizontal }}>
                {props.title}
            </div>
            <div className="subtitle">
                {props.subtitle}
            </div>
        </div>
    );
};

export default Title;