
package Entidades;

/**
 *
 * @author Grupo3
 */
public class Producto implements Comparable<Producto>{
    private int codigo;
    private  String nombre;
    private Categoria categoria;
    private double precio;
    private int stock;

    public Producto(int codigo, String nombre, Categoria categoria, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + ", stock=" + stock + '}';
    }

    @Override
    public int compareTo(Producto cod) {
       if(codigo == cod.codigo){
           return 0;
       }else if(codigo > cod.codigo){
           return 1;
       }else{
           return -1;
       }
    }
}
