programa {
  funcao inicio() {
    // array
    // existem 2 tipos de array:
    // vetor
    // matriz

    //declaração de variaveis
    cadeia nomes[5]
    inteiro i

    //imput
    para (i = 0; i < 5; i++) {
      escreva("Informe o ", i + 1, "° nome: ")
      leia(nomes[i])
    }

    //output
    para (i = 0; i < 5; i++) {
      escreva(i + 1, "° nome: ", nomes[i], ".\n")
    }

  }
}
