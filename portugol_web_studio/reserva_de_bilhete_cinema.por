programa {
	funcao inicio() {
	    //var
	    cadeia nome
	    caracter sala
	    inteiro idade, idadeMin
	
	    //algoritimo
	        escreva("Informe o nome: ")
	        leia(nome)
	        escreva("Informe a idade: ")
	        leia(idade)
	    
	    faca{
	        escreva("Escolha a sala do filme desejado: ")
	        escreva("\nSala1 - Jhon Wick 4 - 16 anos")
	        escreva("\nSala2 - Pânico 6 - 18 anos")
	        escreva("\nSala3 - Gato de Botas 2 - Livre")
	        escreva("\nSala4 - Desaparecida - 12 anos")
	        escreva("\nSala5 - Creed 3 - 14 anos \n")
	        leia(sala)
	        
	        escolha (sala) {
	            caso "1":
	                idadeMin = 16
	                
	                se (idade >= idadeMin) {
	                    escreva("Bom filme!")
	                }
	                senao {
	                    escreva("Idade não permitida. \n")
	                    escreva("Favor escolher outro filme. ")
	                }
	                pare
	               caso "2":
	                idadeMin = 18
	                
	                se (idade >= idadeMin) {
	                    escreva("Bom filme!")
	                }
	                senao {
	                    escreva("Idade não permitida. \n")
	                    escreva("Favor escolher outro filme. ")
	                }
	                pare
	               caso "3":
	                idadeMin = 0
	                
	                escreva("Bom filme!")
	                pare
	               caso "4":
	                idadeMin = 12
	                
	               se (idade >= idadeMin) {
	                    escreva("Bom filme!")
	               }
	               senao {
	                    escreva("Idade não permitida. \n")
	                    escreva("Favor escolher outro filme. ")
	               }
	               pare
	               caso "5":
	               idadeMin = 14
	                
	               se (idade >= idadeMin) {
	                    escreva("Bom filme!")
	               }
	               senao {
	                    escreva("Idade não permitida. \n")
	                    escreva("Favor escolher outro filme. ")
	               }
	               pare
	           caso contrario:
	            idadeMin = 0
	            
	            escreva("Sala inexistente. \n")
	            escreva("Favor escolher outro filme")
	            pare
	                   
	        }

	    } enquanto (idade < idadeMin)
	    
	}
}
