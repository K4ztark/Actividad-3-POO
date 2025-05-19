package TiendaMascotas;

public class PerroGrande extends Perro{
    enum tiporaza{PastorAleman, Doberman, Rottweiler}
    protected tiporaza raza;
    public PerroGrande(String nombre,int edad, String color,int peso,boolean muerde,tiporaza raza){
        super(nombre,edad,color,peso,muerde);
        this.raza=raza;
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Raza: "+raza);
    }
}
