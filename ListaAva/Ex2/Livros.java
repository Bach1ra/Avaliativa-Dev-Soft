package ListaAva.Ex2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Livros {

    static List<Livros> listaLivros = new ArrayList<>();//lista para os objetos(struct);

    static Scanner lala = new Scanner(System.in);
    static String titulo;
    static String autor;
    static int ano;

    public Livros(String titulo2, String autor2, int ano2)//Cosntrutor;
    {
        titulo = titulo2;
        autor = autor2;
        ano = ano2;    
    }

    public static void Cadastro()
    {

        System.out.print("Informe o titulo do livro: ");
        String titulo = lala.nextLine();

        System.out.print("Informe o nome do autor: ");
        String autor = lala.nextLine();

        System.out.print("Informe o ano do livro: ");
        int ano = lala.nextInt();
        lala.nextLine();

        Livros livro = new Livros(titulo, autor, ano);

        listaLivros.add(livro);

    }   

    public static void exibirInfo()
    {
        for(int i = 0;i < listaLivros.size(); i++){
            System.out.println("Titulo: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Ano: " + ano);
        }

    }
    
}
