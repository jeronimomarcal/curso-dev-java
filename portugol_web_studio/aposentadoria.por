programa {
	funcao inicio() {
		// declara��o de vari�veis
		cadeia nome
		inteiro idade
		inteiro tempo
		
		// entrada de dados
		escreva (" Digite o seu Nome: ")
		leia(nome)
		escreva(" Digite sua idade: ")
		leia(idade)
		escreva(" Quanto tempo de contribui��o: ")
		leia(tempo)
		
        // estrutura de decis�o se...senao
		se (idade >= 65 ) {
		se (tempo >=15 )
		    escreva(nome, " Pode curtir sua aposentadoria amigo. ")
		}
		
		senao
		    escreva(nome, " Vai ter que trabalhar mais um poquinho irmao. ")
		
	
	}
}
