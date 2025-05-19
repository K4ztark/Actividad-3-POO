package TiendaMascotas;

public class GatosPeloCorto extends Gatos{
    enum tiporaza{AzulRuso,Britanico,Manx,DevonRex}
    protected tiporaza raza;
    public GatosPeloCorto(String nombre, int edad, String color,int altura_salto,int longitud_salto,tiporaza raza) {
        super(nombre, edad, color,altura_salto,longitud_salto);
        this.raza = raza;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Raza: "+raza);
    }
}
