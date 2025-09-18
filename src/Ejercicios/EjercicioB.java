package Ejercicios;

import java.util.Scanner;

public class EjercicioB {
       public static void main(String[] args) {
              //creamos las variables que vamos a necesitar
              Scanner scanner = new Scanner(System.in);
              System.out.print("Introduce la base imponible: ");
              double baseImponible = scanner.nextDouble();
              scanner.nextLine(); // Consumir el salto de línea pendiente
              System.out.print("Introduce el tipo de IVA (normal, reducido, superreducido): ");
              String tipoIva = scanner.nextLine();
              System.out.print("Introduce el código promocional (nopro, mitad, meno5, 5porc): ");
              String codigoPromocional = scanner.nextLine();
              double totalIva = 0;
              double iva = 0;
              double total = 0;
              double descuento = 0;
              //calculamos el iva segun el tipo de iva
              if (tipoIva.equalsIgnoreCase("normal")) {
                     totalIva = baseImponible * 1.21;
                     iva = baseImponible * 0.21;
              } else if (tipoIva.equalsIgnoreCase("reducido")) {
                     totalIva = baseImponible * 1.10;
                     iva = baseImponible * 0.10;
              } else if (tipoIva.equalsIgnoreCase("superreducido")) {
                     totalIva = baseImponible * 1.04;
                     iva = baseImponible * 0.04;
              }
              //calculamos el el precio total(sabiendo el precio con el iva correcto) segun el codigo promocional
              if (codigoPromocional.equalsIgnoreCase("nopro")) {
                     total = totalIva;
              } else if (codigoPromocional.equalsIgnoreCase("mitad")) {
                     total = totalIva / 2;
                     descuento = -(totalIva / 2);
              } else if (codigoPromocional.equalsIgnoreCase("meno5")) {
                     total = totalIva - 5;
                     descuento = -5;
              } else if (codigoPromocional.equalsIgnoreCase("5porc")) {
                     total = totalIva * 0.95;
                     descuento = -(totalIva * 0.05);
              }
              //imprimimos los resultados
              System.out.println("Base imponible: " + baseImponible);
              System.out.println("IVA: " + iva);
              System.out.println("Precio con IVA: " + totalIva);
              System.out.println("Código promocional:(" + codigoPromocional + "): " + descuento);
              System.out.println("Total: " + total);

       }

}
