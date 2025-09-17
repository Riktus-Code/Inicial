package Ejercicios;

import java.util.Scanner;

public class EjercicioA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la primera nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Introduce la segunda nota: ");
        double nota2 = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea pendiente
        double media = (nota1 + nota2) / 2;
        if (media >= 5) {
            System.out.println("Tu nota de programación es: " + media);
        } else {
            System.out.println("¿Cual ha sido la nota de recuperación?(Apto/No Apto) ");
            String recuperacion = scanner.nextLine();
            if (recuperacion.equalsIgnoreCase("Apto")) {
                System.out.println("Tu nota de programación es: 5.0");
            } else {
                System.out.println("Tu nota de programación es: " + media);
            }
        }
    }
}
