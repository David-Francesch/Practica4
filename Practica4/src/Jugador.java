package Practicas3erTri.Practica4.Practica4.src;

public abstract class Jugador {
    private String nombre;
    private int dorsal;
    private int valoracion;
    private int numGoles;

    public Jugador(String nombre, int dorsal){}

    public Jugador(String nombre, int dorsal, int numGoles, int valoracion){
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.numGoles = numGoles;
        this.valoracion = valoracion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumGoles(int numGoles) {
        this.numGoles = numGoles;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumGoles() {
        return numGoles;
    }

    public int getValoracion() {
        return valoracion;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Jugador: "+nombre+" Dorsal: "+dorsal+" Goles: "+numGoles+ "Valoracion: "+valoracion;
    }
}
