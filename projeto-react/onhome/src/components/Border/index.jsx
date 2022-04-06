import { height } from "@mui/system"
import "./style.css"

const Border = ({text, width, children}) => {

    return (
        <div>
            <div className="border-gradient" style={
                { borderRadius: "20px", 
                padding: "40px", 
                width: width,  
                height: height}}>
                {/* {text}
                {validate} */}
                <p>{children}</p>
            </div>
        </div>
    )
}

export default Border