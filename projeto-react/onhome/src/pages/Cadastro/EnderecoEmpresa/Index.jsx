import React from "react";
import Input from "../../../components/Input/index.jsx";

const EnderecoEmpresa = (formData, setFormData) => {
  return (
    <div className="endereco-empresa-container">
      
        <label htmlFor="logradouro">Logradouro</label>
        <Input
          value={formData.logradouro}
          // onChange={() => setFormData({...formData, logradouro: e.target.value})}
          width={"537px"} 
          height={"25px"}
        />
        <label htmlFor="bairro">Bairro</label>
        <Input width={"537px"} height={"25px"}/>
        <label htmlFor="numero">Número</label>
        <Input width={"243px"} height={"25px"}/>
        <label htmlFor="cep">CEP</label>
        <Input width={"243px"} height={"25px"}/>
        <label htmlFor="complemento">Complemento</label>
        <Input width={"537px"} height={"25px"}/>
        <label htmlFor="estado">Estado</label>
        <Input width={"243px"} height={"25px"}/>
        <label htmlFor="cidade">Cidade</label>
        <Input width={"243px"} height={"25px"}/>

    </div>
  );
}

export default EnderecoEmpresa;
