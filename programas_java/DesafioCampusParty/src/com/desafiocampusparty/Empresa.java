package com.desafiocampusparty;
import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    private ArrayList<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void removerFuncionario(Funcionario f) {
        funcionarios.remove(f);
    }

    public void listarFuncionarios() {
        for (Funcionario f : funcionarios) {
            System.out.println(f.toString());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa();

        // Adicionando funcionários
        empresa.adicionarFuncionario(new Funcionario("João da Silva", "01/01/1990", "Rua A, 123", "Gerente", 5000.00));
        empresa.adicionarFuncionario(new Funcionario("Maria Souza", "15/03/1995", "Av. B, 456", "Assistente Administrativo", 2500.00));
        empresa.adicionarFuncionario(new Funcionario("Carlos Santos", "27/07/1987", "Rua C, 789", "Programador", 4000.00));

        // Exibindo funcionários
        System.out.println("Funcionários cadastrados:");
        empresa.listarFuncionarios();

        // Adicionando um novo funcionário
        System.out.println("Adicionar novo funcionário:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Data de nascimento: ");
        String dataNascimento = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Para limpar o buffer do teclado

        empresa.adicionarFuncionario(new Funcionario(nome, dataNascimento, endereco, cargo, salario));

        // Exibindo funcionários novamente
        System.out.println("Funcionários cadastrados:");
        empresa.listarFuncionarios();
    }
}

