import java.util.Arrays;

public class EjemploAutomovilArreglo {

    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(45); //Con el metodo set, podemos cambiar el valor estatico del atributo static
        //Solo que cambia el valor para todos los objetos


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




        Persona conductorNissan = new Persona("Daniel", "López"); //Creamos el objeto Persona
        Motor motorNissan = new Motor(1.5, TipoMotor.GASOLINA); //Creamos el objeto Motor, el cual recibe la cilindrada y el TipoMotor
        Tanque tanqueNissan = new Tanque();
        Automovil nissan = new Automovil("Nissan", "Tsuru",
                //Automovil.COLOR_ROJO, 1.5); //Usando el nuevo constructor
                Color.ROJO, motorNissan); //Cambiamos Automovi.COLOR_ROJO por el enumerador Color.ROJO y el valor del motor 1.5 por el nuevo objeto creado
        nissan.setTipo(TipoAutomovil.SEDAN); //Establecemos que este automovil es de tipo sedan, usando el enumerador TipoAutomovil
        nissan.setConductor(conductorNissan); //Asignamos al set el objeto persona
        nissan.setTanque(tanqueNissan); //Asignamos al set el objeto tanque



        Persona conductorKia = new Persona("Alex", "López"); //Creamos el objeto Persona
        Motor motorKia = new Motor(1.5, TipoMotor.GASOLINA); //Creamos el objeto Motor, el cual recibe la cilindrada y el TipoMotor
        Tanque tanqueKia = new Tanque(); //Creamos el objeto Tanque, recibe la capacidad del tanque, por defecto esta en 40, sin embargo, podemos pasar por argumento otro valor
        Automovil kia = new Automovil("KIA", "Rio",
                //Automovil.COLOR_BLANCO, 2.5, 50);
                Color.BLANCO, motorKia, tanqueKia); //Cambiamos Automovi.COLOR_ROJO por el enumerador Color.ROJO y el valor del motor 1.5 por el nuevo objeto creado, además del valor del tanque
        kia.setTipo(TipoAutomovil.SEDAN); //Establecemos que este automovil es de tipo sedan, usando el enumerador TipoAutomovil
        kia.setConductor(conductorKia); //Asignamos al set el objeto persona
        kia.setTanque(tanqueKia); //Asignamos al set el objeto tanque



        //Si queremos acceder a alguno de los atributos, accedemos por medio del metodo leer -> get
        System.out.println("Fabricante del primer coche = " + ford.getFabricante());



        //Automovil.setColorPatente("AZULITO"); //Si modificamos el valor del atributo estatico, este se modifica para todos los objetos
        //Podemos modificar los demas atributos que no sean estaticos y solo se reflejaran en el objeto especifico
        //nissan.setColor("Morado");
        Automovil.setColorPatente(Color.AMARILLO); //Cambiamos el String por el enumerador Color


        Automovil audi = new Automovil("Audi", "A3");
        audi.setConductor(new Persona("Yaz", "Rod"));

        Automovil[] autos = new Automovil[4];
        autos[0] = ford;
        autos[1] = nissan;
        autos[2] = kia;
        autos[3] = audi;

        Arrays.sort(autos); //Usamos Arrays.sort para ordenar por alfabeto
        for (int i = 0 ; i < autos.length; i++){ //Imprimimos el arreglo de autos
            System.out.println(autos[i]); //Imprime los objetos y los muestra con el toString
        }

    }

}