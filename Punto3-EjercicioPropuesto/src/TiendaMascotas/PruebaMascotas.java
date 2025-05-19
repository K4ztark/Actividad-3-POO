package TiendaMascotas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PruebaMascotas {
    public static void main(String[] args) {
        PerroPequeno perro1=new PerroPequeno("Lolo", 2, "Negro", 5, true, PerroPequeno.tiporaza.Caniche);
        System.out.println("Perro 1");
        perro1.imprimir();
        perro1.sonido();
        System.out.println();
        PerroGrande perro2=new PerroGrande("Rocco", 3, "Marron", 20, true, PerroGrande.tiporaza.Doberman);
        System.out.println("Perro 2");
        perro2.imprimir();
        perro2.sonido();
        System.out.println();
        GatosPeloLargo gato1=new GatosPeloLargo("Hugod", 1, "Blanco", 2, 3, GatosPeloLargo.tiporaza.Himalayo);
        System.out.println("Gato 1");
        gato1.imprimir();
        gato1.sonido();
        System.out.println();
        GatosPeloCorto gato2=new GatosPeloCorto("Mimi", 4, "Naranja", 1, 2, GatosPeloCorto.tiporaza.Britanico);
        System.out.println("Gato 2");
        gato2.imprimir();
        gato2.sonido();
    }
}