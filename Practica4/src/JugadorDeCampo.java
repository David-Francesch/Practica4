package Practicas3erTri.Practica4.Practica4.src;

public class JugadorDeCampo extends Jugador{
    private boolean atacante = false;
    private int pasesConExito;
    private int balonesRecuperados;

    public JugadorDeCampo(String nombre, int dorsal, boolean atacante) {
        super(nombre, dorsal);
        this.atacante = atacante;
    }

    // public JugadorDeCampo(String nombre, int dorsal) {
    //     super(nombre, dorsal);
    //     this.atacante = false;
    // }

    public int getBalonesRecuperados() {
        return balonesRecuperados;
    }

    public int getPasesConExito() {
        return pasesConExito;
    }

    public void setAtacante(boolean atacante) {
        this.atacante = true;
    }

    public void setBalonesRecuperados(int balonesRecuperados) {
        this.balonesRecuperados = balonesRecuperados;
    }

    public void setPasesConExito(int pasesConExito) {
        this.pasesConExito = pasesConExito;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+ "Pases con exito: "+pasesConExito+" Balones recuperados: "+balonesRecuperados;
    }

}
