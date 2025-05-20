package Universidad;

public class Profesor extends Persona{
    public String depto;
    public String categoria;

    public Profesor(String nombre, String direccion, String depto, String categoria){
        super(nombre, direccion);
        this.depto=depto;
        this.categoria=categoria;
    }
    public String getdepto(){
        return depto;
    }
    public String getcategoria(){
        return categoria;
    }
    public void setdepto(String departamento){
        this.depto=departamento;
    }
    public void setcategoria(String categoria){
        this.categoria=categoria;
    }
}
