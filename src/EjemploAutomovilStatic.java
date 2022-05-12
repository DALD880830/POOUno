public class EjemploAutomovilStatic {

    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(45); //Con el metodo set, podemos cambiar el valor estatico del atributo static
        //Solo que cambia el valor para todos los objetos

        Automovil ford = new Automovil("Ford", "Mustang"); //Insertamos fabricante y mustang usando
        // el nuevo constructor, los constructores solo se pueden invocar con el new
        ford.setCilindrada(2.0); //Cilidrada y color deben seguirse insertando de esta forma, ya que no estan definidos en
        //ford.setColor("azul"); //el constructor que realizamos de manera explicita
        //En vez de colocar el color de esta forma, lo colocamos por medio de la constante
        //ford.setColor(Automovil.COLOR_AZUL);

        ford.setColor(Color.AZUL); //Para acceder a la clase de enumeradores, se coloca el nombre de la clase punto y el nombre del enumerado
        ford.setTipo(TipoAutomovil.CONVERTIBLE); //Establecemos que este automovil es de tipo convertible, usando el enumerador TipoAutomovil



        Automovil nissan = new Automovil("Nissan", "Tsuru",
                //Automovil.COLOR_ROJO, 1.5); //Usando el nuevo constructor
                Color.ROJO, 1.5); //Cambiamos Automovi.COLOR_ROJO por el enumerador Color.ROJO
        nissan.setTipo(TipoAutomovil.SEDAN); //Establecemos que este automovil es de tipo sedan, usando el enumerador TipoAutomovil


        //Podemos crear un nuevo Objeto, con los parametros vacios, para ello, debemos
        //crear un constructor que permita tener los parametros vacios
        Automovil kia = new Automovil("KIA", "Rio",
                //Automovil.COLOR_BLANCO, 2.5, 50);
                Color.BLANCO, 2.5, 50); //Cambiamos Automovi.COLOR_ROJO por el enumerador Color.ROJO
        kia.setTipo(TipoAutomovil.SEDAN); //Establecemos que este automovil es de tipo sedan, usando el enumerador TipoAutomovil



        //Si queremos acceder a alguno de los atributos, accedemos por medio del metodo leer -> get
        System.out.println("Fabricante del primer coche = " + ford.getFabricante());



        //Automovil.setColorPatente("AZULITO"); //Si modificamos el valor del atributo estatico, este se modifica para todos los objetos
        //Podemos modificar los demas atributos que no sean estaticos y solo se reflejaran en el objeto especifico
        //nissan.setColor("Morado");
        Automovil.setColorPatente(Color.AMARILLO); //Cambiamos el String por el enumerador Color


        Automovil auto = new Automovil();

        //Imprimimos el método, nombreObjeto.nombreMetodo();
        System.out.println(ford.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(kia.verDetalle());

        //System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente().getColor()); //Si obtenemos el color de esta manera, coloca el nombre en minuscula del String del enumerador
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        //No sehace referencua a ninguna instancia, sino directamente al nombre de la clase

        System.out.println("calcularConsumoEstatico() = " + Automovil.calcularConsumoEstatico(300, 60));

        System.out.println("Velocidad en carretera: " + Automovil.VELOCIDAD_MAXIMA_CARRETERA + " km/h");
        System.out.println("Velocidad en Ciudad: " + Automovil.VELOCIDAD_MAXIMA_CIUDAD + " km/h");

        TipoAutomovil tipoMustang = ford.getTipo();
        System.out.println("tipoMustang.getNombre() = " + tipoMustang.getNombre()); //Imprimimos los valores del enumerador
        System.out.println("tipoMustang.getDescripcion() = " + tipoMustang.getDescripcion());
        System.out.println("tipoMustang.getNumeroPuerta() = " + tipoMustang.getNumeroPuerta());

    }

}