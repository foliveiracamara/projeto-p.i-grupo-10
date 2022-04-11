import React from 'react';
import Input from "../../../components/Input/index.jsx"

const DadosEmpresa = () => {
    return (
    <div className="dados-empresa-container">
        <label htmlFor="nome_fantasia">Nome Fantasia</label>
        <Input width={"537px"} height={"25px"}/>
        <label htmlFor="cnpj">CNPJ</label>
        <Input width={"537px"} height={"25px"}/>
        <label htmlFor="razao_social">Razão Social</label>
        <Input width={"537px"} height={"25px"}/>
        <label htmlFor="email">E-mail</label>
        <Input width={"537px"} height={"25px"}/>
        <label htmlFor="telefone">Telefone</label>
        <Input width={"258px"} height={"25px"}/>
    </div>
)
}

export default DadosEmpresa