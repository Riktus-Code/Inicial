package Ejercicios;

import java.util.Scanner;

public class EjercicioE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce La altura: ");
        int altura = scanner.nextInt();
        //el primer for, que anida a los demas, se encarga del numero de filas
        for (int i = 0; i < altura; i++) {
            //el segundo for se encarga de los espacios en blanco para que el prmier triangulo se alinee a la derecha
            for (int j = 0; j < altura-1-i; j++) {
                System.out.print(" ");
            }
            //pintamos la piramide
            for (int k = 0; k < i+1; k++) {
                System.out.print("*");
            }
            //cuando es par pintamos 4 asteriscpos y cuando es impar 4 espacios en blanco
            if(i%2==0){
                System.out.print("****");
            }else{
                System.out.print("    ");
            }
            //pintamos una piramide al final alineada la izquierda
            for (int k = 0; k < i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
