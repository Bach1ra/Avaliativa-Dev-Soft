package ListaAva.Ex5;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String args[])
    {
        String marca_carro, modelo;
        int placa, ano, senha;
        int velocidade_atual = 0, velocidade_maxima, id = 0;
        int opcao = 0;
        int buscaCarro = 0;

        System.out.println("Bem vindo ao nosso cadastro de carros!\n");

        List<Carros> carros = new ArrayList<Carros>();

        Scanner lala = new Scanner(System.in);

        while(opcao != 5)
        {

                System.out.println("Escolha uma opcâo: ");
                System.out.println("[1] Cadastrar um novo veículo");
                System.out.println("[2] Acelerar");
                System.out.println("[3] Freiar");
                System.out.println("[4] Exibir informações");
                System.out.println("[5] Sair");
                System.out.print("~ ");

                opcao = lala.nextInt();
                lala.nextLine();

                switch(opcao)
                {
                    case 1:

                        System.out.print("Informe a marca do veiculo: ");
                        marca_carro = lala.nextLine();

                        System.out.print("Informe o modelo do carro: ");
                        modelo = lala.nextLine();

                        System.out.print("Informe o ano do carro: ");
                        ano = lala.nextInt();

                        System.out.print("Informe a placa: ");
                        placa = lala.nextInt();

                        System.out.print("Informe a velocidade maxima do carro: ");
                        velocidade_maxima = lala.nextInt();

                        System.out.print("Informe a velocidade atual: ");
                        velocidade_atual = lala.nextInt();

                        System.out.print("Informe a senha do cadastro: ");
                        senha = lala.nextInt();

                        System.out.println("Seu veículo foi cadastrado! Numero de identificação: " + id);

                        Carros cadastroCarros = new Carros(marca_carro, modelo, placa, velocidade_atual, velocidade_maxima, ano, senha);

                        carros.add(cadastroCarros);

                        id++;

                        break;

                    case 2:

                        System.out.print("Informe o carro que deseja acelerar: ");
                        buscaCarro = lala.nextInt();

                        if(buscaCarro < 0 || buscaCarro > id)
                        {
                            System.out.println("Numero invalido");
                            break;
                        }else{
                            System.out.print("Informer a senha: ");
                            senha = lala.nextInt();

                                if(carros.get(buscaCarro).ConferirSenha(senha) == true)
                                {
                                    carros.get(buscaCarro).Acelerar();

                                    System.out.println("Velocidade atual: " + carros.get(buscaCarro).velocidade_atual());
                                }else{
                                    System.out.println("Senha invalida");
                                    break;
                                }
                        }
                        break;

                        case 3:

                            System.out.print("Informe o carro que deseja freiar: ");
                            buscaCarro = lala.nextInt();

                                if(buscaCarro < 0 || buscaCarro > id)
                                {
                                    System.out.println("Numero invalido");
                                    break;
                                }else{
                                    System.out.print("Informer a senha: ");
                                    senha = lala.nextInt();

                                        if(carros.get(buscaCarro).ConferirSenha(senha) == true)
                                        {
                                            carros.get(buscaCarro).Freiar();

                                            System.out.println("Velocidade atual: " + carros.get(buscaCarro).velocidade_atual());
                                        }else{
                                            System.out.println("Senha invalida");
                                            break;
                                        }
                                }
                                
                            break;
                        case 4:

                            System.out.print("Informe o carro que deseja saber as informações: ");
                            buscaCarro = lala.nextInt();
                                
                                if(buscaCarro < 0 || buscaCarro > id)
                                {
                                    System.out.println("Numero invalido");
                                    break;
                                }else{
                                    System.out.print("Informer a senha: ");
                                    senha = lala.nextInt();
                                    
                                        if(carros.get(buscaCarro).ConferirSenha(senha) == true)
                                        {
                                            System.out.println("Modelo: " + carros.get(buscaCarro).modelo());
                                            System.out.println("Marca: " + carros.get(buscaCarro).marca_carro());
                                            System.out.println("Ano: " + carros.get(buscaCarro).ano());
                                            System.out.println("Placa: " + carros.get(buscaCarro).placa());
                                            System.out.println("Id: " + buscaCarro);
                                        }
                                }
                        
                                if(opcao < 0 || opcao > 5){
                                    System.out.println("Numero invalido!");
                                    break;
                            }

                            if(opcao <=0 || opcao > 5)
                            {
                                System.out.println("Opcao invalida!");
                                break;
                            }
                                 
                }
        }
        System.err.println("Obrigado por vir!");
        lala.close();
    }   
}
