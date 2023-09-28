import './App.css';
import { BrowserRouter, Route, Routes, Link } from 'react-router-dom';
import Navbar from './components/Navbar';
import Home from './pages/Home';
import Sobre from './pages/Sobre';
import Cursos from './pages/Cursos';
import Rodape from './components/Rodape';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
      <Navbar />     
      <Routes>
            <Route path="/" element={<Home />}/>
            <Route path="/sobre" element={<Sobre />} className="pagina"/>
            <Route path="/cursos" element={<Cursos />} className="pagina"/>
      </Routes>
      <Rodape />
      </BrowserRouter>
    </div>
  );
}

export default App;
