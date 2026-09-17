package protocolo_colaborativo;

public class Coche {
    private String marca;
    private String modelo;
    static int contadorCoches = 0;//Atributo estatico de la clase

    public Coche(String marca, String modelo) {//Constructor parametrizado
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;//Incrementa el contador cada vez que se crea un objeto
    }

    public static void mostrarContador(){//Metodo para mostrar cuantos coches se han creado

        System.out.println("Total de coches creados: " + contadorCoches);
    }

    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "1985");
        Coche coche2 = new Coche("Renault", "2008");
        Coche coche3 = new Coche("BMW", "2025");

        mostrarContador();//Invocar el metodo

    }

}
