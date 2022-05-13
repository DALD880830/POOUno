public class Motor { //clase del contexto

    //Atributos
    private double cilindrada;
    private TipoMotor tipo;

    public Motor() { //Creamos un constructor vacio y despues con el set damos los valores
    }

    public Motor(double cilindrada, TipoMotor tipo) { //Constructor para inicializar tanto cilindrada como tipo
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    //Getter and Setter para cilindrada
    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }


    //Getter and Setter para tipo
    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }
}