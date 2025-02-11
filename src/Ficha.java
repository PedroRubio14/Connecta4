import java. util. Scanner;
public class Ficha {
    static Scanner sc = new Scanner(System.in);

    public static void colocarFicha(Jugador jugador, Tablero tablero){

        boolean fichaPuesta = false;
        int columna;

        do {
            System.out.println("Donde quieres colocar tu ficha "+jugador.getNombre()+" ?");
            columna = sc.nextInt();
            sc.nextLine();
            if (columna < 0 || columna >= tablero.getTablero()[0].length){
                System.out.println("Error: La columna no es válida. Elige una entre 0 y " + (tablero.getTablero()[0].length - 1));

            }else {
                Ficha f = new Ficha();

                int fila = encontrarFilaDisponible(columna, tablero);
                if (fila == -1){
                    System.out.print("ESTA COLUMNA ESTA LLENA");
                    System.out.println();
                }
                else {
                    tablero.getTablero()[fila][columna] = jugador.getMiFicha();
                    tablero.setTablero(tablero);
                    fichaPuesta = true;
                }



            }
        }while (!fichaPuesta);



    }

    private static int encontrarFilaDisponible(int columna, Tablero tablero){
        for(int i = tablero.getTablero().length-1;i>=0;i--){
            if(tablero.getTablero()[i][columna]==0){
                return i;
            }

        }
        return -1;
    }


}
