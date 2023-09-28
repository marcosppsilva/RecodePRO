import React from "react";
import '../App.css';
import { BrowserRouter, Route, Routes, Link } from 'react-router-dom';

export default function Navbar(){

    return(      
        <nav>            
            <ul>
                <Link to="/" className="links"><li>Home</li></Link>
                <Link to="/sobre" className="links"><li>Sobre</li></Link>
                <Link to="/cursos" className="links"><li>Cursos</li></Link>
            </ul>
        </nav>
    )
}