const numeros = [3, 1, 4, 1, 5, 9, 2, 6, 5];
numeros.sort((a, b) => a - b);
console.log("Ordenação crescente:", numeros);

const outrosNumeros = [3, 1, 4, 1, 5, 9, 2, 6, 5];
outrosNumeros.sort((a, b) => b - a);
console.log("Ordenação decrescente:", outrosNumeros);

const palavras = ["maçã", "banana", "laranja", "uva"];
palavras.sort();
console.log("Ordenação alfabética:", palavras);