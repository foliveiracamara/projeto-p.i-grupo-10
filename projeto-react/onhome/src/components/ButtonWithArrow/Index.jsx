//importando o icone de seta do site 'material icons' e importando tambem o nosso CSS
import ArrowRightAltIcon from '@mui/icons-material/ArrowRightAlt';
import './Style.css'

//estamos passando esses paramentros para deixar o componente dinamico e poder alterar onde quisermos
const ButtonWithArrow = ({children, widthButton}) => {
    return (
        <button 
            className="button-with-arrow" 
            style={{width: widthButton}}>{children}

            {/* abaixo está o icone de seta ('sx' é para estilizar) */}
            <ArrowRightAltIcon 
                sx={{ fontSize: '48px', color: '#7879F1' }}
            />
        
        </button>
    )
}
//exportando nosso componente para que possa ser usado em outros lugares
export default ButtonWithArrow;