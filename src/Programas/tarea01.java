
package Programas;
import java.util.Scanner;
public class tarea01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        double suma = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double numero;
        String continuar;
        // Estructura repetitiva do-while para ingresar los datos
        do {
            System.out.print("Ingresa un número (calificación/puntuación): ");
            numero = scanner.nextDouble();    
            // Actualizamos las estadísticas
            suma += numero;
            contador++;   
            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }
            // Preguntar si desea continuar ingresando más datos
            System.out.print("¿Quieres ingresar otro número? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));  // Repite mientras el usuario diga "s"
        // Cálculo del promedio
        double promedio = suma / contador;
        // Mostrar los resultados estadísticos
        System.out.println("\nResultados estadísticos:");
        System.out.println("Cantidad de números ingresados: " + contador);
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
        scanner.close();
    }
}
