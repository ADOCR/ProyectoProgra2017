import java.util.*;
import java.io.*;
public class Registro {
	    public String jugador2;
	    public String jugador1;
	    public int puntuacionP1;
	    public int puntuacionP2;
	    public String dirRegistro;
	    /**\
	     * Gettters y setters que se van a utilizar en la clase actual
	     * parametros de los setters
	     * @param String jugador2;
	     * @param String jugador1;
	     * @param int puntuacionP1;
	     * @param int puntuacionP2;
	     * @param String dirRegistro;
	     * */
		public String getDirRegistro() {
			return dirRegistro;
		}


		public void setDirRegistro(String dirRegistro) {
			this.dirRegistro = dirRegistro;
		}


		public String getJugador2() {
			return jugador2;
		}


		public void setJugador2(String jugador2) {
			this.jugador2 = jugador2;
		}


		public String getJugador1() {
			return jugador1;
		}


		public void setJugador1(String jugador1) {
			this.jugador1 = jugador1;
		}


		public int getPuntuacionP1() {
			return puntuacionP1;
		}


		public void setPuntuacionP1(int puntuacionP1) {
			this.puntuacionP1 = puntuacionP1;
		}


		public int getPuntuacionP2() {
			return puntuacionP2;
		}


		public void setPuntuacionP2(int puntuacionP2) {
			this.puntuacionP2 = puntuacionP2;
		}


		/**
		 * Este metodo, guarda en un archivo los datos de los jugadores
		 * y dependiendo su puntaje toma la decision de que dato guardar en el archivo.
		 * @param jugador1
		 * @param jugador2
		 * @param puntuacionP1
		 * @param puntuacionP2
		 * @author adonis
		 * @version (13/11/17)
		 *  
		 */
	    public void archGanadores(String jugador1,String jugador2, int puntuacionP1, int
	    		puntuacionP2) throws IOException{
	    	String cadena=" ";
			cadena = String.valueOf(puntuacionP1);

	        File d =new File( "Datos.txt" );
			FileWriter datos=new FileWriter(d);
			
			/*
			 * Se toma la decision de cual nombre agregar segun la puntuacion de cada jugador
			 * 
			 * */
			
			if(puntuacionP1>puntuacionP2){
				// jugador1
				for(int i=0;i<jugador1.length();i++) { 
					datos.write(jugador1.charAt(i));
				}
				
				datos.write("\n");
				// puntuacion1
				for(int i=cadena.length()-1;i>=0;i--) {
					datos.write(cadena.charAt(i));
				}
			}else if(puntuacionP1<puntuacionP2){
				// jugador2
				// nombre2
	        for(int i=0;i<jugador2.length();i++) {
	        	datos.write(jugador2.charAt(i));
	        }
	        
	        datos.write("\n");
	        
	        // puntuacion2
	        cadena = String.valueOf(puntuacionP2);
	        
	        for(int i=cadena.length()-1;i>=0;i--) {
	        	datos.write(cadena.charAt(i));
	        }
			}else if(puntuacionP1==puntuacionP2){
				cadena="Empate";
				for(int i=cadena.length()-1;i>=0;i--) {
					datos.write(cadena.charAt(i));
				}
			}
			datos.close();


		}
	    /**
	     * Este metodo permite el registro de los jugadores.
	     * */
	    public void registrarse() {
	    	
	    	
	    	System.out.println("Digite el nombre del Jugador 1" );  
	    	jugador1 = Lee.cadena();
	    	System.out.println("Digite el nombre del jugar 2");

	        jugador2=Lee.cadena();
	        
	    }
	    /**
	     * Permite la lectura de los archivos con el nombre que el metodo recibe como
	     * parametro tipo String
	     * @param String dirRegistro
	     * */
	    public void registroNods() {
	    	int r=0;
	    }
	    /**
	     * Este metodo se encarga de el menu y el procedimiento general del proyecto.
	     * */
	    public void menu() throws IOException {
			int op;
			do{
				
				System.out.println(" ___________________________________________________________");
				System.out.println("|_________________________Bienvenido________________________|");
				System.out.println("|||||||||||||||||||||||||||| al |||||||||||||||||||||||||||||"); //Menu de bienvenida
				System.out.println("|                         Conecta4                          |");
				System.out.println("|   Por Favor:                                              |");
				System.out.println("|   Digite 1:----------    Para registrarse                 |"); //se dicen las opciones del trabajo
				System.out.println("|   Digite 2:----------    Leer las instrucciones de uso.    |");
				System.out.println("|   Digite 3:----------    Para jugar                       |");
				System.out.println("|   Digite 3:----------    Para ver mejores puntuaciones    |");
				System.out.println("|   Digite 5:----------    Nose sabe aun                    |");
				System.out.println("|   Digite 6:----------  Limpiar pantalla.                  |");//opcion que limpia la pantalla de procedimientos anteriores dejando solo el menu.
				System.out.println("|   Digite 0-----------  Para Salir.                        |");
				System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
				System.out.println("|___________________________________________________________|");
				System.out.print("Digite su opcion : ");
				
				op = Lee.numeroE();
				switch (op) {
					case 1:
						System.out.println("En desarrollo");
						break;
					case 2:
							registrarse();
							break;
					case 3:
						System.out.println("En desarrollo");
						break;
					case 4:
						System.out.println("En desarrollo");
						break;
					case 5:
						System.out.println("En desarrollo");
						break;
					case 6:
						System.out.println("En desarrollo");
						break;
					default:
						System.out.println("Digite una opcion valida");
						break;
				}
			} while (op != 0);
			System.out.println("Cerrando: Esperamos que se haya divertido");
		}	    
	    
	    public static void main(String[] args)throws IOException {
	       Registro mari =new Registro();
	       mari.registrarse();
	       System.out.println();
	    }
}
