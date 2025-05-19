package TiendaMascotas;

public class Perro extends Mascota{
    protected int peso;
    protected boolean muerde;
    public Perro(String nombre, int edad, String color, int peso, boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
    }
    void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Color: " + color);
        System.out.println("Peso: " + peso);
        System.out.println("Muerde: " + muerde);
    }
    public static void sonido(){
        System.out.println("Los perros ladran");
    }
}
