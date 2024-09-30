
package Programas;
import java.util.Scanner;
public class tareas02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        int sumaEdades = 0;
        int mayorEdad = Integer.MIN_VALUE;
        int menorEdad = Integer.MAX_VALUE;
        int mayoresDeEdad = 0;
        int contador = 0;
        String continuar;
        // Estructura repetitiva do-while para ingresar las edades
        do {
            System.out.print("Ingresa la edad de una persona: ");
            edad = scanner.nextInt();
            // Actualizamos las estadísticas
            sumaEdades += edad;
            contador++;
            if (edad > mayorEdad) {
                mayorEdad = edad;
            }
            if (edad < menorEdad) {
                menorEdad = edad;
            }
            if (edad >= 18) {
                mayoresDeEdad++;
            }
            // Preguntar si desea continuar ingresando más datos
            System.out.print("¿Quieres ingresar otra edad? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));  // Repite mientras el usuario diga "s"
        // Cálculo del promedio
        double promedioEdades = (double) sumaEdades / contador;
        // Mostrar los resultados estadísticos
        System.out.println("\nResultados estadísticos:");
        System.out.println("Número total de personas: " + contador);
        System.out.println("Suma de las edades: " + sumaEdades);
        System.out.println("Promedio de edades: " + promedioEdades);
        System.out.println("Mayor edad: " + mayorEdad);
        System.out.println("Menor edad: " + menorEdad);
        System.out.println("Número de personas mayores de edad: " + mayoresDeEdad);
        scanner.close();
    }
}
