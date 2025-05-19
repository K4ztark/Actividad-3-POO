package Inmuebles;

public class Inmueble {
    protected int identificador_inmobiliario;
    protected int area;
    protected String direccion;
    protected double precio_venta;

    public Inmueble(int identificador_inmobiliario, int area, String direccion){
        this.identificador_inmobiliario = identificador_inmobiliario;
        this.area = area;
        this.direccion = direccion;
    }

    double calcularprecioventa(double valor_area){
        return valor_area*area;
    }
    void imprimir(){
        System.out.println("Identificador inbomiliario= " + identificador_inmobiliario);
        System.out.println("Area: " + area);
        System.out.println("Dirección: " + direccion);
        System.out.println("Precio venta= $" + precio_venta);
    }
}
