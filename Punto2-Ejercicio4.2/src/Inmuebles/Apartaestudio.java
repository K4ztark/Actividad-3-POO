package Inmuebles;

public class Apartaestudio extends Apartamento{
    protected static double valor_area=1500000;
    protected int administracion;
    public Apartaestudio(int identificador_inmobiliario,int area, String direccion, int numbanos,int numhabitaciones){
        super(identificador_inmobiliario,area,direccion,1,1);
    }
    void imprimir(){
        super.imprimir();
        System.out.println();
    }
}
