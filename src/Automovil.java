public class Automovil {

    String fabricante; //Atributo de la clase //Si no lleva private, por defecto es public
    String modelo;
    String color = "rojo"; //Definimos un valor por feceto para todos los objetos Automovil
    double cilindrada; //Los atributos se esciben en minusculas y las clases en mayusculas

    //Metodos o funciones del objeto
    /*
    public void detalle(){ //Como buena practica no es bueno imprimir con el método
        //El metodo se debe usar para procesos o tareas
        System.out.println("auto.fabricante = " + this.fabricante); //Cuando estamos dentro de la misma clase, la
        System.out.println("auto.modelo = " + this.modelo);         //instancia toma el nombre de this
        System.out.println("auto.color = " + this.color);           //this se refiere a si mismo dentro de la clase
        System.out.println("auto.cilindrada = " + this.cilindrada); //aunque tambien puede omitirse, pero es mejor colocarlo
    }
    */
    public String detalle(){ //Este metodo retorna un String
        StringBuilder sb = new StringBuilder(); //StringBuilder se usa para concatenar
        //En ves de imprimir los datos, los concatenamos y los retornamos como un String
        sb.append("auto.fabricante = " + this.fabricante); //Anexa este elemento al String
        sb.append("\nauto.modelo = " + this.modelo); //Anexa este elemento al String anterior
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.cilindrada = " + this.cilindrada);
        return sb.toString(); //sb lo convertimos a String
    }

}