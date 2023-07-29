let a = 10;
let b = 10;
let c = '10';
let d = 20;

/*Retorna true porque os valores são iguais*/
console.log(Boolean(a=b));

/*Retorna verdadeiro porque os valores dos conteúdos são iguais mesmo sendo de tipos diferentes*/
console.log(Boolean(a=c));

/*Retorna true porque os valores e os tipos são iguais ***Ver com o pessoal da Recode, pois não está de acordo com o que diz no moodle*** */
console.log(Boolean(a===b));

/*Retorna false porque os valores são iguais mas os tipos são diferentes ***Ver com o pessoal da Recode, pois não está de acordo com o que diz no moodle*** */
console.log(Boolean(a===c));

/*Retorna false porque os valores são iguais*/
console.log(Boolean(a!=b));

/*Retorna false porque os valores são iguais, aqui o tipo não importa*/
console.log(Boolean(a!=c));

/*Retorna true porque os valores são diferentes ***Ver com o pessoal da Recode, pois não está de acordo com o que diz no moodle*** */
console.log(Boolean(a!==c));

/*Retorna false porque os valores são iguais, aqui o tipo não importa*/
console.log(Boolean(a!==c));