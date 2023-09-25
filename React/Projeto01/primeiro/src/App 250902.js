import './App.css';
import React, {useState} from 'react';
import { Botao } from './components/Botao';

function App() {
  
  const [real, setReal] = useState(0);
  const [dolar, setDolar] = useState(4.96)
  const [convertido, setConvertido] = useState(0)

  const changeReal = (event) =>{
    setReal(event.target.value)
  }

  const conversor = () =>{
    setConvertido((Number(real) / Number(dolar)).toFixed(2))
  }

  function alerta(){
    alert('Meu pai me mandou');
  }


  //Função que controla o estado do input e do valor
  //Exercicio converter real para dolar
  
   return (
    <div className='aula2509'>
          <h1>Conversor Dólar</h1>
          <input type='text' className='moedas' value={real} onChange={changeReal}/>
          <h2>Valor  do dólar atual:</h2>
          <input type='text' className='moedas' value={dolar}/>
          <button onClick={conversor}>Converter</button>
          <h1>R${convertido}</h1>
          <Botao nome='Salvar' cor='white'/>
          <Botao nome='Cancelar' />
          <Botao nome='Alerta' onClick={alerta} />
          
    </div>
  );
}

export default App;
