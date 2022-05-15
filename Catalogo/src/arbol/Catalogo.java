package arbol;

public class Catalogo {
    Categoria raiz;

    public Catalogo() {
        raiz = null;
    }

    public Catalogo(Categoria categoria) {
        this.raiz = categoria;
    }

    public boolean esVacio() {
        return raiz == null;
    }

    public Categoria raiz() throws Exception { // si el árbol está vacío
        if (esVacio())
            throw new Exception("raiz: árbol vacío");
        return raiz;
    }

    public Catalogo hijoIzq() throws Exception { // si el árbol está vacío
        if (esVacio()) {
            throw new Exception("Error en hijoIzq: árbol vacío");

        }
        return new Catalogo(raiz.izq);
    }

    public Catalogo hijoDer() throws Exception { // si el árbol está vacío
        if (esVacio()) {
            throw new Exception("Error en hijoIzq: árbol vacío");

        }
        return new Catalogo(raiz.der);
    }

    public void nuevaCategoria(String nombre) {
        Categoria nueva = new Categoria(nombre);
        if (raiz == null) {
            raiz = nueva;
        } else {
            Categoria aux = raiz;
            while (aux != null) {
                if (aux.dato.compareTo(nombre) > 0) {
                    if (aux.izq == null) {
                        aux.izq = nueva;
                        break;
                    } else {
                        aux = aux.izq;
                    }
                } else {
                    if (aux.der == null) {
                        aux.der = nueva;
                        break;
                    } else {
                        aux = aux.der;
                    }
                }
            }
        }
    }

    public void nuevoProducto(String nombre, int codigo, double precio, int unidades) {
        Categoria aux = raiz;
        while (aux != null) {
            if (aux.dato.compareTo(nombre) == 0) {
                aux.productos.add(new Producto(codigo, nombre, precio, unidades));
                break;
            } else {
                if (aux.dato.compareTo(nombre) > 0) {
                    aux = aux.izq;
                } else {
                    aux = aux.der;
                }
            }
        }
    }

    public String mostrarCategorias() {
        String resultado = "";
        Categoria aux = raiz;
        while (aux != null) {
            resultado += aux.dato + " ";
            aux = aux.der;
        }
        return resultado;
    }

    public String mostrarProductosdeCategoria(String nombre) {
        String resultado = "";
        Categoria aux = raiz;
        while (aux != null) {
            if (aux.dato.compareTo(nombre) == 0) {
                for (int i = 0; i < aux.productos.size(); i++) {
                    resultado += aux.productos.get(i).codigo + " " + aux.productos.get(i).descripcion + " "
                            + aux.productos.get(i).precio + " " + aux.productos.get(i).unidades + "\n";
                }
                break;
            } else {
                if (aux.dato.compareTo(nombre) > 0) {
                    aux = aux.izq;
                } else {
                    aux = aux.der;
                }
            }
        }
        return resultado;
    }

    public void extraerProducto(String nombre, int codigo, int cantidad) {
        Categoria aux = raiz;
        while (aux != null) {
            if (aux.dato.compareTo(nombre) == 0) {
                for (int i = 0; i < aux.productos.size(); i++) {
                    if (aux.productos.get(i).codigo == codigo) {
                        aux.productos.get(i).unidades -= cantidad;
                        break;
                    }
                }
                break;
            } else {
                if (aux.dato.compareTo(nombre) > 0) {
                    aux = aux.izq;
                } else {
                    aux = aux.der;
                }
            }
        }
    }

    public String listarProductosAgotados() {
        String resultado = "";
        Categoria aux = raiz;
        while (aux != null) {
            for (int i = 0; i < aux.productos.size(); i++) {
                if (aux.productos.get(i).unidades == 0) {
                    resultado += aux.productos.get(i).codigo + " " + aux.productos.get(i).descripcion + " "
                            + aux.productos.get(i).precio + " " + aux.productos.get(i).unidades + "\n";
                }
            }
            aux = aux.der;
        }
        return resultado;

    }

}
