import React from 'react';
import Input from '../../../components/Input';

const Licenca = (formData, setFormData) =>{
    return (
        <div className="licenca-container" >
            <select name="options" id="" value={formData.opcoes} className='gradient-select'> 
                <option value="1">Opção 1</option>
                <option value="2">Opção 2</option>
                <option value="3">Opção 3</option>
            </select>

            <select name="types" id="" value={formData.tipos} className='gradient-select'>
                <option value="1">Anual</option>
                <option value="2">Semestral</option>
                <option value="3">Mensal</option>
            </select>

            <label htmlFor="qtdMaquinas">Quantidade de máquinas</label>
            <Input />
        </div>
    )
}

export default Licenca