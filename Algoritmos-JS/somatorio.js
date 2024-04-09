function somatorio(array) {
    let total = 0;
    for (let i = 0; i < array.length; i++) {
        total += array[i];
    }
    return total;
}

// Exemplo de uso:
const numeros = [1, 2, 3, 4, 5, 6, 7];
console.log(somatorio(numeros));