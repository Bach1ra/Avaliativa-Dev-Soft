package ListaAva.Ex2;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args)
    {
        Scanner lala = new Scanner(System.in);

        while(true){

        Livros.Cadastro();

        System.out.print("Deseja fazer outro cadastro? ");
        String opcao = lala.nextLine();

        if(opcao.equals("n")){
            break;
            }
        }
        Livros.exibirInfo();

        lala.close();
    }
}
