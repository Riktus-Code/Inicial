package Ejercicios;

import java.util.Scanner;

public class EjercicioC {
    public static void main(String[] args) {
        //creamos las variables que vamos a necesitar
        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        int contImpar = 0;
        double media = 0;
        int suma = 0;
        int mayor = Integer.MIN_VALUE;
        //pedimos numero
        System.out.print("Introduce un  número (-1 para terminar): ");
        int numero = scanner.nextInt();
        if (numero >= 0) {
            cont++;
        }
        //mientras que sea positivo seguimos pidiendo numeros
        while (numero >= 0) {
            System.out.print("Introduce un  número (-1 para terminar): ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                cont++;
            }
            //si es impar sumamos los numeros y contamos cuantos impares son, para hacer la media más tarde
            if (numero % 2 != 0) {
                suma += numero;
                contImpar++;
            } else {
                //si es par comprobamos los nuemros para saber cual es el mayor
                //ya que a mayor le dimos el valor minimmo, para saber que nuemro es el mayor de todos
                if (numero > mayor) {
                    mayor = numero;
                }

            }
        }
        //imprimimos los resultados
        System.out.println("Has introducido " + cont + " números.");
        System.out.println("Media de los impares: " + (suma / contImpar));
        System.out.println("El mayor de los pares es: " + mayor);
    }
}
