
public class RegistroNodos {
	 NodoR primero;
	 public RegistroNodos(){
	 primero = null;
	 }
	  public void insertar(int puntuacion, String jugador){
	        NodoR nuevo = new NodoR(puntuacion,jugador);
	        nuevo.sig=primero;
	        primero = nuevo;

	    }
	    public void imprimirLista(){
	     NodoR aux=primero;

	     while(aux!=null){ // mientras el nodo no tenga como referencia a null entra al bucle.
	        aux.mostrar();// muestra el nodo que este tiene una copia
	        aux=aux.sig;/* luego de mostrar el nodo anterior, se ace una copia de proximo nodo
	                        y para proseguir con el ciclo*/
	        }
	    }
	    //-------------------------------------------------------------------
	    
	    /**
	     * Este metodo permite agregar un nodo dependiendo su puntuacion
	     * @param (int) puntuacion
	     * @param (String) jugador
	     * */
	    public void agregar(int puntuacion, String jugador) {
	        NodoR nuevo= new NodoR(puntuacion, jugador );
	        NodoR aux=primero;

	        if(primero==null){
	            insertar(puntuacion,jugador);

	        }else{
	           while(true){
	               if(aux.sig==null&&
	            		   			aux.getPuntuacion()<
	            		   			aux.sig.getPuntuacion()){
	                    aux.sig=nuevo;
	                    break;
	                }
	               aux=aux.sig;
	            }
	            

	        }

	        
	    }
	    //---------------------------------------------------------------------
	    public boolean buscar(int puntuacion,String jugador){
	        NodoR aux=primero;

	        while(aux!=null){
	            

	            if(aux.getPuntuacion() == puntuacion && aux.getJugador().equals(jugador)){
	             return true;
	            }
	            aux=aux.sig;
	        }
	        return false;

	    }
	    /**
	     * Este metodo nos indica en terminal si hay un valor encontrado 
	     * por el metodo buscar.
	     */
	    public void busqueda(int puntuacion,String jugador){
	        if(buscar(puntuacion,jugador)==true){
	            System.out.println("Hay un valor");
	        }else{
	            System.out.println("no hay valor");
	        }
	    }
	    //------------------------------------------------------------------
	    /**
	     * Esta funcion retorna la cantidad de elementos que hay en en la lista.
	     */
	    public int Conta(){
	        NodoR aux=primero;
	        int i=0;
	        while(aux!=null){
	            i++;
	            aux=aux.sig;
	        }
	        return i;
	    }
	    //---------------------------------------------------------------------
	    /**
	     * Este Metodo agrega a el jugador y su puntuacion en una lista de nodos
	     * Segun su puntuacion de la mejor puntuacion a la peor.
	     * */
	    
	    public void insertarOrdenado(int puntuacion, String jugador){
	        
	        if(primero==null){
	            insertar(puntuacion, jugador);
	        }else{
	            if(primero.getPuntuacion()>puntuacion){
	                insertar(puntuacion, jugador);
	            }else{
	                if(primero.sig==null){
	                    agregar(puntuacion, jugador);
	                }else{
	                    NodoR aux=primero.sig;
	                    NodoR nuevo= new NodoR(puntuacion, jugador);
	                    if(primero.sig.getPuntuacion()>puntuacion){
	                        primero.sig=nuevo;
	                        nuevo.sig=aux;
	                    }else{
	                        while(aux.sig!=null){
	                            if(aux.sig==null){
	                                aux.sig=nuevo;
	                            }else{
	                                if(aux.sig.getPuntuacion()>puntuacion){
	                                    nuevo.sig=aux.sig;
	                                    aux.sig=nuevo;
	                                    return;

	                                }else{
	                                    if(aux.sig.getPuntuacion()>puntuacion){
	                                        nuevo.sig=aux.sig;
	                                        aux.sig=nuevo;
	                                        return;
	                                    }
	                                }
	                            }
	                            aux=aux.sig;
	                        }

	                    }
	                }
	            }
	        }

	    }	        
}
