package Inmuebles;

public class Casa extends InmuebleVivienda{
    protected int numPisos;
    public Casa(int identificador_inmobiliario,int area, String direccion, int numhabitaciones, int numbanos,int numPisos){
        super(identificador_inmobiliario,area,direccion,numhabitaciones,numbanos);
        this.numPisos = numPisos;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("El numero de pisos es: "+numPisos);
    }
}
