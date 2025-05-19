package Inmuebles;

public class CasaIndependiente extends CasaUrbana{
    protected static double valor_area=3000000;
    public CasaIndependiente(int identificador_inbomiliario,int area,String direccion,int numbanos,int numhabitaciones, int numPisos) {
        super(identificador_inbomiliario,area,direccion,numbanos,numhabitaciones,numPisos);
    }
    void imprimir(){
        super.imprimir();
        System.out.println();
    }
}
