package TiendaMascotas;

public class PerroMediano extends Perro {
    enum tiporaza{Collie,Dalmata, Bulldog, Galgo, Sabueso}
    protected tiporaza raza;
    public PerroMediano(String nombre,int edad, String color,int peso,boolean muerde,tiporaza raza){
        super(nombre,edad,color,peso,muerde);
        this.raza=raza;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Raza: "+raza);
    }
}
