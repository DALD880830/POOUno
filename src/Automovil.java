public class Automovil {

    String fabricante; //Atributo de la clase //Si no lleva private, por defecto es public
    String modelo;
    String color = "rojo"; //Definimos un valor por feceto para todos los objetos Automovil
    double cilindrada; //Los atributos se esciben en minusculas y las clases en mayusculas
    int capacidadTanque = 40; //Para determinar el rendimiento en el metodo de calcularConsumo, se requiere de asignar esta variable

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

    public String verDetalle(){ //Este metodo retorna un String
        //En ves de imprimir los datos, los concatenamos y los retornamos como un String
        return "auto.fabricante = " + this.fabricante + //AString concatenado
                "\nauto.modelo = " + this.modelo +
                "\nauto.color = " + this.color +
                "\nauto.cilindrada = " + this.cilindrada;
        }

    /*public String detalle(){ //Este metodo retorna un String
        StringBuilder sb = new StringBuilder(); //StringBuilder se usa para concatenar una gran cantidad de
        //cadenas, por lo cual, el mismo IDE nos dará la sugerencia de concatenarlo con +
        //En ves de imprimir los datos, los concatenamos y los retornamos como un String
        sb.append("auto.fabricante = " + this.fabricante); //Anexa este elemento al String
        sb.append("\nauto.modelo = " + this.modelo); //Anexa este elemento al String anterior
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.cilindrada = " + this.cilindrada);
        return sb.toString(); //sb lo convertimos a String
    }*/

    //Metodo para acelerar

    public String acelerar(int rpm){ //rpm es un argumento que pasamos //De igual forma es una variable del metodo
        return "el auto " + fabricante + " acelera a " + rpm + "rpm";
    }

    //Metodo para frenar

    public String frenar() {
        return this.fabricante + " " + modelo + " esta frenando"; //Usamos los atributos de la clase, pueden llevar o no this.
    }
    //Metodo acelerar/frenar

    public String acelerarFrenar(int rpm) { //Pasamos el argumento rpm
        String acelerar = this.acelerar(rpm); //Invocamos el metodo acelerar //this. tambien se utiliza para referirnos a metodos de la clase
        String frenar = this.frenar(); //Invocamos el metodo frenar
        return acelerar + "\n" + frenar; //Retornamos la combinacion de los metodos, concatenamos las variables
    }

    public float calcularConsumo(int km, float porcentajeGasolina){ //Metodo para calcular el rendimiento
        //de kilometros por litro //Por argumento recibe un entero que son los km y un decimal que es el porcentaje
        return km/(capacidadTanque*porcentajeGasolina); //multiplica el porcentaje de 0 a 1 en decimal por 40 que es la
        //capacidad del tanque, despues realiza la division de los km que se den entre el resultado de la multiplicacion
    }

    public float calcularConsumo(int km, int porcentajeGasolina){ //Se pueden tener dos metodos con el mismo nombre
        //solo con cambiar el tipo de argumentos que recibe, a esto se le llama sobrecarga de metodos
        return km/(capacidadTanque*(porcentajeGasolina/100f)); //Para que retorne el float, se debe dividir el int de porcentaje
        //entre 100 y colocar que este 100 es un float
    }

}