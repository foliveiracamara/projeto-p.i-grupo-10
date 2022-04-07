import { useState } from "react"
import "./style.css"

const Menu = (marginLeft) => {

const steps =[1, 2, 3]


    return (
        <div className="vermelho">
            <div className="steps:active">{steps}</div>
            

            <div className="container">
            <div className='gradient-line' style={{marginLeft: `${marginLeft}%`}}></div>
            <div className='fine-line'></div>
      </div>
      </div>

    )

}


export default Menu