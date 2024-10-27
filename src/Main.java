public class Main {
    public static void main(String[] args) {
        Mascotas perro = new Mascotas("Salchicha", "Milo", "Negro", 4);
        /*perro.setRaza("Salchicha");
        perro.setNombre("Milo");*/
        //perro.setColor("Negro");
        //perro.setEdad(4);
        System.out.println("perro.detallemasc() = " + perro.detallemasc());
        Mascotas gato = new Mascotas("Siames", "Joaquin", "Cafe", 9);
        //gato.setColor("Cafe");
        //gato.setEdad(9);
        System.out.println("gato.detallemasc() = " + gato.detallemasc());

    }
}