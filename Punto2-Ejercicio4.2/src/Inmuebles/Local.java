package Inmuebles;

public class Local extends Inmueble{
    enum tipo{INTERNO,CALLE};
    protected tipo tipolocal;
    public Local(int identificador_inmobiliario,int area,String direccion,tipo tipolocal) {
        super(identificador_inmobiliario,area,direccion);
        this.tipolocal=tipolocal;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Tipo de local: "+tipolocal);
    }
}
