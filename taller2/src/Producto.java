public class Producto {
    String nombre;
    double precio;

    public Producto( String nombre, double precio){
        this.nombre= nombre;
        this.precio =precio;
    }

    public void mostrarProducto(){
        System.out.println("el nombre del producto es: "+nombre);
        System.out.println("el precio es: "+precio);
    }
}