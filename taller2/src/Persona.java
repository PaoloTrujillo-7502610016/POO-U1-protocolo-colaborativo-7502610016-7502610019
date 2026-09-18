public class Persona {
    String nombre;

    /*
    public static void mostraThis(String nombre){
        this.nombre= nombre;

    }
    this representa al objeto actual.
    No se puede usar this dentro de un método static,
    porque static pertenece a la clase y no a un objeto específico.
    */

    public void mostraThis(String nombre){
        this.nombre= nombre;
    }

}
