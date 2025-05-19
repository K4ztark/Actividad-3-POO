package Inmuebles;

public class LocalComercial extends Local{
    protected static double valor_area=3000000;
    protected String centrocomercial;

    public LocalComercial(int identificador_inmobiliario,int area, String direccion, tipo tipolocal,String centrocomercial ) {
        super(identificador_inmobiliario, area, direccion, tipolocal);
        this.centrocomercial=centrocomercial;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Centro comercial: "+centrocomercial);
        System.out.println();
    }
}
