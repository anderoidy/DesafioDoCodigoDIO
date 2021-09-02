import java.util.Scanner;

public class DesafioMediaAluno {
    public static void main(String[] args) {
        double A, B;
        Scanner pegaDoUser = new Scanner(System.in);
        System.out.println("Entre com o primeiro valor");
        A = pegaDoUser.nextDouble();
        System.out.println("Entre com o segundo valor");
        B = pegaDoUser.nextDouble();

        //complete aqui com sua solução
         double media = ((3.5*A) + (7.5*B))/11;
        System.out.printf("MEDIA = %.5f%n", media);
    }
}
