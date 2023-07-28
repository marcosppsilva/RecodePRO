let num = 0;
let i = 0;

num = prompt("Indique um numero")

if (num > 0) {

for (i = 1; i <= num; i++) {
    document.write(i + "<br>");
}

} else {
    alert("Número indicado inválido, número igual ou menor do que zero");
}


