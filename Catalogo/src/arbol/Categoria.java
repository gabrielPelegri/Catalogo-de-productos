package arbol;

import java.util.ArrayList;

public class Categoria {
    public String dato; // dato que se guarda en el nodo
    public Categoria izq; // referencia al nodo izquierdo
    public Categoria der; // referencia al nodo derecho
    ArrayList<Producto> productos;

    // constructor
    public Categoria(String info) {
        // Tambien se puede llamar como
        // this(info, null, null);
        dato = info;
        izq = null;
        productos = new ArrayList<Producto>();
        der = null;
    }

    public Categoria(String info, Categoria hijoIzq, Categoria hijoDer) {
        dato = info;
        izq = hijoIzq;
        der = hijoDer;
        productos = new ArrayList<Producto>();
    }
}