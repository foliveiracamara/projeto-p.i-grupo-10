import GradientText from '../../../components/GradientText'
import Button from '../../../components/Button/Button'
import './Style.css'
import ButtonWithArrow from '../../../components/ButtonWithArrow/Index'


const TelaInicialCadastro = () => {
    return (
        <div className='mainDiv--Background'>
            <div className='content'>
                <div className='div--text'>
                    <GradientText 
                        title={"Olá! este é o seu primeiro acesso"}
                        fontSizeTitle={35}/>
                    <GradientText 
                        title={"Por favor, nos informe alguns dados para acessar nossa plataforma"}
                        fontSizeTitle={35}
                    />
                </div>
                <div className='div--button'>
                    <ButtonWithArrow color={"white"}>Seguir</ButtonWithArrow>
                </div>
            </div>
        </div>
    )
}

export default TelaInicialCadastro;