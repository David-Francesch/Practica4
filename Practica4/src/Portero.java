package Practicas3erTri.Practica4.Practica4.src;

public class Portero extends Jugador{
    private int pasesConExito;
    private int balonesRecuperados;
    private int numParadas;

    public Portero(String nombre, int dorsal) {
        super(nombre, dorsal);
        //TODO Auto-generated constructor stub
    }

    public int getBalonesRecuperados() {
        return balonesRecuperados;
    }

    public int getNumParadas() {
        return numParadas;
    }

    public int getPasesConExito() {
        return pasesConExito;
    }

    public void setBalonesRecuperados(int balonesRecuperados) {
        this.balonesRecuperados = balonesRecuperados;
    }

    public void setNumParadas(int numParadas) {
        this.numParadas = numParadas;
    }

    public void setPasesConExito(int pasesConExito) {
        this.pasesConExito = pasesConExito;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "Pases con exito: "+pasesConExito+" Balones recuperados: "+balonesRecuperados+ " Numero de paradas: "+numParadas;
    }
}
