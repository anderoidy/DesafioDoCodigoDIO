import java.io.IOException;
import java.util.Scanner;

public class DesafioAtrasoPraFeira {
    public static void main(String[] args) throws IOException {

        Scanner pegandoDosuario = new Scanner(System.in);

        System.out.println("Entre com a hora que o Bino acordou: ");
        while ( pegandoDosuario.hasNext()) {
            String[] relogio = pegandoDosuario.nextLine().split(":");
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);
            switch (hora) {
                case(7): System.out.println("Atraso maximo: " + min); break;
                case(8): System.out.println("Atraso maximo: " + (60 + min));
                case(9): System.out.println("Atraso maximo: " + (120 + min));
                default: System.out.println("Atraso maximo: 0");
            }
        }
    }
}
