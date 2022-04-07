import "./style.css"

const Input = ({width, height, children}) => {

    return (
        <div>
            <input type="text" className="border-gradient-input" style={{ 
                width: width,  
                height: height}}/>
        </div>
    )
}

export default Input