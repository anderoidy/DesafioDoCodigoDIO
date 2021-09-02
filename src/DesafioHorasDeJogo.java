import java.util.Scanner;

public class DesafioHorasDeJogo {
    public static void main(String[] args) {
        //complete os espaços em branco com sua solução para o problema

        Scanner pegaDoUsuario = new Scanner(System.in);
        int inicio, fim, horas;
        System.out.println("Entre com a hora de inicio do jogo : ");
        inicio = pegaDoUsuario.nextInt();
        System.out.println("Entre com a hora do fim do jogo : ");
        fim = pegaDoUsuario.nextInt();
        horas =   fim - inicio;            ;

        if(horas == 0){
            System.out.print("O JOGO DUROU 24 HORA(S)\n");
        }else if(horas < 0){
            System.out.print("O JOGO DUROU " + (  horas   +24     ) + " HORA(S)\n");
        }else if(horas > 24){
            System.out.print("O JOGO DUROU " + (  horas          ) + " HORA(S)\n");
        }else{
            System.out.print("O JOGO DUROU " +  horas           + " HORA(S)\n");
        }

    }
}
