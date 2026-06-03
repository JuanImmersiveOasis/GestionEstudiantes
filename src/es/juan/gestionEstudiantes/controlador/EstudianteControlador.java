package es.juan.gestionEstudiantes.controlador;

import es.juan.gestionEstudiantes.controlador.*;
import es.juan.gestionEstudiantes.modelo.Estudiante;
import es.juan.gestionEstudiantes.modelo.EstudianteDAO;
import es.juan.gestionEstudiantes.vista.EstudianteVista;

public class EstudianteControlador {
    private EstudianteDAO dao;
    private EstudianteVista vista;

    public EstudianteControlador(EstudianteDAO dao, EstudianteVista vista) {
        this.dao = dao;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1 -> {
                    String nombre = vista.pedirNombre();
                    int edad = vista.pedirEdad();
                    dao.aniadir(new Estudiante(nombre, edad));
                    vista.mostrarMensaje("Estudiante agregado.");
                }
                case 2 -> vista.mostrarListaEstudiantes(dao.listarTodos());
                case 3 -> {
                    String nombre = vista.pedirNombre();
                    if (dao.eliminarPorNombre(nombre)) {
                        vista.mostrarMensaje("Estudiante eliminado.");
                    } else {
                        vista.mostrarMensaje("No encontrado.");
                    }
                }
                case 4 -> vista.mostrarMensaje("Saliendo...");
                default -> vista.mostrarMensaje("Opción no válida.");
            }
        } while (opcion != 4);
    }
}
