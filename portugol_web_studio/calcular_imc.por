programa {
  funcao inicio() {
    
    //declarção var..
    cadeia out
    real m, h, imc

    //entrada de dados
    faca{

        escreva("Cálcule o IMC\n")
        escreva("Se deseja continuar digite (Vamos) caso não digite (Sair):\n")
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
