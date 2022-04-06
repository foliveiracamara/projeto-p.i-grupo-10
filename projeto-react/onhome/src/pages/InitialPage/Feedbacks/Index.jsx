import GradientText from '../../../components/GradientText'
import './Style.css'
import Border from '../../../components/Border'

const Feedbacks = () => {
    return (
        <div className='feedback--mainContainer'>
            <div className='feedback--container'>
                <div className='feedback--title'>
                    <GradientText title="Feedback dos nossos parceiros" /> 
                </div>
                <div className='feedback--cards'>
                    <Border width={"100px"}/>
                </div>
            </div>
        </div>
    )
}

export default Feedbacks