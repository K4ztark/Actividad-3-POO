package Inmuebles;

public class CasaConjuntoCerrado extends CasaUrbana{
    protected static double valor_area=2500000;
    protected int administracion;
    protected boolean piscina;
    protected boolean camposdeportivos;
    public CasaConjuntoCerrado(int identificador_inbomiliario,int area,String direccion,int numbanos,int numhabitaciones, int numPisos,
                               int administracion, boolean piscina, boolean camposdeportivos) {
        super(identificador_inbomiliario,area,direccion,numbanos,numhabitaciones,numPisos);
        this.administracion=administracion;
        this.piscina=piscina;
        this.camposdeportivos=camposdeportivos;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("El valor de la administracion es: "+administracion);
        System.out.println("Tienes piscina? : "+piscina);
        System.out.println("Tiene campos deportivos?: "+camposdeportivos);
        System.out.println();

    }
}


