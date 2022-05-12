public enum Color {
    /*ROJO,
    AMARILLO,
    AZUL,
    BLANCO,
    GRIS,
    NARANJA,
    NEGRO;*/

    ROJO("Rojo"), //Cada color invoca al constructor, y nos da el String
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris"),
    NARANJA("Naranja"),
    NEGRO("Negro");

    private final String color; //Para personalizar mas la clase y que cuando se invoque no solo cuente con el nombre
    //en mayusculas, debemos crear atributo del tipo final usando un String private final, no se puede modificar y es propio de la referencia del enum

    Color(String color) { //Creamos un constructor para pasar el color por argumento y luego asignarlo al atributo
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color; //Esto retorna el valor que tiene el color
    }
}

//Los enumerados se escriben en mayusculas, para mejor practica las constantes se separan en filas, no siempre es
//necesario el ; al final