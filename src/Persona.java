public class Persona { //clase del contexto

    //Atributos
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) { //Constructor para la asignacion de nombre y apellido
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() { //Mostramos el nombre y apellido mediante toString
        return nombre + " " + apellido;
    }
}