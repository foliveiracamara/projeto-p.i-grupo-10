import Configuracoes from "../Configuracoes/Index";
import Menu from "../Components/Menu";
import Usuarios from "../Usuarios/Index";

const Home = () => {
    return (
        <div style={{display: "flex", gap: "20px"}}>
            <Menu />
            <Configuracoes />
        </div>
    );
};

export default Home;