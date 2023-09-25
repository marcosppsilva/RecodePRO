import './App.css';
import Card from "./components/Card";
import pauseImg from './pause.png'
import playImg from './play.png'
import resetImg from './reset.png'
function App() {
    
   return (
    <div className='cards'>
      <h1>CURSOS</h1>
      <Card img={pauseImg} titulo='Pare Com o HTML' texto='E venha para o melhor curso da área de programação com o professor Flávio' cor='red'/>     
      <Card img={playImg} titulo='Comece com React' texto='Acabe o HTML e venha para o melhor curso da área de programação com o professor Flávio'/>
      <Card img={resetImg} titulo='Recomece a Estudar' texto='Não fique para trás e venha para o melhor curso da área de programação com o professor Flávio'/>
    </div>
  );
}

export default App;
