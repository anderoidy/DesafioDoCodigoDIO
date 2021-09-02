import java.util.Scanner;

public class DesafioSoma {
    public static void main(String[] args) {

        Scanner pegaDoUsuario = new Scanner(System.in);

        int A, B, soma;

        System.out.println("Entre com o primeiro valor : ");
        A = pegaDoUsuario.nextInt();
        System.out.println("Entre com o segundo valor : ");
        B = pegaDoUsuario.nextInt();

        soma = A + B; //insira as variaveis corretamente

        System.out.println("SOMA = " +soma);

        pegaDoUsuario.close();
    }
}
