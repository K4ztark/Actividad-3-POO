package Inmuebles;

public class CasaRural extends Casa{
    protected static double valor_area=1500000;
    protected int distanciaCabecera;
    protected int altitud;
    public CasaRural(int identificador_inmobiliario,int area,String direccion,int numbanos,int numhabitaciones,int numPisos,int distanciaCabecera,int altitud){
        super(identificador_inmobiliario,area,direccion,numbanos,numhabitaciones,numPisos);
        this.distanciaCabecera=distanciaCabecera;
        this.altitud=altitud;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Distancia de la cabecera municipal= "+distanciaCabecera+"km");
        System.out.println("Altitud sobre el nivel del mar: "+altitud+" metros");
        System.out.println();
    }
}
