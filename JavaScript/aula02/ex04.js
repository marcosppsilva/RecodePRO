let num = 0;
let soma40 = 0;
let i = 1;
let ate40 = 0;

while (i <= 10) { 
num = Number(prompt("Indique o "+ i +"° Número"))
    if (num < 40) {
        soma40 = num + soma40
        ate40++
    }
    document.write(i + "° numero dígitado: " + num + "<br>")
i++
}

alert("Foram digitados "+ate40+" numeros abaixo de 40 e a soma total deles foi " + soma40)

document.write("Foram digitados "+ate40+" numeros abaixo de 40 e a soma total deles foi " + soma40)