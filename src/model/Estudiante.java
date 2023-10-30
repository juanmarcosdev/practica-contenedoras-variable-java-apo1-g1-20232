package model;

public class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }

    public String getNombre() {
    	return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
