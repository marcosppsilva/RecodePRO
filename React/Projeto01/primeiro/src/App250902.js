import './App.css';
import React, {useState} from 'react';

function App() {
  const [valor1, setValor1] = useState(0);
  const [valor2, setValor2] = useState(0);
  const [soma, setSoma] = useState(0)
  const [nome, setNome] = useState('');

  //Função que controla o estado do input e do valor
  const handleInputChange = (event) => {
    setNome(event.target.value);
  }

  const changeValor1 = (event) => {
    setValor1(event.target.value);
  }
  const changeValor2 = (event) => {
    setValor2(event.target.value);
  }

  const calcular = () =>{
    setSoma(Number(valor1) + Number(valor2))
  }

  

   return (
    <div className='aula2509'>
          
          <input type='text' className='input2509' value={nome} onChange={handleInputChange}/>          
          <button onClick={() => setNome('')}>Click</button>
          <h1>{nome}</h1>

          <input type='text' className='camponum' value={valor1} onChange={changeValor1}/>
          <input type='text' className='camponum' value={valor2} onChange={changeValor2}/>
          <button onClick={calcular}>Somar</button>
          <h1>{soma}</h1>


    </div>
  );
}

export default App;
