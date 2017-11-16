
public class NodoR {
	private int puntuacion;
    private String jugador;
     NodoR sig; //nos indica cual es la posicion del nodo.

    public NodoR(){
        this.sig=null; // asi se inicializa el atributo del nodo
    }
    public NodoR(int puntuacion,String jugador){
        this.puntuacion=puntuacion;
        this.jugador=jugador;
        this.sig=null;
    }
  
    public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	public String getJugador() {
		return jugador;
	}
	public void setJugador(String jugador) {
		this.jugador = jugador;
	}
	/**
     * este metodo muestra lo que posee la clase
     */
    public void mostrar(){ 
        System.out.println("Cedula "+this.puntuacion+"\n nombre "+this.jugador);
    }
}
