import java.util.Scanner;

package livraria;
public class Livro {
    String titulo;
    Int numeroPaginas;
    double preco;


    void cadastrar(){
        System.out.println("Cadastrando o livro");
    }

    double calfrete(String cep){
        double frete = 0;
        System.out.println("Calculando o Frete para o cep" + cep);
        return frete;
    }

}