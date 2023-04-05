programa {
	funcao inicio() {
		// declara~ção de variáveis
		cadeia nome
		inteiro idade
		
		// entrada de dados
		escreva ("Digite o seu Nome: ")
		leia(nome)
		escreva("Digite sua idade: ")
		leia(idade)
		
		
		// estrutura de decisão se...senao
		se (idade >= 18) {
		    escreva(nome, " é maior de idade. ")
		}
		senao {
		    escreva(nome, " é menor de idade. ")
		}
	}
}
