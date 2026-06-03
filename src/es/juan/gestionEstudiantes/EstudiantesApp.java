package es.juan.gestionEstudiantes;

import es.juan.gestionEstudiantes.controlador.EstudianteControlador;
import es.juan.gestionEstudiantes.modelo.EstudianteDAO;
import es.juan.gestionEstudiantes.vista.EstudianteVista;

public class EstudiantesApp {

	public static void main(String[] args) {
		EstudiantesApp app = new EstudiantesApp();
			app.iniciarAplicacion();;
	}
	
	
	private void iniciarAplicacion() {
		EstudianteDAO dao = new EstudianteDAO();
		EstudianteVista vista = new EstudianteVista();
		EstudianteControlador controlador = new EstudianteControlador(dao,vista);
		controlador.iniciar();

}
}