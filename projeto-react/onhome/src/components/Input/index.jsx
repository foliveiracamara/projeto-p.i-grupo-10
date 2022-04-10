import "./style.css"

const Input = ({width, height, children, placeholder, display}) => {

    return (
        <div>
            <input type="text" className="border-gradient-input" placeholder={placeholder} style={{ 
                width: width,  
                height: height,
                display: display}}/>
        </div>
    )
}

export default Input