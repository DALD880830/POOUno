public class EjemploAutomovil {

    public static void main(String[] args) {

        Automovil ford = new Automovil(); //Creamos el nuevo objeto Automovil
        /*
        ford.fabricante = "Ford"; //Los valores se pueden modificar desde aquí
        ford.modelo = "Mustang"; //Asignamos los datos
        ford.cilindrada = 2.0;
        ford.color = "azul"; //A pesar de que el color ya estaba definido, si lo definimos aquí, se modifica el valor
        */
        //Accedemos a los atributos mediante metodos
        ford.asignarFabricante("Ford");
        ford.asignarModelo("Mustang");
        ford.asignarCilindrada(2.0);
        ford.asignarColor("azul");


        Automovil nissan = new Automovil();
        /*
        nissan.fabricante = "Nissan"; //Los valores se pueden modificar desde aquí
        nissan.modelo = "Tsuru"; //Asignamos los datos
        nissan.cilindrada = 1.5;
        nissan.color = "negro"; //A pesar de que el color ya estaba definido, si lo definimos aquí, se modifica el valor
        */
        //Accedemos a los atributos mediante metodos
        nissan.asignarFabricante("Nissan");
        nissan.asignarModelo("Tsuru");
        nissan.asignarCilindrada(1.5);
        nissan.asignarColor("negro");

        //Si queremos acceder a alguno de los atributos, accedemos por medio del metodo leer
        System.out.println("Fabricante del primer coche = " + ford.leerFabricante());

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
    }

}
