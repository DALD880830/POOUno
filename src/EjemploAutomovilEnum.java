public class EjemploAutomovilEnum {

    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(45); //Con el metodo set, podemos cambiar el valor estatico del atributo static
        //Solo que cambia el valor para todos los objetos

        Motor motorFord = new Motor(2.0, TipoMotor.GASOLINA); //Creamos el objeto Motor, el cual recibe la cilindrada y el TipoMotor
        Automovil ford = new Automovil("Ford", "Mustang"); //Insertamos fabricante y mustang usando
        // el nuevo constructor, los constructores solo se pueden invocar con el new
        //ford.setCilindrada(2.0); //Cilidrada y color deben seguirse insertando de esta forma, ya que no estan definidos en
        //el constructor que realizamos de manera explicita

        ford.setColor(Color.AZUL); //Para acceder a la clase de enumeradores, se coloca el nombre de la clase punto y el nombre del enumerado
        ford.setTipo(TipoAutomovil.CONVERTIBLE); //Establecemos que este automovil es de tipo convertible, usando el enumerador TipoAutomovil
        ford.setMotor(motorFord); //Pasamos por argumento al set el objeto motorFord, que contiene la cilindrada



        Motor motorNissan = new Motor(1.5, TipoMotor.GASOLINA); //Creamos el objeto Motor, el cual recibe la cilindrada y el TipoMotor
        Automovil nissan = new Automovil("Nissan", "Tsuru",
                //Automovil.COLOR_ROJO, 1.5); //Usando el nuevo constructor
                Color.ROJO, motorNissan); //Cambiamos Automovil.COLOR_ROJO por el enumerador Color.ROJO y el valor del motor 1.5 por el nuevo objeto creado
        nissan.setTipo(TipoAutomovil.SEDAN); //Establecemos que este automovil es de tipo sedan, usando el enumerador TipoAutomovil


        //Si queremos acceder a alguno de los atributos, accedemos por medio del metodo leer -> get
        System.out.println("Fabricante del primer coche = " + ford.getFabricante());


        TipoAutomovil tipo = ford.getTipo(); //Invocamos la clase y le damos el nombre de tipo, y obtenemos
        // el tipo de coche de la clase para el objeto creado llamado ford
        System.out.println("tipoMustang.getNombre() = " + tipo.getNombre()); //Imprimimos los valores del enumerador
        System.out.println("tipoMustang.getDescripcion() = " + tipo.getDescripcion());
        System.out.println("tipoMustang.getNumeroPuerta() = " + tipo.getNumeroPuerta());



        tipo = nissan.getTipo(); //Cambiamos el objeto ford por el objeto nissan, entonces como habiamos determinado que
        //nissan era de tipo sedan, en el switch case lanzara el caso sedan

        /*switch (tipo){ Esta forma es antes de Java 13
            case CONVERTIBLE:
                System.out.println("Este auto es Convertible");
                break;
            case SEDAN:
                System.out.println("Este es un auto Sedan");
                break;
            case FURGON:
                System.out.println("Este es un auto utilitario de transporte");
                break;
            case HATCHBACK:
                System.out.println("Este es un auto compacto");
                break;
            case COUPE:
                System.out.println("Este es el auto más pequeño de los usados aquí");
                break;
            case PICKUP:
                System.out.println("Esta en realidad es una camioneta");
                break;
            case STATION_WAGON:
                System.out.println("Este es un coche enorme en el que cabe maletas grandes");
        }   */

        switch (tipo){ //Esta sintaxis es a partir de Java 13 en adelante
            case CONVERTIBLE ->
                    System.out.println("Este auto es Convertible");
            case SEDAN ->
                    System.out.println("Este es un auto Sedan");
            case FURGON ->
                    System.out.println("Este es un auto utilitario de transporte");
            case HATCHBACK ->
                    System.out.println("Este es un auto compacto");
            case COUPE ->
                    System.out.println("Este es el auto más pequeño de los usados aquí");
            case PICKUP ->
                    System.out.println("Esta en realidad es una camioneta");
            case STATION_WAGON ->
                    System.out.println("Este es un coche enorme en el que cabe maletas grandes");
        }

        TipoAutomovil [] tipos = TipoAutomovil.values(); //Metodo getValues, retorna un arreglo del numerador con las constantes

        for (TipoAutomovil ta: tipos) {
            System.out.println(ta + "=> " + ta.name() + ", " +  //ta.name() corresponde al nombre original de la constante
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumeroPuerta());
            System.out.println();
        }

    }

}