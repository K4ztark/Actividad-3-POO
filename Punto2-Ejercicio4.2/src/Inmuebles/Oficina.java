package Inmuebles;

public class Oficina extends Local{
    protected static double valor_area=3500000;
    protected boolean esgobierno;

    public Oficina(int identificador_inmobiliario,int area, String direccion, tipo tipolocal,boolean esgobierno) {
        super(identificador_inmobiliario, area, direccion, tipolocal);
        this.esgobierno=esgobierno;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Es oficina gubernamental?: "+esgobierno);
        System.out.println();
    }
}
