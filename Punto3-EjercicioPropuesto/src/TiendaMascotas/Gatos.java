package TiendaMascotas;

public class Gatos extends Mascota{
    protected int altura_salto;
    protected int longitud_salto;
    public Gatos(String nombre, int edad, String color, int altura_salto, int longitud_salto) {
        super(nombre, edad, color);
        this.altura_salto = altura_salto;
        this.longitud_salto = longitud_salto;
    }
    public static void sonido() {
        System.out.println("Los gatos maullan y ronrronean");
    }
    void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Color: " + color);
        System.out.println("Altura de salto: " + altura_salto);
        System.out.println("Longitud de salto: " + longitud_salto);
    }
}
