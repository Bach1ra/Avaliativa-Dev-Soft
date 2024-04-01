package ListaAva.Ex1;
import java.util.Scanner;

public class Calculadora {

    public static void calculo(int opcao, float n1, float n2)
    {

            switch(opcao)
            {
                case 1: 
                    System.out.println("O resultado da soma entre os numeros é de: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("A subtração dos números é de: " + (n1 - n2));
                    break;
                case 3: 
                    System.out.println("A multiplicação entre os números é de: " + (n1 * n2));
                    break;
                case 4:
                    if(n2 == 0){
                        System.out.println("Não tem como dividir por 0 :D");
                        break;
                    }
                    System.out.println("A divisão entre os números é de: " + (n1 / n2));
                        break;

                    default: 
                        System.out.println("Opcao invalida");
            }
    }


    public static void operacao(){

        Scanner lala = new Scanner(System.in);

        System.out.println("***************************************");
        System.out.println("Informe a operação que deseja fazer: ");
        System.out.println("[1] Adição");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");
        System.out.print("~");
        int opcao = Integer.parseInt(lala.nextLine());

        if(opcao > 4 || opcao < 1){
            System.out.println("Opcao invalida");
            lala.close();
            System.exit(0); 
        }
        if(opcao == 1){
            System.out.println("Operação escolhida: Adição\n");
        }else if(opcao == 2){
            System.out.println("Operação escolhida: Subtração\n");
        }else if(opcao == 3){
            System.out.println("Operação escolhida: Multiplicação\n");
        }else{
            System.out.println("Operação escolhida: Divisão\n");
        }
        System.out.print("Informe o primeiro valor: ");
        float n1 = lala.nextFloat();

        System.out.print("Informe o segundo valor: ");
        float n2 = lala.nextFloat();
        lala.nextLine();

        calculo(opcao, n1, n2);

        
    }
}
