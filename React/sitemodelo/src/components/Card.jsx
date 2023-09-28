import React from "react";
import '../App.css';
import Botao from "./Botao";

export default function Card(props){

    return(
        <div className="cards">
            <img src={props.imagem} className="imgexemplo"/>
            <h1>{props.titulo}</h1>
            <p>{props.texto}</p>
            <Botao descri={props.descri}/>
        </div>
    )
}