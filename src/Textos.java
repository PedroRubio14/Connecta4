import java. util. Scanner;

public class Textos {

    static Scanner sc = new Scanner(System.in);

    public static int llegirInt (){
        return sc.nextInt();
    }

    public static String llegirString() {
        return sc.nextLine();
    }

    public static void imprimir (String texto){
        switch (texto.toLowerCase()){
            case "partida_finalizada":
                System.out.print("La partida ha finalizado");
                break;

            case "empate":
                System.out.println("EMPATE!!");
                break;


        }

    }

    public static void imprimir (String texto, Jugador j){
        switch (texto.toLowerCase()){
            case "gana":
                System.out.println("HA GANADO "+j.getNombre()+"!!");
                break;
        }
    }

}
