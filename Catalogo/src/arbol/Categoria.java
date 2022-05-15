package arbol;

import java.util.ArrayList;

public class Categoria {
    public String dato;
    public Categoria izq;
    public Categoria der;
    ArrayList<Producto> productos;

    public Categoria(String info) {

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