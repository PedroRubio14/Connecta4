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
        ESPACIO,
        NOMBRE
    }

    public static void mostrarTablero(Tablero t){
        char [][] tablero = t.getTablero();
        for (int i = 0; i < tablero.length; i++) {
            for (int y = 0; y < tablero[i].length; y++) {
                if(tablero[i][y]==0){
                    Textos.imprimir(Textos.Codigo.CASILLA_VACIA);
                }else {
                    Integer j = (Integer) i;
                    Integer x = (Integer) y;
                    Textos.imprimir(Textos.Codigo.CASILLA,t, j, x);
                }
            }
            Textos.imprimir(Textos.Codigo.ESPACIO);
        }
        for(int i = 0;i<tablero[0].length;i++){
            System.out.print(" "+i+" ");
        }
        Textos.imprimir(Textos.Codigo.ESPACIO);
        Textos.imprimir(Textos.Codigo.ESPACIO);
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

            case NOMBRE:
                if (args.length > 0 && args[0] instanceof Jugador j){
                    System.out.println("Nombre del jugador"+j.getMiFicha()+"?");
                }
            case ESPACIO:
                System.out.println();
                break;
        }

    }

}
