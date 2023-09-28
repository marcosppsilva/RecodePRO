import React from "react";
import '../App.css';
import principais from '../assets/home.json'
import Card from "../components/Card";



export default function Home(){
    
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