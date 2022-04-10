import Border from '../../../components/Border';
import GradientText from '../../../components/GradientText';
import Input from '../../../components/Input';
import EditIcon from '@mui/icons-material/Edit';
import DeleteIcon from '@mui/icons-material/Delete';
import './Style.css'

const Usuarios = () => {
    return (
        <div className='background'>
            <div className='content'>
                <div className='right-content'>
                    <div className='title'><GradientText title={"Cadastro de Usuários"} fontSizeTitle={45}/></div>
                    <Border width={900} height={510}>
                        <div className='div-cadastro-usuarios'>
                            <div>
                                <div className='div-inputs'>
                                    <div className='name-group'>
                                        <p className='p'>Nome:</p>
                                        <Input width={300} display={"flex"}/>
                                    </div>
                                    <div className='email-group'>
                                        <p className='p'>E-mail:</p>
                                        <Input width={300} display={"flex"}/>
                                    </div>
                                    <div className='senha-group'>
                                        <p className='p'>Senha:</p>
                                        <Input width={300} display={"flex"}/>
                                    </div>
                                    <div className='cargo-group'>
                                        <p className='p'>Cargo:</p>
                                        <Input width={300} display={"flex"}/>
                                    </div>
                                </div>
                                <div>
                                    <button className="border-gradient">Cadastrar</button>
                                </div>
                            </div>
                            <Border width={360} height={400}>
                                <div className='cadastrados-border'>
                                    <h2 className='cadastrados-title'>Cadastrados</h2>
                                    <div className='registered-users'>
                                        <p>Felipe Camara</p>
                                        <div className='mui-icons'>
                                            <EditIcon />
                                            <DeleteIcon />
                                        </div>
                                    </div>
                                </div>
                            </Border>
                        </div>
                    </Border>
                </div>
            </div>
        </div>
    )
}

export default Usuarios;