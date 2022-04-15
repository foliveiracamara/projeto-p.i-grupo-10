import './App.css';
import TelaInicialCadastro from './pages/Cadastro/TelaInicialCadastro/Index';
import Configuracoes from './pages/Dashboard/Configuracoes/Index';
import Home from './pages/Dashboard/Home/';
import InitialPage from './pages/InitialPage/index';
import Login from './pages/Login/index';
import Usuarios from './pages/Dashboard/Usuarios/Index';
import Form from './pages/Cadastro/Form/index'

function App() {
  return (
    <div className="App">
      {/* <Home /> */}
      <InitialPage />
    </div>
  );
}

export default App;