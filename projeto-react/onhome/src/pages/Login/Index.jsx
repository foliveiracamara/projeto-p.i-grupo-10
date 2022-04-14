import React from 'react';
import Button from '../../components/Button';
import GradientText from '../../components/GradientText';
import Input from '../../components/Input';
import "./Style.css"

const Login = () => {
    return (
        <div className='form-background'>

            <GradientText title={"Seja bem-vindo(a)!"} />
            <label htmlFor="">E-mail</label>
            <Input height={"25px"} width={"537px"}/>
            <label htmlFor="">Senha</label>
            <Input height={"25px"} width={"537px"}/>
            <Button >Entrar</Button>

        </div>

    )

}

export default Login