package Ejercicios;

import java.util.Scanner;

public class EjercicioA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //introducimos las dos notas
        System.out.print("Introduce la primera nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Introduce la segunda nota: ");
        double nota2 = scanner.nextDouble();
        // Consumir el salto de línea pendiente
        scanner.nextLine(); 
        double media = (nota1 + nota2) / 2;
        //si la media es mayor o igual a 5 , mostramos la media
        if (media >= 5) {
            System.out.println("Tu nota de programación es: " + media);
        } else {
            //si es menor, preguntamos si ha recuperado el examen
            System.out.println("¿Cual ha sido la nota de recuperación?(Apto/No Apto) ");
            String recuperacion = scanner.nextLine();
            //si ha recuperado la nota, mostramos que tiene un 5 si ha suspendido le mostramos la nota de la media que tenia
            if (recuperacion.equalsIgnoreCase("Apto")) {
                System.out.println("Tu nota de programación es: 5.0");
            } else {
                System.out.println("Tu nota de programación es: " + media);
            }
        }
    }
}
