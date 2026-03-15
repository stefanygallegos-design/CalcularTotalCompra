import java.util.Scanner;

/**
 * Clase principal que simula una tienda para calcular el total de una compra.
 */
public class Tienda {

    /**
     * Método que calcula el total multiplicando el precio por la cantidad.
     * 
     * @param precio   Precio unitario del producto (puede tener decimales).
     * @param cantidad Cantidad de unidades que se compran (número entero).
     * @return El total de la compra como valor double.
     */
    public static double calcularTotal(double precio, int cantidad) {
        // Realiza la operación y retorna el resultado directamente
        return precio * cantidad;
    }

    /**
     * Método principal que ejecuta el programa.
     * Pide al usuario los datos, llama al método y muestra el resultado.
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        // Solicitar la cantidad
        System.out.print("Ingrese la cantidad de unidades: ");
        int cantidad = scanner.nextInt();

        // Llamar al método calcularTotal y guardar el resultado
        double total = calcularTotal(precio, cantidad);

        // Mostrar el resultado en consola
        System.out.printf("El total de la compra es: $%.2f%n", total);

        // Cerrar el scanner
        scanner.close();
    }
}