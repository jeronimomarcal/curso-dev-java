programa {
  funcao inicio() {
    
    //declar��o var..
    cadeia out
    real m, h, imc

    //entrada de dados
    faca{

        escreva("C�lcule o IMC\n")
        escreva("Se deseja continuar digite (Vamos) caso n�o digite (Sair):\n")
        leia(out)
        	se (out != "sair"){
            senao
            escreva("Informe o peso (kg): ")
            leia(m)
            escreva("Informe a altura (m): ")
            leia(h)
	    
      imc = m / (h + h)                     
      escreva("Imc: ", imc, ".\n")
      }   
    }   enquanto (out != "sair")

  }
}
