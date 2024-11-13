package ui;

import java.util.*;
import model.Controller;


public class Executable {

    private Scanner reader;
    private Controller cont;

    /**
     * Constructor de la clase Executable para inicializar el lector de entrada y el
     * controlador.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Executable y se inicializan el lector de
     *       entrada y el controlador.
     */
    public Executable() {
        reader = new Scanner(System.in);
        cont = new Controller();
    }

    /**
     * Ejecuta el programa principal de gestión de colegios.
     *
     * @pre El método debe ser llamado dentro de un contexto válido.
     * @post El programa se ejecuta y permite al usuario interactuar con las
     *       opciones disponibles.
     * @return void Este método no retorna ningún valor.
     */

    public void run() {


        // System.out.println(cont.aulaVacia());
        cont.agregarEstudianteALista(cont.crearEstudiante("Juan Pablo Arevalo"));
        // System.out.println(cont.aulaVacia());
        cont.agregarEstudianteALista(cont.crearEstudiante("Fredy Cifuentes"));
        // System.out.println(cont.numeroEstudiantes());
        cont.reemplazarEstudiante(1, cont.crearEstudiante("Jhoan Manuel Tovar"));
        cont.agregarEstudianteALista(cont.crearEstudiante("Juan Pablo Pino"));
        cont.agregarEstudianteALista(cont.crearEstudiante("Camilo Cantillo"));

        ArrayList <String> saludos = new ArrayList<String>();
        for(int i = 0; i < cont.numeroEstudiantes(); i++) {
            saludos.add(cont.presentarNombreEstudiante(cont.devolverAula().get(i)));
        }

        for(String elemento : saludos) {
            System.out.println(elemento);
        }
    }

    /**
     * Método principal (main) para iniciar la ejecución del programa.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Executable y se ejecuta el programa principal.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este
     *             caso).
     */
    public static void main(String[] args) {

        Executable mainApp = new Executable();
        mainApp.run();

    }

}