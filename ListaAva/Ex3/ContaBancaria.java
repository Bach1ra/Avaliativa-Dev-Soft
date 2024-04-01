package ListaAva.Ex3;

public class ContaBancaria {

    private String nome_tit;
    private Float sal;
    private int sen;
    private int n_conta;

    
    public ContaBancaria(String nome_titular, float saldo, int senha, int numeroConta)
    {
        this.nome_tit = nome_titular;
        this.sal = saldo;
        this.sen = senha;
        this.n_conta = numeroConta;
    }

    public boolean ConferirSenha(int senha)
    {
        if(this.sen == senha){
            return true;
        }else{
            return false;
        }
    }

    public float Saldinho()
    {
        return this.sal;
    } 

    public void Depositar(float valor)
    {
        this.sal += valor;
    }

    public void Sacar(float valor)
    {
        this.sal -= valor;
    }

    public String nomeTitulaar()
    {   
        return this.nome_tit;
    }
    public int num_conta()
    {
        return this.n_conta;
    }


}
