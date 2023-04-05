programa {
  funcao inicio() {
    	
      //declaraçao de var...

      cadeia nomes[5]
	    real notas[5], media, soma = 0
      inteiro i

    //entrada de dados
    para (i = 0; i < 5; i++) {
      escreva("Digite o nome ", i+1, "° aluno: ")
      leia(nomes[i])
      escreva("Informe a nota do aluno ", nomes[i],":")
      leia(notas[i])
    }

    //soma
    para (i = 0; i < 5; i++) {
      soma = soma + notas[i]
    }

    //média
    media = soma/i

    //imprime tela
    escreva("A média é: ", media, ".")
  }
}
