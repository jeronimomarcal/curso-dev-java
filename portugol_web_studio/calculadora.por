programa
{
	funcao inicio()
	{
		//var
		caracter op
		cadeia n
		real resultado = 0.0, op1, op2
		
        //imput
		escreva("Digite o 1° número: ")
		leia(op1)

		escreva("Digite o 2° número: ")
		leia(op2)

		escreva("\n")
		
		escreva("Escolha uma das operações a ser feita ( + - * / ): ")
		leia(op)

		//definindo a operação (algoritimo)
		
		se (op == '+')
		{
			resultado = op1 + op2
			
		}
		senao  se(op == '-')
		{
			resultado = op1 - op2
			
		}
		senao se(op == '/')
		{
			resultado = op1 / op2
			
		}
		senao se(op == '*')
		{
			resultado = op1 * op2
		}	

		limpa()
		
		escreva("Resultado:")
		escreva(op1, " ", op, " ", op2, " = ", resultado)
		
        escreva("\n")

	}	
		

	    
}
