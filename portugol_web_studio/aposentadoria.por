programa {
	funcao inicio() {
		// declaração de variáveis
		cadeia nome
		inteiro idade
		inteiro tempo
		
		// entrada de dados
		escreva (" Digite o seu Nome: ")
		leia(nome)
		escreva(" Digite sua idade: ")
		leia(idade)
		escreva(" Quanto tempo de contribuição: ")
		leia(tempo)
		
        // estrutura de decisão se...senao
		se (idade >= 65 ) {
		se (tempo >=15 )
		    escreva(nome, " Pode curtir sua aposentadoria amigo. ")
		}
		
		senao
		    escreva(nome, " Vai ter que trabalhar mais um poquinho irmao. ")
		
	
	}
}
