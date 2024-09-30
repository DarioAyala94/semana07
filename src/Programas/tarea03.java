
package Programas;
import java.util.Scanner;
public class tarea03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio;
        double sumaPrecios = 0;
        double precioMayor = Double.MIN_VALUE;
        double precioMenor = Double.MAX_VALUE;
        int productosCaros = 0; // Contador para productos cuyo precio es mayor que 50
        int contador = 0;
        String continuar;
        // Estructura repetitiva do-while para ingresar los precios
        do {
            System.out.print("Ingresa el precio del producto: ");
            precio = scanner.nextDouble();
            // Actualizamos las estadísticas
            sumaPrecios += precio;
            contador++;
            if (precio > precioMayor) {
                precioMayor = precio;
            }
            if (precio < precioMenor) {
                precioMenor = precio;
            }
            if (precio > 50) {
                productosCaros++;
            }
            // Preguntar si desea continuar ingresando más productos
            System.out.print("¿Quieres ingresar otro precio? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));  // Repite mientras el usuario diga "s"
        // Cálculo del promedio
        double promedioPrecios = sumaPrecios / contador;

        // Mostrar los resultados estadísticos
        System.out.println("\nResultados estadísticos:");
        System.out.println("Número total de productos: " + contador);
        System.out.println("Suma total de los precios: " + sumaPrecios);
        System.out.println("Promedio de los precios: " + promedioPrecios);
        System.out.println("Precio más alto: " + precioMayor);
        System.out.println("Precio más bajo: " + precioMenor);
        System.out.println("Número de productos con precio mayor a 50: " + productosCaros);
        scanner.close();
    }
}
