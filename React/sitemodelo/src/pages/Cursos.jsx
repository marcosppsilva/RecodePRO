import React from "react";
import principais from '../assets/cursos.json';
import Card from "../components/Card";
import '../App.css';

export default function Cursos(){
    
    return(
        <div className="pagina">
            {principais.map((ele, index) =>(
                <Card 
                key={index} 
                titulo={ele.titulo} 
                texto={ele.texto} 
                descri={"Conheça"} 
                imagem={ele.foto}/>                
            ))}
        </div>
    )
}