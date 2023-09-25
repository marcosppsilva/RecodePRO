import '../App.css';

export default function Card(props){
    
    return(
    <div className='cardModel' style={{backgroundColor: props.cor}}>
        <img src={props.img} alt={props.img}/>
        <h1>{props.titulo}</h1>
        <p>{props.texto}</p>

    </div>
    )
}