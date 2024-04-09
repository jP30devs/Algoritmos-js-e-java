function contarInteiros(primeiroDado, N) {
    let contador = 0;

    for (let i = primeiroDado; i <= N; i++) {
        if (Number.isInteger(i)) {
            contador++;
        }
    }

    return contador;
}
const primeiroDado = 3;
const N = 10;
const quantidadeInteiros = contarInteiros(primeiroDado, N);
console.log("Quantidade de valores inteiros:", quantidadeInteiros);