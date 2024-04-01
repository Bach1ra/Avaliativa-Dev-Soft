package ListaAva.Ex5;

public class Carros {
    
    private String marca_carro, modelo;
    private int placa, ano, senha;
    private int velocidade_atual, velocidade_maxima;


    public Carros(String marca_carro, String modelo, int placa, int velocidade_atual, int velocidade_maxima, int ano, int senha)
    {
        this.marca_carro = marca_carro;
        this.modelo = modelo;
        this.placa = placa;
        this.velocidade_atual = velocidade_atual;
        this.velocidade_maxima = velocidade_maxima;
        this.ano = ano;
        this.senha = senha;
    }

    public String marca_carro()
    {
        return this.marca_carro;
    }

    public String modelo()
    {
        return this.modelo;
    }

    public int placa()
    {
        return this.placa;
    }

    public int velocidade_atual()
    {
        return this.velocidade_atual;
    }

    public int velocidade_maxima()
    {
        return this.velocidade_maxima;
    }
    public int ano()
    {
        return this.ano;
    }

    public int Acelerar()
    {
        if(this.velocidade_maxima <= this.velocidade_atual)
        {
            System.out.println("Velocidade maxima atingida!");
            return this.velocidade_atual;
        }else{
            this.velocidade_atual += 5;
            return this.velocidade_atual;
        }
    }

    public int Freiar()
    {
        if(0 == this.velocidade_atual)
        {
            System.out.println("Velocidade minima atingida!");
            return this.velocidade_atual;
        }else{
            this.velocidade_atual -= 5;
            return this.velocidade_atual;
        }
    }

    public boolean ConferirSenha(int buscaCarro)
    {
        if(this.senha == buscaCarro){
            return true;
        }else{
            return false;
        }
    }
}
