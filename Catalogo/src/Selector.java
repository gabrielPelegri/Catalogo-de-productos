import java.net.SocketTimeoutException;
import java.util.InputMismatchException;
import java.util.Scanner;
import arbol.*;

public class Selector {
    public static void Lanzar(Scanner teclado) {
        int eleccion = 0;
        String nombre;
        int codigo;
        double precio;
        int unidades;

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
                case 1:
                    System.out.println("Introduce el nombre de la categoría: ");
                    catalogo.nuevaCategoria(teclado.next());
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la categoría: ");
                    nombre = teclado.next();
                    System.out.println("Introduce el código del producto: ");
                    while (true) {
                        try {
                            codigo = teclado.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Introduce un código válido");
                            teclado.next();
                        }
                    }
                    System.out.println("Introduce el precio del producto: ");
                    while (true) {
                        try {
                            precio = teclado.nextDouble();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Introduce un precio válido");
                            teclado.next();
                        }
                    }
                    System.out.println("Introduce las unidades del producto: ");
                    while (true) {
                        try {
                            unidades = teclado.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Introduce unas unidades válidas");
                            teclado.next();
                        }
                    }
                    catalogo.nuevoProducto(nombre, codigo, precio, unidades);
                    break;
                case 3:
                    System.out.println(catalogo.mostrarCategorias());
                    break;
                case 4:
                    System.out.println("Introduce el nombre de la categoría: ");
                    nombre = teclado.next();
                    System.out.println(catalogo.mostrarProductosdeCategoria(nombre));
                    break;
                case 5:
                    System.out.println("Introduce el nombre de la categoría: ");
                    nombre = teclado.next();
                    System.out.println("Introduce el código del producto: ");
                    while (true) {
                        try {
                            codigo = teclado.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Introduce un código válido");
                            teclado.next();
                        }
                    }
                    System.out.println("Introduce unidades a extraer: ");
                    while (true) {
                        try {
                            unidades = teclado.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Introduce unas unidades válidas");
                            teclado.next();
                        }
                    }
                    catalogo.extraerProducto(nombre, codigo, unidades);
                    break;
                case 6:
                    System.out.println(catalogo.listarProductosAgotados());
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
