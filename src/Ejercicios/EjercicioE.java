package Ejercicios;

import java.util.Scanner;

public class EjercicioE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce La altura: ");
        int altura = scanner.nextInt();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura-1-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i+1; k++) {
                System.out.print("*");
            }
            if(i%2==0){
                System.out.print("****");
            }else{
                System.out.print("    ");
            }
            for (int k = 0; k < i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
