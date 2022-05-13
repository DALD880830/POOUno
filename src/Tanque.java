public class Tanque { //clase del contexto

    //Atributos
    private int capacidad;

    public Tanque() { //Creamos constructor sin parametro y asignamos capacidad con 40 por defecto
        this.capacidad = 40;
    }

    public Tanque(int capacidad) { //Constructor para inicializar "capacidad"
        this.capacidad = capacidad;
    }

    public int getCapacidad() { //Getter para retornar el entero
        return capacidad;
    }
}