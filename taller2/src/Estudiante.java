public class Estudiante {
    String nombre;
    int edad;

    public Estudiante ( String nombre, int edad){
        this.nombre = nombre;
        this.edad= edad;

    }
    public  Estudiante(){
        this ("luci",23);
    }

    public void mostrarEstudiante(){
        System.out.println("el nombre del estudiante: "+ nombre);
        System.out.println(" la edad es: "+ edad);
    }
}
