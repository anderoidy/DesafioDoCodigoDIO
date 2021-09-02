import java.util.Scanner;

public class DesafioDivisoresDeN {
    public static void main(String[] args) {

        System.out.println("Entre com o valor pra ver os divisores ");
        Scanner pegaDousuario = new Scanner(System.in);

        int n;
        n = pegaDousuario.nextInt();
        System.out.println(" saida dos dados ");
        for (int i=1; i<=n;i++){
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println( );
    }
}
