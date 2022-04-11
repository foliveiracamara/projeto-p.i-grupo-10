import "./Style.css"

const Menu = (page) => {

const steps =[1, 2, 3]



    return (
        <div >
                <div className="steps">{steps}</div>
            <div className="container">
                <div className='gradient-line' 
                style={{marginLeft: page === 0 ? "50px" : page === 1 ? "150px" : "250px"}}></div>
                <div className='fine-line'></div>
            </div>
      </div>

    )

}


export default Menu