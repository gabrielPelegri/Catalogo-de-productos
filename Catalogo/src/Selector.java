import java.net.SocketTimeoutException;
import java.util.InputMismatchException;
import java.util.Scanner;
import arbol.*;

public class Selector {
    public static void Lanzar(Scanner teclado) {
        int eleccion = 0;
        Catalogo catalogo = new Catalogo();
        while (true) {
            System.out.println("Elije una opción: ");
            System.out.println("1: Añadir nueva categoría");
            System.out.println("2: Añadir nuevo producto");
            System.out.println("3: Mostrar lista de categorías");
            System.out.println("4: Mostrar lista de productos");
            System.out.println("5: Extraer producto");
            System.out.println("6: Listar productos agotados");
            System.out.println("7: Salir");
            try {
                eleccion = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Introduce una opción válida");
                teclado.next();
            }
            switch (eleccion) {
                case 1: catalogo.nuevaCategoria(nombre(teclado));
                    break;
                case 2:// Añadir nuevo producto
                    break;
                case 3:// Mostrar lista de categorías
                    break;
                case 4:// Mostrar lista de productos
                    break;
                case 5:// Extraer producto
                    break;
                case 6:// Listar productos agotados
                    break;
                case 7: // Salir
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
