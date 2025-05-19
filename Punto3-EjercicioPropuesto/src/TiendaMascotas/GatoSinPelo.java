package TiendaMascotas;

public class GatoSinPelo extends Gatos{
    enum tiporaza{Esfinge,Elfo,Donskoy}
    protected tiporaza raza;
    public GatoSinPelo(String nombre, int edad, String color, int peso,int altura_salto,int longitud_salto,tiporaza raza) {
        super(nombre, edad, color,altura_salto,longitud_salto);
        this.raza = raza;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Raza: "+raza);
    }
}
