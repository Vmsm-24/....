public class Mascotas {
    //Atributos o Estados
    private String raza;
    private String nombre;
    private String color;
    private float edad;

    //Constructores y Destructores
    public Mascotas(){

    }

    public Mascotas(String raza) {
        this.raza = raza;
    }

    public Mascotas(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }

    public Mascotas(String raza, String nombre, String color) {
        this.raza = raza;
        this.nombre = nombre;
        this.color = color;
    }

    public Mascotas(String raza, String nombre, String color, float edad) {
        this.raza = raza;
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    //Métodos propios del lenguaje Java
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getEdad() {
        return edad;
    }

    public void setEdad(float edad) {
        this.edad = edad;
    }

    //Métodos propios de programador
    public String detallemasc(){
        String masc = "La raza es -> " + this.raza + "\n" +
                "El nombre es -> " + this.nombre + "\n" +
                "El color es -> " + this.color +"\n" +
                "La edad es -> " + this.edad;
        return masc;

    }


}