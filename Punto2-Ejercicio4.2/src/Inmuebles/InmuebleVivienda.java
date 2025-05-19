package Inmuebles;

public class InmuebleVivienda extends Inmueble{
    protected int numhabitaciones;
    protected int numbanos;
    public InmuebleVivienda(int identificador_inmobiliario,int area,String direccion,int numbanos,int numhabitaciones) {
        super(identificador_inmobiliario,area,direccion);
        this.numhabitaciones = numhabitaciones;
        this.numbanos=numbanos;
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Numero de habitaciones: "+numhabitaciones);
        System.out.println("Numero de baños: "+numbanos);
    }
}
