public enum TipoAutomovil {

    SEDAN ("Sedan", "Auto mediano", 4),
    STATION_WAGON ("Station Wagon", "Auto grnde", 4),
    HATCHBACK ("Hatchback", "Auto compacto", 4),
    PICKUP ("Pickup", "Camioneta", 4),
    COUPE ("Cuopé", "Auto pequeño", 2),
    CONVERTIBLE ("Convertible", "Auto deportivo", 2),
    FURGON ("Furgón", "Auto utilitario", 4);

    private final String nombre;
    private final String descripcion;
    private final int numeroPuerta;


    TipoAutomovil(String nombre, String descripcion, int numeroPuerta) { //Constructor
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuerta = numeroPuerta;
    }


    public String getNombre() { //Obtenemos el nombre
        return nombre;
    }

    public String getDescripcion() { //Obtenemos la descripcion
        return descripcion;
    }

    public int getNumeroPuerta() { //Obtenemos el numero de puertas
        return numeroPuerta;
    }

}