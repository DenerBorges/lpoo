package controller;

import dao.PessoaDAO;
import model.Pessoa;

import java.util.List;
import java.util.Scanner;

public class PessoaController {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int opiton = 0;
        do {
            System.out.print("\n _____________Selecione uma Operacao_______________\n");
            System.out.print("\n 1- Inserir nova pessoa." +
                    "\n 2- Atualizar uma pessoa." +
                    "\n 3- Listar todas as pessoas." +
                    "\n 4- Buscar pessoas por codigo." +
                    "\n 5- Buscar pessoas por nome." +
                    "\n 6- Buscar pessoas por situacao." +
                    "\n 0- Sair.\n");
            opiton = input.nextInt();
            input.nextLine();
            switch (opiton) {
                case 1: inserir();
                    break;
                case 2: atualizar();
                    break;
                case 3: selectPessoas();
                    break;
                case 4: selectPessoasById();
                    break;
                case 5: selectPessoasByNome();
                    break;
                case 6: selectPessoasBySituacao();
                    break;
                default:
                    if (opiton != 0)
                        System.out.print("Operacao Invalida.");
            }
        } while (opiton != 0);

    }
    private static void inserir() {
        Pessoa pessoa = new Pessoa();
        System.out.print("\n Cadastro de Pessoa");
        System.out.print("\nDigite o Nome: ");
        pessoa.setNome(input.nextLine());
        System.out.print("\nDigite o CPF: ");
        pessoa.setCpf(input.nextLine());
        System.out.print("\nDigite o E-mail: ");
        pessoa.setEmail(input.nextLine());
        System.out.print("\nDigite a Senha: ");
        pessoa.setSenha(input.nextLine());
        System.out.print("\nDigite o Status: ");
        pessoa.setStatus(input.nextLine());
        System.out.print("\nDigite o Curso: ");
        pessoa.setCurso(input.nextLine());
        pessoa.setSituacao(true);

        if (PessoaDAO.insertPessoa(pessoa)) {
            System.out.print("\nPessoa cadastrada com sucesso");
        }
        else {
            System.out.print("\nErro ao cadastrar!");
        }
    }

    private static void atualizar() {
        System.out.print("\n Atualizar Pessoa");
        Pessoa pessoa = null;
        int option = 0;
        do {
            System.out.print("\nDigite o codigo da pessoa.");
            long codigo = input.nextLong();
            input.nextLine();
            if (codigo == 0) {
                option = 0;
            }
            else {
                pessoa = PessoaDAO.selectPessoaById(codigo);
                if (pessoa == null) {
                    System.out.print("\nCodigo invalido.");
                }
                else {
                    System.out.print("\nNome: " + pessoa.getNome());
                    System.out.print("\nFazer alteracao? (0- Sim / 1- Nao)");
                    if (input.nextInt() == 0) {
                        input.nextLine();
                        System.out.print("\nDigite o novo nome: ");
                        pessoa.setNome(input.nextLine());
                    }
                    System.out.print("\nCPF: " + pessoa.getCpf());
                    System.out.print("\nFazer alteracao? (0- Sim / 1- Nao)");
                    if (input.nextInt() == 0) {
                        input.nextLine();
                        System.out.print("\nDigite o novo CPF: ");
                        pessoa.setCpf(input.nextLine());
                    }
                    System.out.print("\nE-mail: " + pessoa.getEmail());
                    System.out.print("\nFazer alteracao? (0- Sim / 1- Nao)");
                    if (input.nextInt() == 0) {
                        input.nextLine();
                        System.out.print("\nDigite o novo e-mail: ");
                        pessoa.setEmail(input.nextLine());
                    }
                    System.out.print("\nSenha: " + pessoa.getSenha());
                    System.out.print("\nFazer alteracao? (0- Sim / 1- Nao)");
                    if (input.nextInt() == 0) {
                        input.nextLine();
                        System.out.print("\nDigite o novo senha: ");
                        pessoa.setSenha(input.nextLine());
                    }
                    System.out.print("\nStatus: " + pessoa.getStatus());
                    System.out.print("\nFazer alteracao? (0- Sim / 1- Nao)");
                    if (input.nextInt() == 0) {
                        input.nextLine();
                        System.out.print("\nDigite o novo status: ");
                        pessoa.setStatus(input.nextLine());
                    }
                    System.out.print("\nCurso: " + pessoa.getCurso());
                    System.out.print("\nFazer alteracao? (0- Sim / 1- Nao)");
                    if (input.nextInt() == 0) {
                        input.nextLine();
                        System.out.print("\nDigite o novo curso: ");
                        pessoa.setCurso(input.next());
                    }
                    pessoa.setSituacao(true);
                    if (PessoaDAO.updatePessoa((pessoa))) {
                        System.out.println("\nCadastro de pessoa atualizada com sucesso: " + pessoa);
                    }
                    else {
                        System.out.print("\nErro ao atualizar cadastro!");
                    }
                    option = 1;
                }
            }
        } while (option != 0);
    }

    private static void selectPessoas() {
        System.out.println("\n Lista de pessoas cadastradas no sistema:\n" + PessoaDAO.selectPessoas());
    }

    private static void selectPessoasById() {
        System.out.print("\nDigite o codigo da pessoa: ");
        Pessoa pessoa = PessoaDAO.selectPessoaById(input.nextLong());
        input.nextLine();
        if(pessoa != null) {
            System.out.println(pessoa);
        }
        else {
            System.out.println("Codigo nao encontrado.");
        }
    }

    private static void selectPessoasByNome() {
        System.out.print("\nDigite o nome da pessoa: ");
        String nome = input.next();
        System.out.println("\nChave da pesquisa: " + nome);
        List<Pessoa> pessoas = PessoaDAO.selectPessoasByName(nome);
        if (pessoas.isEmpty()) {
            System.out.println("\nNao ha registros correspondentes para: " + nome);
        }
        else {
            System.out.println(pessoas);
        }
    }

    private static void selectPessoasBySituacao() {
        System.out.print("Escolha uma das situacoes (0-inativo / 1-ativo)");
        int situcao = input.nextInt();
        input.nextLine();
        List<Pessoa> pessoas;
        switch (situcao) {
            case 0: pessoas = PessoaDAO.selectPessoasBySituacao(false);
                System.out.println("\nPessoa na situacao INATIVO:\n" + pessoas);
                break;
            case 1: pessoas = PessoaDAO.selectPessoasBySituacao(true);
                System.out.println("\nPessoa na situacao ATIVO:\n" + pessoas);
                break;
        }
    }

}