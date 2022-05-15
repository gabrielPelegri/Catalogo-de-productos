package arbol;

public class Producto {
    int codigo;
    String descripcion;
    double precio;
    int unidades;
    public Producto(){
        codigo = 0;
        descripcion = " ";
        precio = 0;
        unidades = 0;
    }
    public Producto(int codigo, String descripcion, double precio, int unidades) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.unidades = unidades;
    }
}
