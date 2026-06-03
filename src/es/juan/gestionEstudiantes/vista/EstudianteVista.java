package es.juan.gestionEstudiantes.vista;

import java.util.Scanner;
import java.util.List;
import es.juan.gestionEstudiantes.modelo.Estudiante;

public class EstudianteVista {
    private Scanner teclado = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- Menú Estudiantes ---");
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Mostrar todos");
        System.out.println("3. Eliminar estudiante");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
        return teclado.nextInt();
    }

    public String pedirNombre() {
        teclado.nextLine(); // limpiar buffer
        System.out.print("Nombre: ");
        return teclado.nextLine();
    }

    public int pedirEdad() {
        System.out.print("Edad: ");
        return teclado.nextInt();
    }

    public void mostrarListaEstudiantes(List<Estudiante> estudiantes) {
        System.out.println("\n--- Lista de estudiantes ---");
        for (Estudiante estudiante: estudiantes)
        	System.out.println(estudiante.getNombre() + " - " + estudiante.getEdad() + " años");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
