import './App.css';
import './components/Corpo';
import Menu from './components/Menu';
import Rodape from './components/Rodape';
import {Botao} from './components/Botao';
import Corpo from './components/Corpo';

function App() {

  const Estilo = {
    color: 'yellow',
    textAlign: 'left',
    backgroundColor: 'grey'
  }

  return (
    <div className="App">
        <Menu />        
        <Corpo />        
        <Rodape />

        <h1>Olá Mundo</h1>    
        <p>Olá Mundo, mas como parágrafo</p>
        <p style={{color:"red", backgroundColor:"blue"}}>Outro parágrafo</p>
        <p style={Estilo}>Terceiro parágrafo</p>
        <Botao />
    </div>
  );
}

export default App;
{/*Só pode dar retorno em 1 componente, par mais de um colocar entre <>colocar aqui</>*/}