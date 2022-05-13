public class Automovil implements Comparable{ //implements Comparable es una interfaz propia de Java

    /*
    String fabricante; //Atributo de la clase //Si no lleva private, por defecto es public
    String modelo;
    String color = "rojo"; //Definimos un valor por feceto para todos los objetos Automovil
    double cilindrada; //Los atributos se esciben en minusculas y las clases en mayusculas
    int capacidadTanque = 40; //Para determinar el rendimiento en el metodo de calcularConsumo, se requiere de asignar esta variable
    */

    //Los atributos de la clase deben ser privados y se deben acceder y modificar por medio de métodos
    private String fabricante;
    private String modelo;
    //private String color = "rojo"; //Para acceder a los colores del enum, String se cambia por Color, que es el
    //private String color = COLOR_GRIS; //nombre de la clase de enumeradores
    //private double cilindrada; //Este atributo se maneja antes de crear las relaciones con la clase Motor
    //private int capacidadTanque = 40; //Este es antes de crear las relaciones con la clase Tanque

    private Motor motor; //Atributo relacionado a la clase Motor
    private Tanque tanque; //Atributo relacionado a la clase Tanque
    private Persona conductor; //Atributo relacionado a la clase Persona
    private Rueda[] ruedas; //Atributo relacionado a la clase Rueda
    private int indiceRuedas;



    private TipoAutomovil tipo; //Atributo del enumerador de la clase TipoAutomovil

    public TipoAutomovil getTipo() { //Obtenemos el tipo automovil
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) { //Establecemos un valor al tipo automovil
        this.tipo = tipo;
    }



    private Color color = Color.GRIS; //De esta forma accedemos al color gris en la clase de enumeradores

    private int id; //Parte en 0


    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120; //Atributo final, es un atributo que no puede ser
    //modificado, es una constante que no se puede modificar //Se escribe con mayusculas, las palabras separadas por guion bajo
    public final static int VELOCIDAD_MAXIMA_CIUDAD = 80; //Los modificadores de public final static pueden ir en cualquier orden

    public final static String COLOR_ROJO = "Rojo";
    public final static String COLOR_AMARILLO = "Amarillo";
    public final static String COLOR_AZUL = "Azul";
    public final static String COLOR_BLANCO = "Blanco";
    public final static String COLOR_GRIS = "Gris";



    private static int ultimoId; //Parte en 0

    private static int capacidadTanqueEstatico = 30;

    //private static String colorPatente = "Naranja"; //Atributo estático, es una variable que estara en todos los objetos Automovil por igual
    //Un metodo estatico debe ser para un atributo estatico
    private static Color colorPatente = Color.NARANJA; //Cambiamos el atributo estatico, para usar el enumerados


    //public static String getColorPatente() {return colorPatente;}
    public static Color getColorPatente() {
        return colorPatente;
    } //Cambiamos el String por Color del enumerador

    /*
    public static void setColorPatente(String colorPatente) { //this. no se puede usar en contexto estatico
        String.colorPatente = colorPatente; //En vez del this. usamos el nombre de la clase
    }
    */
    public static void setColorPatente(Color colorPatente) { //Cambiamos el String por Color del enumerador
        Automovil.colorPatente = colorPatente;
    }



    public static int getCapacidadTanqueEstatico() {
        return capacidadTanqueEstatico;
    }
    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }


    public Automovil(){ //Se crea la primera instancia vale cero, incrementa a 1 y lo asigna
        this.id = ++ultimoId; //Cada que se cree el objeto incrementamos el ultimoId y se lo asignamos a id
        this.ruedas = new Rueda[5]; //Se inicializa el objeto rueda en el constructor
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }




    //Implementamos un constructor de manera explicita, si no se implementa, por default hay uno vacio que se implementa que no tiene parametros ni argumentos
    public Automovil(String fabricante, String modelo){ //Debe llevar el mismo nombre de la clase, le pasamos fabricante y
        //modelo por argumento entre los parentesis
        this(); //Para poder incrementar el ID, este this() invoca al metodo Automovil que cuenta con los id
        this.fabricante = fabricante; //Con this. hacemos re
        this.modelo = modelo;
    }

    /*
    public Automovil(){ //Podemos crear un segundo constructor vacio
    }
    //Tambien se puede generar este constructor con el click derecho, generate, constructor y ahí definimos que
    // argumentos o parametros son lo que queremos, o si deseamos que el constructor este vacio
    */


    //public Automovil(String fabricante, String modelo, String color){ //Cambiamos el String color por Color color
    public Automovil(String fabricante, String modelo, Color color){
        //this.fabricante = fabricante; //quitamos estos dos y los pasamos a un solo this, esto hará que este constructor
        //this.modelo = modelo; //invoque al constructor que solo tiene esos dos parametros
        this(fabricante, modelo);
        this.color = color;
    }

    //public Automovil(String fabricante, String modelo, String color, double cilindrada){
    public Automovil(String fabricante, String modelo, Color color,
                     //                 double cilindrada){ //Al cambiar el atributo a una relacion con una clase, se debe cambiar por lo de la clase
                     Motor motor){
        //this.fabricante = fabricante; //quitamos estos tres y los pasamos a un solo this
        //this.modelo = modelo; //esto hará que este constructor invoque al constructor que solo
        //this.color = color; // tiene esos tres parametros
        this(fabricante, modelo, color);
        //this.cilindrada = cilindrada; //Al cambiar el atributo a una relacion con una clase, se debe cambiar por lo de la clase
        this.motor = motor;
    }

    //public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque){
    public Automovil(String fabricante, String modelo, Color color,
                     //             double cilindrada, int capacidadTanque){ //Al cambiar el atributo a una relacion con una clase, se debe cambiar por lo de la clase.
                     Motor motor, Tanque tanque){
        //this.fabricante = fabricante; //quitamos estos cuatro y los pasamos a un solo this
        //this.modelo = modelo; //esto hará que este constructor invoque al constructor que
        //this.color = color; // tiene esos cuatro parametros
        //this.cilindrada = cilindrada;
        this(fabricante, modelo, color,
                //        cilindrada); //Al cambiar el atributo a una relacion con una clase, se debe cambiar por lo de la clase
                motor);
        // this.capacidadTanque = capacidadTanque; //Al cambiar el atributo a una relacion con una clase, se debe cambiar por lo de la clase
        this.tanque = tanque;
    }


    //Creamos un constructor para inicializar todo
    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, tanque); //Se realiza así, porque ya esta inicializado en el constructor de arriba, entonces se reutiliza
        this.conductor = conductor; //Estos dos atributos son propios de este constructor
        this.ruedas = ruedas;
    }




    //Metodos para la lectura de atributos

    //A las clases get y set se les conoce como POJO (Plain Old Java Object) Objeto plano de java, objeto
    //simple que solo representa datos, se pueden generar de forma automatica con clock derecho, click en generate
    //click en getter and setter, y se marcan los atributos a los que se le generará el getter o setter o ambos

    //public String leerFabricante(){ //Se debe utilizar la nomenclatura para obtener... get
    public String getFabricante(){ //Usando la nomenclatura get
        return this.fabricante;
    }
    public String getModelo(){
        return this.modelo;
    }
    //public String getColor(){
    public Color getColor(){ //Cambiamos el String por Color del enumerador
        return this.color;
    }




    /* public double getCilindrada(){  //Al cambiar el atributo a una relacion con una clase, los getter y setter se
        return this.cilindrada; //cambiar por unos distintos, y agregamos los getter y setter faltantes
    }
        public int getCapacidadTanque(){
        return this.capacidadTanque;
    }*/

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tanque getTanque() {
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Automovil addRueda(Rueda rueda) { //Creamos el metodo add de rueda, para que no se agreguen todas, sino ir agregando de una en una
        if (indiceRuedas < this.ruedas.length) { //Si se quiere agregar una rueda de más, simplemente no se agrega
            this.ruedas[indiceRuedas++] = rueda; //Cuando se invoque, la primera rueda se guarda en el indice 0 y la segunda en el indice 1 por el post incremento y así sucesivamente
        }
        return this;//Retorna este mismp, pero no puede ser void, debe tener el nombre de la clase
    }


//Métodos para la asignacion de valores

    //public void asignarFabricante(String fabricante){ //Es void porque no hace mas que actualizar el valor
    //con this.fabricante hacemos referencia al atributo, despues damos el valor que se recibe por argumento
    //Se debe usar la nomenclatura para modificar... set
    public void setFabricante(String fabricante){ //Usando la nomenclatura set
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    //public void setColor(String color){
    public void setColor(Color color){ //Cambiamos el String por Color del enumerador
        this.color = color;
    }


    //public void setCilindrada(double cilindrada){ //Al cambiar el atributo a una relacion con una clase, se debe cambiar por lo de la clase
    /*public void setCilindrada(Motor motor){ //Al cambiar el atributo a una relacion con una clase, los getter y setter se
        this.cilindrada = cilindrada; //cambiar por unos distintos, y agregamos los getter y setter faltantes
        this.motor = motor;
    }
    public void setCapacidadTanque(int capacidadTanque){
        this.capacidadTanque = capacidadTanque;
    }*/



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
        String detalle =  "auto.iD = " + this.id +
                "\nauto.fabricante = " + this.getFabricante() + //String concatenado //Cambiamos this.fabricante por this.getFabricante() para obtener el fabricante
                "\nauto.modelo = " + this.getModelo();//Cambiamos this.modelo por this.getModelo() para obtener el fabricante

        if(this.getTipo() != null) {
            detalle += "\nauto.tipo = " + this.getTipo().getDescripcion(); //Agregamos el tipo, utilizando el enumerador TipoAutomovil
            //        "\nauto.cilindrada = " + this.cilindrada +  //Al cambiar el atributo a una relacion con una clase, se debe cambiar por lo de la clase
        }

        detalle += "\nauto.cilindrada = " + this.motor.getCilindrada() +
                //"\nauto.color = " + this.color.getColor() + //Obtenemos el color del enumerador con getColor()
                //"\nauto.patenteColor = " + colorPatente.getColor(); //Obtenemos el color del enumerador con getColor()
                "\nauto.color = " + this.color +
                "\nauto.patenteColor = " + colorPatente;  //Como es estatico no se debe colocar this. //Se puede colocar
        // solo el nombre del atributo o la clase punto atributo Automovil.colorPatente
        if(getRuedas() != null){
            detalle += "\nConductor: " + this.getConductor();
        }
        if(getRuedas() != null){
            detalle += "\nRuedas del automovil: ";
            for (Rueda r: this.getRuedas()){ //Utilizamos for each para imprimir cada una de las ruedas del objeto automovil ford
                detalle += "\n" + r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho();
            }
        }
        return detalle;
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

    public float calcularConsumo(int km, float porcentajeGasolina){ //Metodo para calcular el rendimiento de kilometros por litro

        //return km/(capacidadTanque*porcentajeGasolina); //Al cambiar el atributo a una relacion con una clase, se debe cambiar por lo de la clase

        return km/(tanque.getCapacidad()*porcentajeGasolina); //Usamos getCapacidad() para obtener la capacidad del tanque que almacenamos en la clase
        //Por argumento recibe un entero que son los km y un decimal que es el porcentaje
        //multiplica el porcentaje de 0 a 1 en decimal por 40 que es la capacidad del tanque,
        // despues realiza la division de los km que se den entre el resultado de la multiplicacion
    }

    public float calcularConsumo(int km, int porcentajeGasolina){ //Se pueden tener dos metodos con el mismo nombre
        //solo con cambiar el tipo de argumentos que recibe, a esto se le llama sobrecarga de metodos

        //return km/(capacidadTanque*(porcentajeGasolina/100f)); //Al cambiar el atributo a una relacion con una clase, se debe cambiar por lo de la clase

        return km/(this.tanque.getCapacidad()*(porcentajeGasolina/100f)); //También se puede usar el this para lo de getCapacidad()
        //Para que retorne el float, se debe dividir el int de porcentaje entre 100 y colocar que este 100 es un float
    }



    public static float calcularConsumoEstatico(int km, int porcentajeGasolina){ //Metodo estatico, debe tener un atributo
        return km/(capacidadTanqueEstatico * (porcentajeGasolina/100f)); //estatico, y el atributo NO se referencia con this.
    }



    @Override //Override le indica al compilador que estamos sobreescribiendo un metodo //Click derecho, generate, override method, equals
    public boolean equals(Object obj) { //pasamos el objeto para comparar

        if (! (obj instanceof  Automovil)){ //Si el objeto no es instancia o no es del tipo de Automovil, retorna false
            return false; //Si no son del mismo tipo de objeto, solo retorna false y ya no hace la comprobacion
        }
        if (this == obj){ //Coparamos por referencia, si se trata del mismo objeto es true
            return true;
        }
        Automovil a = (Automovil) obj; //Le damos un nombre cualquiera a Automovil, en este caso a, hacemos un CAST
        //convertimos el objeto a tipo Automovil, comparamos el objeto que viene de afuera con esta clase, lo comparamos con el this
        return (this.fabricante != null && this.modelo != null //Agregamos que fabricante y modelo sean diferente de null
                //para evitar que marque error, al intenetar comparar dos objetos Automovil, pero uno de ellos con valores nulos
                && this.fabricante.equals(a.getFabricante()) && this.modelo.equals(getModelo()));
        //comparamos el objeto por fabricante, es del tipo string y se requiere del metodo equals para comparar
        //comparamos el fabricante del objeto a obteniendo el fabricante con getFabricante y tambien comparamos con el
        //modelo, si ambos son iguales, entonces ambos objetos son iguales
    }

    @Override
    public String toString() { //Sobreescribimos el metodo toString, ahora imprime el nombre del objeto con todos sus atributos
        return "Automovil { " +
                "ID='" + id + '\'' +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                //            ", cilindrada=" + cilindrada + //Al cambiar el atributo a una relacion con una clase, se debe cambiar por lo de la clase
                ", cilindrada=" + motor +
                //            ", capacidadTanque=" + capacidadTanque + //Al cambiar el atributo a una relacion con una clase, se debe cambiar por lo de la clase
                ", capacidadTanque=" + tanque +
                '}';
    }

    @Override
    public int compareTo(Object o) { //Click derecho, Implements Methods...
        Automovil a = (Automovil) o;//Obtenemos el tipo Object que tambien es Automovil, le damos una variable a, hacemos un CAST hacia o que se recibe por argumento
        return this.fabricante.compareTo(a.fabricante); //Comparamos fabricante de esta clase, lo comparamos con fabricante de a
    }  //Podemos omitir el CAST si en el nombre de la clase ponemos <Automovil> que sería el objeto, y en compareTo cambiamos Object o por Automovil a

}