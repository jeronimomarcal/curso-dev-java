programa {
	funcao inicio() {
		// declara��o de vari�veis
		cadeia nome
		caracter genero
		inteiro idade, contrib
		
		// entrada de dados
		escreva (" Informe o seu Nome: ")
		leia(nome)
		escreva ("Informe o seu genero M ou F: ")
		leia(genero)
		escreva (" Informe a sua idade: ")
		leia(idade)
		escreva (" Informe o tempo de contribui��o: ")
		leia(tempo)
		
        // ealgoritimo
		se (genero == "m") {
		    se (idade >= 65 e contrib >= 20) {
		        escreva(nome, " n�o pode se aposentar.")
		    }
		}
	senao {
	    se (idade >= 62 e contrib >= 15) {
	        escreva(nome, " pode aposentar.")
	    }
	    senao {
	        escreva(nome, " n�o pode se aposentar.")
	    }
	}
	}
}
