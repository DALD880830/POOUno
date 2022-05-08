public class EjemploAutomovil {

    public static void main(String[] args) {

        Automovil ford = new Automovil(); //Creamos el nuevo objeto Automovil

        ford.fabricante = "Ford"; //Los valores se pueden modificar desde aquí
        ford.modelo = "Mustang"; //Asignamos los datos
        ford.cilindrada = 2.0;
        ford.color = "azul"; //A pesar de que el color ya estaba definido, si lo definimos aquí, se modifica el valor


        Automovil nissan = new Automovil();

        nissan.fabricante = "Nissan"; //Los valores se pueden modificar desde aquí
        nissan.modelo = "Tsuru"; //Asignamos los datos
        nissan.cilindrada = 1.5;
        nissan.color = "negro"; //A pesar de que el color ya estaba definido, si lo definimos aquí, se modifica el valor

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
        System.out.println(ford.detalle());
        System.out.println(nissan.detalle());
    }

}
