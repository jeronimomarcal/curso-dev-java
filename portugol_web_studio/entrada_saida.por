programa {
	funcao inicio() {
		// declara~��o de vari�veis
		cadeia nome
		inteiro idade
		
		// entrada de dados
		escreva ("Digite o seu Nome: ")
		leia(nome)
		escreva("Digite sua idade: ")
		leia(idade)
		
		
		// estrutura de decis�o se...senao
		se (idade >= 18) {
		    escreva(nome, " � maior de idade. ")
		}
		senao {
		    escreva(nome, " � menor de idade. ")
		}
	}
}
