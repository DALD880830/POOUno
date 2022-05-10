public class EjemploAutomovilStatic {

    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(45); //Con el metodo set, podemos cambiar el valor estatico del atributo static
        //Solo que cambia el valor para todos los objetos

        Automovil ford = new Automovil("Ford", "Mustang"); //Insertamos fabricante y mustang usando
        // el nuevo constructor, los constructores solo se pueden invocar con el new
        ford.setCilindrada(2.0); //Cilidrada y color deben seguirse insertando de esta forma, ya que no estan definidos en
        //ford.setColor("azul"); //el constructor que realizamos de manera explicita
        //En vez de colocar el color de esta forma, lo colocamos por medio de la constante
        ford.setColor(Automovil.COLOR_AZUL);



        Automovil nissan = new Automovil("Nissan", "Tsuru", Automovil.COLOR_ROJO, 1.5); //Usando el nuevo constructor


        //Podemos crear un nuevo Objeto, con los parametros vacios, para ello, debemos
        //crear un constructor que permita tener los parametros vacios
        Automovil kia = new Automovil("KIA", "Rio", Automovil.COLOR_BLANCO, 2.5, 50);



        //Si queremos acceder a alguno de los atributos, accedemos por medio del metodo leer -> get
        System.out.println("Fabricante del primer coche = " + ford.getFabricante());



        Automovil.setColorPatente("AZULITO"); //Si modificamos el valor del atributo estatico, este se modifica para todos los objetos
        //Podemos modificar los demas atributos que no sean estaticos y solo se reflejaran en el objeto especifico
        //nissan.setColor("Morado");

        Automovil auto = new Automovil();

        //Imprimimos el método, nombreObjeto.nombreMetodo();
        System.out.println(ford.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(kia.verDetalle());

        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        //No sehace referencua a ninguna instancia, sino directamente al nombre de la clase

        System.out.println("calcularConsumoEstatico() = " + Automovil.calcularConsumoEstatico(300, 60));

        System.out.println("Velocidad en carretera: " + Automovil.VELOCIDAD_MAXIMA_CARRETERA + " km/h");
        System.out.println("Velocidad en Ciudad: " + Automovil.VELOCIDAD_MAXIMA_CIUDAD + " km/h");




    }

}