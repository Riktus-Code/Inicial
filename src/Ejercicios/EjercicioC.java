package Ejercicios;

import java.util.Scanner;

public class EjercicioC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        int contImpar = 0;
        double media = 0;
        int suma = 0;
        int mayor = Integer.MIN_VALUE;
        System.out.print("Introduce un  número (-1 para terminar): ");
        int numero = scanner.nextInt();
        if (numero >= 0) {
            cont++;
        }

        while (numero >= 0) {
            System.out.print("Introduce un  número (-1 para terminar): ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                cont++;
            }
            if (numero % 2 != 0) {
                suma += numero;
                contImpar++;
            } else {
                if (numero > mayor) {
                    mayor = numero;
                }

            }
        }
        System.out.println("Has introducido " + cont + " números.");
        System.out.println("Media de los impares: " + (suma / contImpar));
        System.out.println("El mayor de los pares es: " + mayor);
    }
}
