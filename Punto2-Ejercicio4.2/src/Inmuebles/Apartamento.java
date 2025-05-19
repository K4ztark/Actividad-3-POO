package Inmuebles;

public class Apartamento extends InmuebleVivienda {
    public Apartamento(int identificador_inmobiliario,int area,String direccion,int numbanos,int numhabitaciones){
        super(identificador_inmobiliario,area,direccion,numbanos,numhabitaciones);
    }
    void imprimir(){
        super.imprimir();
    }
}
