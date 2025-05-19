package TiendaMascotas;

public class GatosPeloLargo extends Gatos{
    enum tiporaza{Angora,Himalayo,Balines,Somali}
    protected tiporaza raza;
    public GatosPeloLargo(String nombre, int edad, String color,int altura_salto,int longitud_salto,tiporaza raza) {
        super(nombre, edad, color,altura_salto,longitud_salto);
        this.raza = raza;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Raza: "+raza);
    }
}
