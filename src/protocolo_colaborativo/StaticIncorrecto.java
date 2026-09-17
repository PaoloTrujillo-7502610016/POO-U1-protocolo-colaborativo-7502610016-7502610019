package protocolo_colaborativo;

public class StaticIncorrecto {

    String atributo;               //Codigo incorrecto
    //static String atributo;      //Codigo correcto

    public StaticIncorrecto() {//Constructor estandar
        atributo = "Soy el actual";
    }

    public static void cambiarAtributo(String nuevoAtributo){//Metodo estatico
        atributo = nuevoAtributo;
    }

    public static void main(String[] args) {
        StaticIncorrecto objeto1 = new StaticIncorrecto();//Instancia de la clase
        System.out.println(objeto1.atributo);

        cambiarAtributo("Soy el nuevo");//Se llama el metodo estatico
        System.out.println(objeto1.atributo);
    }

}
