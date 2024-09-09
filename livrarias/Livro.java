import java.util.Scanner;

package livraria;
public class Livro {

private String titulo;
public int numeroPaginas;
private double preco;

public Livro(String titulo, int numeroPaginas, double preco){
    this.titulo = titulo;
    this.preco = preco;
}

    void cadastrar(){
        System.out.println("Cadastrando o livro");
    }

    double calfrete(String cep){
        double frete = 0;
        System.out.println("Calculando o Frete para o cep" + cep);
        return frete;
    }

}