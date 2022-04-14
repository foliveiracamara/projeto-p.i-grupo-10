import GradientText from "../../../../components/GradientText"
import SolutionsCard from "./SolutionsCard"

import "./style.css"

const Solutions = () => {
    const descriptionList = [
        "Escolha o equipamento que precisar",
        "Monitore seus hardwares",
        "Suporte a todo momento para seu time",
        "Dashboards personalizados",
        "Geolocalização das máquinas",
        "Lorem ipson"
    ]

    const urlList = [
        "https://cdn-icons.flaticon.com/png/512/3059/premium/3059484.png?token=exp=1649559582~hmac=f58a71879d02ed7cd50bb9aa1b7448d3",
        "https://cdn-icons-png.flaticon.com/512/31/31653.png",
        "https://cdn-icons-png.flaticon.com/512/17/17452.png",
        "https://cdn-icons-png.flaticon.com/512/1828/1828791.png",
        "https://cdn-icons-png.flaticon.com/512/1180/1180856.png",
        "https://cdn-icons.flaticon.com/png/512/4071/premium/4071543.png?token=exp=1649559872~hmac=7242ce386e967e98565b3541e848c358"
    ]

    return (
        <div className="solutions--container">
            <div className="solutions--header">
                <img src="https://www.pngmart.com/files/16/Laptop-Notebook-PNG-HD.png" alt="" />
                <GradientText title={"Potencialize seu negócio, produtividade é na OnHome"} />
            </div>
            <GradientText title={"Um mundo de possibilidades!"} align={"left"} />
            <div className="solutions--content">
                <div className="solutions--cards">
                    {descriptionList.map((desc, index) => (
                        <SolutionsCard description={desc} iconUrl={urlList[index]}/>
                    ))}
                </div>
            </div>
        </div>
    )
}

export default Solutions