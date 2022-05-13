public class EjemploAutomovil {

    public static void main(String[] args) {

        //Automovil ford = new Automovil(); //Creamos el nuevo objeto Automovil
        /*
        ford.fabricante = "Ford"; //Los valores se pueden modificar desde aquí
        ford.modelo = "Mustang"; //Asignamos los datos
        ford.cilindrada = 2.0;
        ford.color = "azul"; //A pesar de que el color ya estaba definido, si lo definimos aquí, se modifica el valor
        */
        //Accedemos a los atributos mediante metodos
        /*
        ford.setFabricante("Ford");
        ford.setModelo("Mustang");
        ford.setCilindrada(2.0);
        ford.setColor("azul");
        */


        //Al crear un constructor de manera explicita, como no esta vacio, marca error en los argumentos que definimos en
        //el constructor, por cosiguiente, esos setter, deben pasarse por argumento para evitar los errores
        Motor motorFord = new Motor(2.0, TipoMotor.GASOLINA); //Creamos el objeto Motor, el cual recibe la cilindrada y el TipoMotor
        Tanque tanqueFord = new Tanque(); //Creamos el objeto tanqueFord, no lleva nada como argumento porque por default es 40, sin embargo, si se puede modificar
        Automovil ford = new Automovil("Ford", "Mustang"); //Insertamos fabricante y mustang usando
        // el nuevo constructor, los constructores solo se pueden invocar con el new

        ford.setMotor(motorFord); //Pasamos por argumento al set el objeto motorFord, que contiene la cilindrada
        ford.setTanque(tanqueFord); //Asignamos a setTanque el objeto creado tanqueFord

        //Al cambiar el atributo cilindrada a una relacion con una clase, se debe cambiar por lo de la clase
        //ford.setCilindrada(2.0); //Cilidrada y color deben seguirse insertando de esta forma, ya que no estan definidos en
        //ford.setColor("azul"); //el constructor que realizamos de manera explicita

        ford.setColor(Color.AZUL); //Cambiamos el String que habia por el atributo del enumerador con Colo.AZUL



        //Automovil nissan = new Automovil();
        /*
        nissan.fabricante = "Nissan"; //Los valores se pueden modificar desde aquí
        nissan.modelo = "Tsuru"; //Asignamos los datos
        nissan.cilindrada = 1.5;
        nissan.color = "negro"; //A pesar de que el color ya estaba definido, si lo definimos aquí, se modifica el valor
        */
        //Accedemos a los atributos mediante metodos
        /*
        nissan.setFabricante("Nissan");
        nissan.setModelo("Tsuru");
        nissan.setCilindrada(1.5);
        nissan.setColor("negro");
        */

        Motor motorNissan = new Motor(1.5, TipoMotor.GASOLINA); //Creamos el objeto Motor, el cual recibe la cilindrada y el TipoMotor
        Tanque tanqueNissan = new Tanque(50); //Creamos el objeto tanqueFord, puede no llevar nada como argumento porque por default es 40, sin embargo, si se puede modificar
        Automovil nissan = new Automovil("Nissan", "Tsuru",
                //        "negro", 1.5); //Usando el nuevo constructor
                Color.NEGRO, motorNissan); //Cambiamos el String por el enumerador Color y Al cambiar el atributo a una relacion con una clase, se debe cambiar por lo de la clase
        //         1.5); //Cambiamos el
        nissan.setTanque(tanqueNissan); //Asignamos a setTanque el objeto creado tanqueNissan

        //Podemos crear un nuevo Objeto, con los parametros vacios, para ello, debemos
        //crear un constructor que permita tener los parametros vacios
        Motor motorKia = new Motor(2.5, TipoMotor.GASOLINA); //Creamos el objeto Motor, el cual recibe la cilindrada y el TipoMotor
        Tanque tanqueKia = new Tanque(); //Creamos el objeto Tanque, recibe la capacidad del tanque, por defecto esta en 40, sin embargo, podemos pasar por argumento otro valor

        Automovil kia = new Automovil("KIA", "Rio",
                //        "Gris", 2.5, 50);
                Color.GRIS, motorKia, tanqueKia); //Cambiamos el String por el enumerador Color y Al cambiar el atributo a una relacion con una clase, se debe cambiar por lo de la clase
        //        2.5, 50);

        //Comparamos el objeto nissan con el objeto nissan

        Motor motorNissan2 = new Motor(1.5, TipoMotor.GASOLINA); //Creamos el objeto Motor, el cual recibe la cilindrada y el TipoMotor
        Automovil nissan2 = new Automovil("Nissan", "Tsuru",
                //        "negro", 1.5);
                Color.NEGRO, motorNissan2); //Cambiamos el String por el enumerador Color y Al cambiar el atributo a una relacion con una clase, se debe cambiar por lo de la clase
        //        1.5);

        System.out.println("nissan es igual a nissan2 con ==: " + (nissan == nissan2)); //Es falso, porque a pesar de que tiene los mismos
        System.out.println("nissan es igual a nissan2 con equals: " + (nissan.equals(nissan2))); // parametros, es un objeto diferente
        //al existir el metodo, entonces compara los valores e indica si son iguales o son distintos


        System.out.println(nissan); //Esta es la forma implicita del objeto convertirlo a String, por defecto, imprime
        //El nombre de la clase concatenado con un @ y con un hexadecimal, el cual es convertido desde un hashcode
        //Imprime Automovil@13969fbe
        System.out.println(nissan.toString()); //Esta es la forma explicita, es igual al de arriba //Al sobreescribir el
        //metodo, ahora imprimirá lo que nosotros indiquemos en el metodo


        //Si queremos acceder a alguno de los atributos, accedemos por medio del metodo leer
        System.out.println("Fabricante del primer coche = " + ford.getFabricante());

/*
        System.out.println("ford.fabricante = " + ford.fabricante); //Cuando se imprime y obtiene el valor, si no esta asignado, por defecto es null
        System.out.println("ford.modelo = " + ford.modelo);
        System.out.println("ford.color = " + ford.color);
        System.out.println("ford.cilindrada = " + ford.cilindrada); //Cuando se imprime y obtiene el valor, si no esta asignado, por defecto es 0
        Estas líneas forman parte del método detalle
*/

/*
        Estas líneas se quitan porque no es necesario repetirlo, ya que todo está dentro del método
        System.out.println("auto.fabricante = " + nissan.fabricante); //Cuando se imprime y obtiene el valor, si no esta asignado, por defecto es null
        System.out.println("auto.modelo = " + nissan.modelo);
        System.out.println("auto.color = " + nissan.color);
        System.out.println("auto.cilindrada = " + nissan.cilindrada); //Cuando se imprime y obtiene el valor, si no esta asignado, por defecto es 0
*/
        /*//Invocamos el método, nombreObjeto.nombreMetodo();
        ford.detalle();
        nissan.detalle();
        */
        //Imprimimos el método, nombreObjeto.nombreMetodo();
        System.out.println(ford.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(ford.acelerar(3000)); //Al estar pasando el parametro rpm en el metodo
        //Se requiere de un numero int, ya que es el argumento que el metodo pide
        System.out.println(ford.frenar());
        System.out.println(nissan.acelerarFrenar(2000));
        System.out.println("Km por litro = " + nissan.calcularConsumo(300, 0.60f)); //El metodo
        //debe recibir el parametro int, y el float del porcentaje de 0 a 1 en decimal
        System.out.println("Km por litro = " + ford.calcularConsumo(300, 60));//Al colocar un
        //entero en el segundo parametro, la maquina virtual buscara el metodo que reciba los dos parametros del tipo entero

        System.out.println(kia.verDetalle());
    }

}