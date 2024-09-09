import java.util.Scanner;

public class Livraria {
    public static void main(String[] args) {

        Livro livro2 = new Livro("Harry Portter, A Câmara Secreta", 224, 49.99);
        livro2.cadastrar();

        Livro livro3 = new Livro("A Menina do Outro Lado VOL 1", 173, 64.99);
        livro3.cadastrar();

        Livro livro4 = new Livro("Caçadas de Vida e de Morte", 400, 64.99);
        livro4.cadastrar();
    }
}