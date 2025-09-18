package Ejercicios;

import java.util.Scanner;

public class EjercicioF {
    public static void main(String[] args) {
        String [][] tablero = new String[8][8];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la posición del alfil: ");
        String posicion  = sc.nextLine().toLowerCase();
        //obtenemos en numeros la posicion del alfil
        int columna = posicion.charAt(0) - 'a';
        int fila = 8 - Character.getNumericValue(posicion.charAt(1));

        //ahora rellenamos el tablero
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = ""+(char)('a'+j) + (8-i);

            }

        }

        //movimentos del alfil (movimientos diagonales  )
        int [] dx = {-1,-1,1,1};
        int [] dy = {-1,1,-1,1};
        System.out.println("El alfil puede moverser a las siguientes casillas: ");
        //pocibles movimientos del alfil
        //recorremos las cuatro direcciones en las que puede ir el alfil(segun la posicion inicial)
        for (int i = 0; i < 4; i++) {
            int x = fila + dx[i];
            int y = columna + dy[i];
            while(x>=0 && x<8 && y>=0 && y<8){
                //impimimos los pobibles movimientos del alfil
                System.out.print(tablero[x][y]+" ");
                x+=dx[i];
                y+=dy[i];
            }
        }
    }
}
