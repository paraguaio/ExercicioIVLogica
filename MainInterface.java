package exercicioivlogica;

import java.util.Scanner;
        
public class MainInterface 
{

    public static void main(String[] args)
{
        
    Scanner ler = new Scanner(System.in);
    
    Cliente c1 = new Cliente();
    Livro l1 = new Livro();
    
    System.out.println("Digite o seu nome: ");
    c1.nome = ler.nextLine();
    
    System.out.println("Digite o título do livro desejado: ");
    l1.livro = ler.nextLine();
        
    System.out.println("Qual o gênero de livro desejado? ");
    l1.setGenero(ler.nextLine());
    
    System.out.println("Qual a faixa de preço do livro? ");
    c1.setPreco(ler.nextInt());
    
    System.out.println("Unindo os dados... ");   
    System.out.println("Nome: " + c1.nome);
    System.out.println("Livro: " + l1.livro);
    System.out.println("Gênero: " + l1.getGenero());
    System.out.println("Preço: " + c1.getPreco());
    
    if( c1.getPreco() >= 25  ) 
        {
            System.out.println("Disponível para compra! ");
        }
    else if ( c1.getPreco() < 25  ) 
        {
            System.out.println("Disponível apenas para locação. ");
        }
    
}
