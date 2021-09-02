import java.util.Scanner;

public class DesafioFatorial {
    public static void main(String[] args) {
        Scanner pegaDoUsuario = new Scanner(System.in);

        System.out.println("Entre com o numero para ver o fatorial dele ");
        int fatorial = 1;
        int numero = pegaDoUsuario.nextInt();

        for (int i=numero; i>=1; i--) {
            fatorial  = fatorial * i;
        }
        System.out.println("Fatorial de "+ numero+ " = " +fatorial);
    }
}
