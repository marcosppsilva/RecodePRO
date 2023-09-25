import './App.css';
import React, {useState} from 'react';

function App() {
  
  const [contador, setContador] = useState(0);

  const aumentarContador = () => {
    setContador(contador + 1)
  };

  function alerta(){
    alert("Recode")
  }

   return (
    <div className='aula2509'>
          <h1>Número de Cliques: {contador}</h1>
          <button onClick={aumentarContador}>Click</button>
    </div>
  );
}

export default App;
