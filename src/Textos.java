import java. util. Scanner;

public class Textos {

    static Scanner sc = new Scanner(System.in);

    public static int llegirInt (){
        return sc.nextInt();
    }

    public static String llegirString() {
        return sc.nextLine();
    }

    public enum Codigo {
        PARTIDA_FINALIZADA,
        EMPATE,
        COLUMNA_LLENA,
        CASILLA_VACIA,
        GANA,
        COLOCAR_FICHA,
        COLUMNA_NO_VALIDA,
        CASILLA,
        ESPACIO
    }


    public static void imprimir (Codigo codigo, Object...args){
        switch (codigo){
            case PARTIDA_FINALIZADA:
                System.out.print("La partida ha finalizado");
                break;

            case EMPATE:
                System.out.println("EMPATE!!");
                break;

            case COLUMNA_LLENA:
                System.out.print("ESTA COLUMNA ESTA LLENA");
                System.out.println();
                break;
            case CASILLA_VACIA:
                System.out.print("[ ]");
                break;
            case GANA:
                if (args.length > 0 && args[0] instanceof Jugador j) {
                    System.out.println("HA GANADO " + j.getNombre() + "!!");
                }
                break;
            case COLOCAR_FICHA:
                if (args.length > 0 && args[0] instanceof Jugador j) {
                    System.out.println("Donde quieres colocar tu ficha " + j.getNombre() + " ?");
                }
                break;
            case COLUMNA_NO_VALIDA:
                if (args.length > 0 && args[0] instanceof Tablero t){
                System.out.println("Error: La columna no es válida. Elige una entre 0 y " + (t.getTablero()[0].length - 1));
                }
                break;
            case CASILLA:
                if (args.length > 2 && args[0] instanceof Tablero
                    && args[1] instanceof Integer && args[2] instanceof Integer) {
                    Tablero t = (Tablero) args[0];
                    char[][] tablero = t.getTablero();
                    int i = (Integer) args[1];
                    int y = (Integer) args[2];
                    System.out.print("[" + tablero[i][y] + "]");
                }
                break;
            case ESPACIO:
                System.out.println();
                break;
        }

    }

}
