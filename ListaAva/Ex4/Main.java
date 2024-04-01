package ListaAva.Ex4;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{

    public static void main(String[] agrs)
    {
        List<Jogador> jogador = new ArrayList<Jogador>();

        Scanner lala = new Scanner(System.in);
        
        int nivel, id = 0, cod;
        float pontuacao;
        String nome;
        int opcao = 0;
        int buscaJogador = 0;
        float valor_pt;
        int valor_nv;


        System.out.println("Bem vindo ao cadastro do nosso jogo!");

        while (opcao != 5) {
            System.out.println("Escolha uma opção abaixo para continuar: ");
            System.out.println("[1] Cadastrar novo jogador");
            System.out.println("[2] Alterar nivel");
            System.out.println("[3] Alterar pontuação");
            System.out.println("[4] Exibir status");
            System.out.println("[5] Sair");
            System.out.print("~ ");

            opcao = lala.nextInt();
            lala.nextLine();

            switch(opcao)
            {
                case 1:
                        System.out.print("Informe o nome do Jogador: ");
                        nome = lala.nextLine();

                        System.out.print("Informe a pontuação do personagem: ");
                        pontuacao = lala.nextFloat();

                        System.out.print("Informe o nivel do personagem: ");
                        nivel = lala.nextInt();

                        System.out.print("Informe o codigo de acesso: ");
                        cod = lala.nextInt();

                        Jogador cadastroJogador = new Jogador(nome, pontuacao, nivel, id, cod);

                        jogador.add(cadastroJogador);

                        System.out.println("Seu personagem foi cadastrado e seu id é de número " + id + "\n Seja bem vindo ao jogo!!");

                        id++;

                    break;

                    case 2:

                        System.out.println("Informe o id do personagem que deseja atualizar o nivel: ");
                        buscaJogador = lala.nextInt();
                            
                            if(buscaJogador < 0 || buscaJogador > id)
                            {
                                System.out.println("Numero invalido");
                                break;
                            }else{
                                System.out.print("Informe o codigo de acesso do personagem: ");
                                cod = lala.nextInt();

                                if(jogador.get(buscaJogador).ConferirCod(cod) == true)
                                {
                                    System.out.print("Informe o nível do personagem: ");
                                    valor_nv = lala.nextInt();

                                    jogador.get(buscaJogador).AtualizarNivel(valor_nv);

                                    System.out.println("Nivel atual: " + jogador.get(buscaJogador).nivel());
                                }else{
                                    System.out.println("Codigo inválido");
                                    break;
                                }
                            }
                        break;

                        case 3:
                            
                            System.out.println("Informe o id do personagem que deseja atualizar a pontuação: ");
                            buscaJogador = lala.nextInt();
                            
                                if(buscaJogador < 0 || buscaJogador > id)
                                {
                                    System.out.println("Numero invalido");
                                    break;
                                }else{
                                    System.out.print("Informe o codigo de acesso do personagem: ");
                                    cod = lala.nextInt();

                                    if(jogador.get(buscaJogador).ConferirCod(cod) == true)
                                    {
                                        System.out.print("Informe a pontuação: ");
                                        valor_pt = lala.nextInt();

                                        jogador.get(buscaJogador).AtualizarPontuacao(valor_pt);

                                        System.out.println("Pontuação atual: " + jogador.get(buscaJogador).pontuacao());
                                    }else{
                                        System.out.println("Codigo invalido");
                                        break;
                                    }
                                }
                            break;
                        
                        case 4:

                                System.out.print("Informe o id do personagem que deseja ver as insformações: ");
                                buscaJogador = lala.nextInt();

                                    if(buscaJogador < 0 || buscaJogador > id){
                                        System.out.println("Numero inválido!");
                                        break;
                                    }else{
                                        System.out.print("Informe o codigo de acesso do personagem: ");
                                        cod = lala.nextInt();
                                            if(jogador.get(buscaJogador).ConferirCod(cod) == true){
                                                System.out.println("Id: " + buscaJogador);
                                                System.out.println("Nome personagem: " + jogador.get(buscaJogador).nome_invocador());
                                                System.out.println("Pontuação atual: " + jogador.get(buscaJogador).pontuacao());
                                                System.out.println("Nivel atual: " + jogador.get(buscaJogador).nivel());
                                            }else{
                                                System.out.println("Codigo inválido");
                                                break;
                                            }
                                    }
                        

                        if(opcao <=0 || opcao > 5)
                        {
                            System.out.println("Opcao invalida");
                            break;
                        }
            }
        }
        System.out.println("Adeus!");
        lala.close();

    }
}