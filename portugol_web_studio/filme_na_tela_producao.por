programa {
	funcao inicio() {
	//var
	cadeia nome, idade, sala
	
	
	escreva("Avatar: O Caminho da �gua - Faixa et�ria 16 anos - sala 1 ", ".\n")
	escreva("Titanic - Faixa et�ria 14 anos - sala 2  ", ".\n")
	escreva("Star Wars: O Despertar da For�a - Faixa et�ria 18 anos - sala 3 ", ".\n")
	escreva("Vingadores: Guerra Infinita - Faixa et�ria 10 anos - sala 4  ", ".\n")
	escreva("Homem-Aranha: Sem Volta Para Casa - Faixa et�ria 18 anos - sala 5 ", ".\n")
	
	//la�o repeti��o
	faca{
	    escreva("Informe o seu nome para a reserva: ")
	    leia(nome)
	    
	    escreva("Informe o sua idade para a reserva: ")
	    leia(idade)
	    
	    escreva("Informe a sala do filme para a reserva: ")
	    leia(sala)
	    
	    se (filme != "sair"){
	        escreva("O nome do filme � ", filme, ".\n")
	    }
	    
	    escreva("o nome do filme � ", filme, ".")
	}   enquanto (filme != "sair")
		
	}
}
