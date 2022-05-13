public class EjemploAutomovilRelacionesObjeto {

    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(45); //Con el metodo set, podemos cambiar el valor estatico del atributo static
        //Solo que cambia el valor para todos los objetos


        /*Rueda [] ruedasFord = new Rueda[5]; //Creamos el objeto Rueda, entre corchetes indicamos el numero de ruedas que tendrá el arreglo
        for(int i=0; i < ruedasFord.length; i++){//Usamos el for para crear las ruedas, ya que todas son iguales
            ruedasFord[i] = new Rueda("Michelin", 16, 7.5);
        }*/

        /*ruedasFord[0] = new Rueda("Michelin", 16, 7.5); //Creamos las 5 ruedas
        ruedasFord[1] = new Rueda("Michelin", 16, 7.5);
        ruedasFord[2] = new Rueda("Michelin", 16, 7.5);
        ruedasFord[3] = new Rueda("Michelin", 16, 7.5);
        ruedasFord[4] = new Rueda("Michelin", 16, 7.5);*/

        Persona conductorFord = new Persona("Alejandro", "Lopez"); //Creamos el objeto Persona
        Tanque tanqueFord = new Tanque(); //Creamos el objeto tanque
        Motor motorFord = new Motor(2.0, TipoMotor.GASOLINA); //Creamos el objeto Motor, el cual recibe la cilindrada y el TipoMotor
        Automovil ford = new Automovil("Ford", "Mustang"); //Insertamos fabricante y mustang usando
        // el nuevo constructor, los constructores solo se pueden invocar con el new
        //ford.setCilindrada(2.0); //Cilindrada y color deben seguirse insertando de esta forma, ya que no estan definidos en
        //ford.setColor("azul"); //el constructor que realizamos de manera explicita
        //En vez de colocar el color de esta forma, lo colocamos por medio de la constante
        //ford.setColor(Automovil.COLOR_AZUL);

        ford.setColor(Color.AZUL); //Para acceder a la clase de enumeradores, se coloca el nombre de la clase punto y el nombre del enumerado
        ford.setTipo(TipoAutomovil.CONVERTIBLE); //Establecemos que este automovil es de tipo convertible, usando el enumerador TipoAutomovil
        ford.setMotor(motorFord); //Pasamos por argumento al set el objeto motorFord, que contiene la cilindrada
        ford.setTanque(tanqueFord); //Pasamos por argumento al set el objeto tanque
        ford.setConductor(conductorFord); //Asignamos al set el objeto persona
        //ford.setRuedas(ruedasFord); //Asignamos al set el objeto ruedas

        Rueda [] ruedasFord = new Rueda[5]; //Creamos las ruedas con el metodo add
        for(int i=0; i < ruedasFord.length; i++){//Usamos el for para crear las ruedas, ya que todas son iguales
            ford.addRueda(new Rueda("Michelin", 16, 7.5));
        }




        /*Rueda [] ruedasNissan = {new Rueda("Michelin", 18, 10.5), //Creamos el objeto rueda, sin embargo, utilizamos otra forma de asignar las rudas
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5)};*/


        /*Rueda [] ruedasNissan = new Rueda[4];
        for(int i=0; i < ruedasNissan.length; i++){//Usamos el for para crear las ruedas, ya que todas son iguales
            ruedasNissan[i] = new Rueda("Michelin", 18, 10.5);
        }*/

        Persona conductorNissan = new Persona("Daniel", "López"); //Creamos el objeto Persona
        Motor motorNissan = new Motor(1.5, TipoMotor.GASOLINA); //Creamos el objeto Motor, el cual recibe la cilindrada y el TipoMotor
        Tanque tanqueNissan = new Tanque();
        Automovil nissan = new Automovil("Nissan", "Tsuru",
                //Automovil.COLOR_ROJO, 1.5); //Usando el nuevo constructor
                Color.ROJO, motorNissan); //Cambiamos Automovi.COLOR_ROJO por el enumerador Color.ROJO y el valor del motor 1.5 por el nuevo objeto creado
        nissan.setTipo(TipoAutomovil.SEDAN); //Establecemos que este automovil es de tipo sedan, usando el enumerador TipoAutomovil
        nissan.setConductor(conductorNissan); //Asignamos al set el objeto persona
        nissan.setTanque(tanqueNissan); //Asignamos al set el objeto tanque
        //nissan.setRuedas(ruedasNissan); //Asignamos al set el objeto ruedas
        nissan.addRueda(new Rueda("Michelin", 18, 10.5)) //Otra forma de colocar metodos encadenados
                .addRueda(new Rueda("Michelin", 18, 10.5))
                .addRueda(new Rueda("Michelin", 18, 10.5))
                .addRueda(new Rueda("Michelin", 18, 10.5))
                .addRueda(new Rueda("Michelin", 18, 10.5));



        /*Rueda [] ruedasKia = {new Rueda("Pirelli", 20, 11.5), //Creamos el objeto rueda, sin embargo, utilizamos otra forma de asignar las rudas
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5)};*/

        /*Rueda [] ruedasKia = new Rueda[4];
        for(int i=0; i < ruedasKia.length; i++){//Usamos el for para crear las ruedas, ya que todas son iguales
            ruedasKia[i] = new Rueda("Michelin", 20, 11.5);
        }*/

        Persona conductorKia = new Persona("Alex", "López"); //Creamos el objeto Persona
        Motor motorKia = new Motor(1.5, TipoMotor.GASOLINA); //Creamos el objeto Motor, el cual recibe la cilindrada y el TipoMotor
        Tanque tanqueKia = new Tanque(); //Creamos el objeto Tanque, recibe la capacidad del tanque, por defecto esta en 40, sin embargo, podemos pasar por argumento otro valor
        Automovil kia = new Automovil("KIA", "Rio",
                //Automovil.COLOR_BLANCO, 2.5, 50);
                Color.BLANCO, motorKia, tanqueKia); //Cambiamos Automovi.COLOR_ROJO por el enumerador Color.ROJO y el valor del motor 1.5 por el nuevo objeto creado, además del valor del tanque
        kia.setTipo(TipoAutomovil.SEDAN); //Establecemos que este automovil es de tipo sedan, usando el enumerador TipoAutomovil
        kia.setConductor(conductorKia); //Asignamos al set el objeto persona
        kia.setTanque(tanqueKia); //Asignamos al set el objeto tanque
        //kia.setRuedas(ruedasKia); //Asignamos al set el objeto ruedas

        Rueda [] ruedasKia = new Rueda[5]; //Creamos las ruedas con el metodo add
        for(int i=0; i < ruedasKia.length; i++){//Usamos el for para crear las ruedas, ya que todas son iguales
            kia.addRueda(new Rueda("Pirelli", 18, 9.5));
        }




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

        //De esta forma podemos imprimir tanto el conductor como las ruedas de un solo carro, sin embargo, al agregarlo al metodo verDetalle()
        //Ya no es necesario tenerlo aquí
        /*System.out.println("Conductor del ford: " + ford.getConductor());
        System.out.println("Ruedas del ford");
        for (Rueda r: ford.getRuedas()){ //Utilizamos for each para imprimir cada una de las ruedas del objeto automovil ford
            System.out.println(r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho());
        }*/

    }

}