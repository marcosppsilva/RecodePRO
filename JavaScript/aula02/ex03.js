let num = 0;
let i = 0;

num = prompt("Indique um numero")

if (num > 0) {
do {
    document.write(i+"<br>");
    i++
}
while (i  <= num)
}

else {
    alert("Número indicado inválido, número igual ou menor do que zero");
}