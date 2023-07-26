let sexo = "";
let altura = 0;
let ident = 0;
let ideal = 0;

sexo = prompt("Indique o sexo (M/F)")
altura = prompt("Indique sua altura")

if (sexo == "M") {
    ident = 1; 
}
else if (sexo == "F") {
    ident = 2; 
}

switch(ident) {
    case 1:
    ideal = (72 * altura) - 58;
    alert("O peso ideal masculino é de "+ideal+"Kg");
    break;

    case 2:
    ideal = (62 * altura) - 44;
    alert("O peso ideal feminino é de "+ideal+"Kg");
    break;

    default:
        alert("Indicação errada")
        break;
}