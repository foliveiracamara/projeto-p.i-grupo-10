import './Style.css'


const Button = (props) => {
    return (
        <button className="btn--direciona">{props.children}</button>
    )
}

export default Button;