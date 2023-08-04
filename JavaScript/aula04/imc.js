document.getElementById("carregaCalculoIMC").addEventListener("click",calculoImc);

function calculoImc(); {
    let sexo = document.getElementById();
    let altura = Number(document.getElementById("altura").value);
    let peso = Number(document.getElementById("peso").value);
    let imc = document.getElementById("imc").value;
    let calculo = 0;

    calculo = peso / Number((Math.pow(altura,2)));
    imc = String(calculo);

    document.getElementById("imc").value = imc;

}

