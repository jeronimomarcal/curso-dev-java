programa {
	funcao inicio() {
	//var
	cadeia nome, idade, sala
	
	
	escreva("Avatar: O Caminho da Água - Faixa etária 16 anos - sala 1 ", ".\n")
	escreva("Titanic - Faixa etária 14 anos - sala 2  ", ".\n")
	escreva("Star Wars: O Despertar da Força - Faixa etária 18 anos - sala 3 ", ".\n")
	escreva("Vingadores: Guerra Infinita - Faixa etária 10 anos - sala 4  ", ".\n")
	escreva("Homem-Aranha: Sem Volta Para Casa - Faixa etária 18 anos - sala 5 ", ".\n")
	
	//laço repetição
	faca{
	    escreva("Informe o seu nome para a reserva: ")
	    leia(nome)
	    
	    escreva("Informe o sua idade para a reserva: ")
	    leia(idade)
	    
	    escreva("Informe a sala do filme para a reserva: ")
	    leia(sala)
	    
	    se (filme != "sair"){
	        escreva("O nome do filme é ", filme, ".\n")
	    }
	    
	    escreva("o nome do filme é ", filme, ".")
	}   enquanto (filme != "sair")
		
	}
}
