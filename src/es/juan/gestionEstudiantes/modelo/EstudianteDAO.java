
package es.juan.gestionEstudiantes.modelo;

import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
  
    public void aniadir(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public List<Estudiante> listarTodos() {
        return estudiantes;
    }

    public Estudiante buscarPorNombre(String nombre) {
        for (Estudiante e : estudiantes) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

   
    public boolean eliminarPorNombre(String nombre) {
        // Recorremos la lista de estudiantes usando un índice, de atrás hacia adelante.
        // Recorrer al revés es importante para no tener problemas al eliminar elementos.
        for (int i = estudiantes.size() - 1; i >= 0; i--) {
            Estudiante e = estudiantes.get(i);
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                estudiantes.remove(i);
                return true; // se eliminó correctamente 
            }
        }
        return false; // no se eliminó
    }
    
   /* método equivalente con función lambda 
    * removeIf es un método en Java que elimina todos los elementos de una 
    * colección que cumplan una determinada condición
    public boolean eliminarPorNombre(String nombre) {
        return estudiantes.removeIf(e -> e.getNombre().equalsIgnoreCase(nombre));
    }
    */
}


