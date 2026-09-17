package protocolo_colaborativo;

public class Matematicas {

    public static int suma(int numero1, int numero2){
        return numero1+numero2;
    }

    public static int resta(int numero1, int numero2){
        return numero1-numero2;
    }

    public static int multiplicacion(int numero1, int numero2){
        return numero1*numero2;
    }

    public static double division(double numero1, double numero2){
        return numero1 / numero2;
    }

    public static void main(String[] args) {//Clase de prueba para llamar los metodos y mostrar los resultados:
        System.out.println("Suma :"+suma(3,5));
        System.out.println("Resta :"+resta(4,5));
        System.out.println("Multiplicaion :"+multiplicacion(5,5));
        System.out.println("Division :"+division(10,5));
    }

}
