import '../App.css';

export function Botao(props){
    return(
        <>
            <button className="btnpadrao" style={{backgroundColor: props.cor}} onClick={props.onClick}>{props.nome}</button>
        </>
    )
}