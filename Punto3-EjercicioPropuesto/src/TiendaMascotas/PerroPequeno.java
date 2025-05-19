package TiendaMascotas;

public class PerroPequeno extends Perro{
    enum tiporaza{Caniche, Pomerania, Yorkshire,Schnauzer, Chihuahua}
    protected tiporaza raza;
    public PerroPequeno(String nombre, int edad, String color, int peso, boolean muerde, tiporaza raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }
    void imprimir() {
        super.imprimir();
        System.out.println("Raza: " + raza);
    }
}
