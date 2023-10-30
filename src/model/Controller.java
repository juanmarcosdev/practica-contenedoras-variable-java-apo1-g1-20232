package model;

import java.util.ArrayList; // import java.util.*;
import model.Estudiante;

public class Controller {

    ArrayList<Estudiante> aula;

    /**
     * Constructor de la clase Controller para inicializar 
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Controller 
     */
    public Controller() {

        aula = new ArrayList<>();
        
    }

    public boolean aulaVacia() {
        return aula.isEmpty();
    }

    public Estudiante crearEstudiante(String nombre) {
        return new Estudiante(nombre);
    }

    public void agregarEstudianteALista(Estudiante estudiante) {
        aula.add(estudiante);
    }

    public int numeroEstudiantes() {
        return aula.size();
    }

    public Estudiante obtenerEstudianteIesimo(int indice) {
        return aula.get(indice);
    }

    public void reemplazarEstudiante(int indice, Estudiante estudiante) {
        aula.set(indice, estudiante);
    }

    public void eliminarEstudianteIesimo(int indice) {
        aula.remove(indice);
    }

    public ArrayList<Estudiante> devolverAula() {
        return aula;
    }

    public String presentarNombreEstudiante(Estudiante estudiante) {
        return estudiante.getNombre();
    }




}
