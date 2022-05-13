public class Rueda { //clase del contexto

    //Atributos
    private String fabricante;
    private int aro;
    private double ancho;


    public Rueda(String fabricante, int aro, double ancho) { //Al no tener Setter se debe crear el constructor con los 3 datos
        this.fabricante = fabricante;
        this.aro = aro;
        this.ancho = ancho;
    }

    //Getter para fabricante
    public String getFabricante() {
        return fabricante;
    }

    //Getter para aro
    public int getAro() {
        return aro;
    }

    //Getter para ancho
    public double getAncho() {
        return ancho;
    }

}