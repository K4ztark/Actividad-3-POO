package Universidad;

public class Persona {
    public String nombre;
    public String direccion;

    public Persona(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public String getnombre(){
        return nombre;
    }

    public String getdireccion(){
        return direccion;
    }

    public void setnombre(String nombre){
        this.nombre=nombre;
    }

    public void setdireccion(String direccion){
        this.direccion=direccion;
    }
}
