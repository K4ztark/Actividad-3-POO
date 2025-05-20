package Universidad;


public class Prueba {
    public static void main(String[] args) {
            Estudiante estudiante = new Estudiante("Casta", "Calle 123", "Ciencias de la computación", 3);
            estudiante.setsemestre(4);
            System.out.println("Datos del estudiante:");
            System.out.println("Semestre: " + estudiante.getsemestre());
            System.out.println("Dirección: " + estudiante.getdireccion());
            Profesor profesor = new Profesor("Juan", "Calle 456", "Matemáticas", "Planta");
            profesor.setnombre("Pedro");
            profesor.setcategoria("Asistente");
            System.out.println();
            System.out.println("Datos del profesor:");
            System.out.println("Nombre: " + profesor.getnombre());
            System.out.println("Dirección: " + profesor.getdireccion());
    }

    }
