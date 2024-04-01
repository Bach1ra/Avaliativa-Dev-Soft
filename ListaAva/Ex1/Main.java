package ListaAva.Ex1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner lala = new Scanner(System.in);

        while(true){
            Calculadora.operacao();
            
            System.out.println("Deseja fazer outra operação? ");
            String resposta = lala.nextLine();

            if(resposta.equals("n")){
                break;
            }
        }
        lala.close();
    }
}
