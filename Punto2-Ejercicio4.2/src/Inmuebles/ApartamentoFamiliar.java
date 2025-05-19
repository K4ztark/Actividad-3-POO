package Inmuebles;

public class ApartamentoFamiliar extends Apartamento{
    protected static double valor_area=2000000;
    protected int administracion;
    public ApartamentoFamiliar(int identificador_inmobiliario,int area, String direccion, int numbanos,int numhabitaciones,int administracion){
        super(identificador_inmobiliario,area,direccion,numbanos,numhabitaciones);
        this.administracion=administracion;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("El valor de la administracion es: "+administracion);
        System.out.println();
    }
}
