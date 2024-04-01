package ListaAva.Ex3;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {

        List<ContaBancaria> conta = new ArrayList<ContaBancaria>();

        Scanner lala = new Scanner(System.in);

        int opcao = 0, numeroConta = 0;
        int senha;
        String nome_titular;
        float saldo = 0;
        int buscaConta;

        System.out.println("Bem vindo ao Banco!\n*****************");

        while(opcao != 5)
        {
            System.out.println("Por favor escolha uma opcão!\n");
            System.out.println("[1] Cadastrar uma nova conta");
            System.out.println("[2] Depositar um valor");
            System.out.println("[3] Sacar um valor");
            System.out.println("[4] Exibir dados da conta");
            System.out.println("[5] Sair");
            System.out.print("~");

            opcao = lala.nextInt();
            lala.nextLine();

            switch(opcao)
            {
                case 1:

                    System.out.print("Informe o nome do titular: ");
                    nome_titular = lala.nextLine();

                    System.out.print("Informe o saldo base do cliente: ");
                    saldo = lala.nextFloat();
                    lala.nextLine();

                    System.out.println("Informe a senha: ");
                    System.out.print("~ ");
                    senha = lala.nextInt();

                    System.out.println("Cliente cadastrado com sucesso");
                    System.out.println("Numero da conta: " + numeroConta);

                    ContaBancaria cadastroContas = new ContaBancaria(nome_titular, saldo, senha, numeroConta);

                    conta.add(cadastroContas);

                    numeroConta++;

                    break;
                
                case 2:

                    System.out.println("Informe a conta que deseja depositar: ");
                    buscaConta = lala.nextInt();
                    lala.nextLine();

                        if(buscaConta < 0 || buscaConta > numeroConta){
                            System.out.println("Numero Inválido");
                        }else{
                            System.out.println("Informe a senha da conta: ");
                            senha = lala.nextInt();

                                if(conta.get(buscaConta).ConferirSenha(senha) == true){
                                    System.out.print("Informe o valor que deseja depositar: ");
                                    float valor = lala.nextFloat();

                                    conta.get(buscaConta).Depositar(valor);

                                    System.out.println("Saldo atualizado: " + conta.get(buscaConta).Saldinho());
                                }else{
                                    System.out.println("Senha incorreta");
                                    break;
                                }
                        }
                        break;

                    case 3:
                        
                        System.out.println("Informe o numero da conta que deseja fazer o saque: ");
                        buscaConta = lala.nextInt();
                        lala.nextLine();

                            if(buscaConta < 0 || buscaConta > numeroConta){
                                System.out.println("Numero inválido!");

                            }else{

                                System.out.println("Informe a senha da conta: ");
                                senha = lala.nextInt();

                                    if(conta.get(buscaConta).ConferirSenha(senha) == true){
                                        System.out.print("Informe o valor que deseja sacar: ");
                                        float valor = lala.nextFloat();

                                        conta.get(buscaConta).Sacar(valor);

                                        System.out.println("Saldo atualizado: " + conta.get(buscaConta).Saldinho());
                                    }else{
                                        System.out.println("Senha incorreta");
                                        break;
                                    }
                            }
                            break;


                        case 4:
                                System.out.println("Informe o numero da conta: ");
                                buscaConta = lala.nextInt();

                                if(buscaConta < 0 || buscaConta > numeroConta){
                                    System.out.println("Numero inválido!");
                                }else{
                                    System.out.print("Informe a senha da conta: ");
                                    senha = lala.nextInt();
                                        
                                        conta.get(buscaConta).ConferirSenha(senha);

                                        if(true)
                                        {
                                                System.out.println("Informações da conta:  \n");
                                                System.out.println("Numero da conta: " + conta.get(buscaConta).num_conta());
                                                System.out.println("Nome do titular: " + conta.get(buscaConta).nomeTitulaar());
                                                System.out.println("Saldo atual: " + conta.get(buscaConta).Saldinho());
                                        }
                                }

                                default:
                                    System.out.println("Opcao inválida!");
                                    break;
                

            }
            
        }

        System.out.println("Muito obrigado por usar nossos serviços!");

        lala.close();
    }

}