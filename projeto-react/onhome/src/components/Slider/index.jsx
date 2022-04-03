import { useState } from "react";
import Card from "../Card"
import "./style.css"

const Slider = ({scrollX, cardSelected}) => {

    const textList = [
        "Escolha o equipamento que precisar", 
        "Monitore seus hardwares", 
        "Suporte a todo momento para seu time", 
        "Dashboards personalizados", 
        "Geolocalização das máquinas"
    ]

    return (
        <div className="slider--container" style={{marginLeft: scrollX}}>
            {textList.map((text, index) => {
                return (
                    <Card text={text} selected/>
                )
            })}        
        </div>
    )
}

export default Slider;