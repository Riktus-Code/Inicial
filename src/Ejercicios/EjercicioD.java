package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        System.out.println("Introduce un digito: ");
        int digito = scanner.nextInt();

        String numeroString = Integer.toString(numero);
        String digitoString = Integer.toString(digito);
        List <Integer> posiciones = new ArrayList<>();

        for (int i = 0; i < numeroString.length(); i++) {
            if (numeroString.charAt(i) == digitoString.charAt(0)) {
                posiciones.add((i + 1));
            }
        }   

        System.out.println("posiciones: " + posiciones);

    }
}
