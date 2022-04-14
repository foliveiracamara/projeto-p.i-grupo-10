import { useState } from "react";
import React from 'react';
import EnderecoEmpresa from "../EnderecoEmpresa/Index";
import Licenca from "../Licenca/Index";
import DadosEmpresa from "../DadosEmpresa/Index";
import "./Style.css"
import GradientText from "../../../components/GradientText/index"
import Menu from "../Menu/Index"

const Form = (props) =>{
    const [page, setPage] = useState(0)
    const [formData, setFormData] = useState({
        nome_fantasia: "",
        cnpj: "",
        razao_social: "",
        email: "",
        telefone: "",
        logradouro: "",
        bairro: "",
        numero: "",
        cep: "",
        complemento: "",
        estado: "",
        cidade: "",
        option: 1,
        tipo: 1,
    })

    const FormTitles = ["Dados da empresa", "Endereço", "Escolha sua licença"]
    
    const PageDisplay = () => {
        if (page === 0) {
            return <DadosEmpresa formData={formData} setFormData={formData}/>
        } else if (page === 1) {
            return <EnderecoEmpresa formData={formData} setFormData={formData}/>
        } else {
            return <Licenca formData={formData} setFormData={formData}/>
        }
    }

    return (
    <div className="form-background">
        {/* <Menu/> */}
        <div className="form-container">
            <div className="title">
                <GradientText
                title={FormTitles[page]} />
            </div>
            <div className="body">
                {PageDisplay()}
            </div>
            <div className="footer">
                <button 
                disabled={page == 0}
                onClick={() => {setPage((currPage) => currPage - 1)}}>Voltar</button>
                <button 
                onClick={() => {
                    if (page == FormTitles.length -1 ) {
                        console.log(formData)
                    } else {
                        {setPage((currPage) => currPage + 1)}}

                    }}
                    >

                    
                    {page == FormTitles.length -1 ? "Finalizar" : "Próximo"}</button>
            </div>
        </div>
    </div>

)
}

export default Form;