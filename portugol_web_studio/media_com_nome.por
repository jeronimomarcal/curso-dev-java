programa {
  funcao inicio() {
    //var
    cadeia nome
    real n1, n2, n3, n4, n5, media

    //imput
    escreva("Digite o nome do aluno: ")
		leia(nome)
    escreva("Informe o 1° número: ")
    leia(n1)
    escreva("Informe o 2° número: ")
    leia(n2)
    escreva("Informe o 3° número: ")
    leia(n3)
    escreva("Informe o 4° número: ")
    leia(n4)
    escreva("Informe o 5° número: ")
    leia(n5)
    
    //media
    media = (n1 + n2 + n3 + n4 + n5)/5

    //output
    escreva("Aluno: ", nome, "\n", "Nota média: ", media, ".")

  }
}
