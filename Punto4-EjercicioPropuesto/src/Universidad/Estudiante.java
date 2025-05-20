package Universidad;

public class Estudiante extends Persona{
    public String carrera;
    public int semestre;

    public Estudiante(String nombre, String direccion, String carrera,int semestre){
        super(nombre, direccion);
        this.carrera=carrera;
        this.semestre=semestre;
    }

    public String getcarrera(){
        return carrera;
    }
    public int getsemestre(){
        return semestre;
    }
    public void setcarrera(String carrera){
        this.carrera=carrera;
    }
    public void setsemestre(int semestre){
        this.semestre=semestre;
    }
}
