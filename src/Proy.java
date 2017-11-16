public  class Proy{
	Nodo primero;
	Nodo segundo;
	Nodo tercero;
	Nodo cuarto;
	Nodo quinto;
	Nodo sexto;

	public Proy(){
		primero=null;
	}

	public void insertar(int f, int c, char ficha ){//crea nuevo nodo en memo y ubiva en 1 posision de lista 
		Nodo nuevo =new Nodo(f, c, ficha );
		nuevo.sig=primero;
		primero=nuevo;
	}

	public void crearsig(int f, int c, char ficha ){//crea nuevo nodo en memo y ubiva en 1 posision de lista 
		Nodo nuevo =new Nodo(f, c, ficha );
		Nodo aux = primero;

		if (primero==null) {
 			insertar(f, c, ficha );
 			}else {
 				while(true){
 					if (aux.sig==null) {
 					aux.sig=nuevo;
 					break;
 			}
 			aux=aux.sig;
 			}
 		}
		
	}


	

	public void imprimirLista(){// todo esta en una lista rectas enlasada imprme cuando solo el ultimo esta en null
		Nodo aux= primero;

		int i=2 ;
		while (aux!=null) {
			if(aux.getColumna()!=8){
				if (aux.getFila()==i && aux.getColumna()==1) {
					i++;
					System.out.println(" ");
				}
				aux.mostrar();
			}
			aux=aux.sig;
		}
		System.out.println("Fin de lista");
	}
/**
*Metodo de crear nodos con parametros i,j para identificarlos 
*
*/	
	public void crearnodo7(){
		int i=1;
		int j=1;
		while(i!=6){
			while (j!=8) {//crea 7 nodos [1,x<8] en columna
				crearsig(i,j,' ');
				j++;
			}
			i++;
			j=1;

			while (j!=8) {//crea 7 nodos [i<7,j<8] en fila aumenta
				crearsig(i,j,' ');
				j++;
			}
		}
	}

/**
*metodo que la lista enlasada simple que creamos la enlazamos en matriz a mano 
*/
	public void separar(){
		Nodo aux= primero;
		int i=1 ;

		while (aux!=null) {
			if(aux.getColumna()==7){
					if (aux.getFila()==1) {
						segundo=aux.sig;//separo 
						primero.abaj=segundo;//1col
						primero.sig.abaj=segundo.sig;//2col
						primero.sig.sig.abaj=segundo.sig.sig;//3col
						primero.sig.sig.sig.abaj=segundo.sig.sig.sig;//4col
						primero.sig.sig.sig.sig.abaj=segundo.sig.sig.sig.sig;//5col
						primero.sig.sig.sig.sig.sig.abaj=segundo.sig.sig.sig.sig.sig;//6col
						primero.sig.sig.sig.sig.sig.sig.abaj=segundo.sig.sig.sig.sig.sig.sig;//7col					
						i++;

					}else if (aux.getFila()==2) {
						tercero=aux.sig;//enlaso 3
						segundo.abaj=tercero;//1col
						segundo.sig.abaj=tercero.sig;//2col
						segundo.sig.sig.abaj=tercero.sig.sig;//3col
						segundo.sig.sig.sig.abaj=tercero.sig.sig.sig;//4col
						segundo.sig.sig.sig.sig.abaj=tercero.sig.sig.sig.sig;//5col
						segundo.sig.sig.sig.sig.sig.abaj=tercero.sig.sig.sig.sig.sig;//6col
						segundo.sig.sig.sig.sig.sig.sig.abaj=tercero.sig.sig.sig.sig.sig.sig;//7col
						i++;

					}else if (aux.getFila()==3) {
						cuarto=aux.sig;//separo
						tercero.abaj=cuarto;//1col
						tercero.sig.abaj=cuarto.sig;//2col
						tercero.sig.sig.abaj=cuarto.sig.sig;//3col
						tercero.sig.sig.sig.abaj=cuarto.sig.sig.sig;//4col
						tercero.sig.sig.sig.sig.abaj=cuarto.sig.sig.sig.sig;//5col
						tercero.sig.sig.sig.sig.sig.abaj=cuarto.sig.sig.sig.sig.sig;//6col
						tercero.sig.sig.sig.sig.sig.sig.abaj=cuarto.sig.sig.sig.sig.sig.sig;//7col
						i++;

					}else if (aux.getFila()==4) {
						quinto=aux.sig;//separo
						cuarto.abaj=quinto;//1col
						cuarto.sig.abaj=quinto.sig;//2col
						cuarto.sig.sig.abaj=quinto.sig.sig;//3col
						cuarto.sig.sig.sig.abaj=quinto.sig.sig.sig;//4col
						cuarto.sig.sig.sig.sig.abaj=quinto.sig.sig.sig.sig;//5colh
						cuarto.sig.sig.sig.sig.sig.abaj=quinto.sig.sig.sig.sig.sig;//6colh
						cuarto.sig.sig.sig.sig.sig.sig.abaj=quinto.sig.sig.sig.sig.sig.sig;//7colh
						i++;

					}else if(aux.getFila()==5) {
						sexto=aux.sig;//separa
						quinto.abaj=sexto;//1 col
						quinto.sig.abaj=sexto.sig;//2col
						quinto.sig.sig.abaj=sexto.sig.sig;//3col
						quinto.sig.sig.sig.abaj=sexto.sig.sig.sig;//4col
						quinto.sig.sig.sig.sig.abaj=sexto.sig.sig.sig.sig;//5col
						quinto.sig.sig.sig.sig.sig.abaj=sexto.sig.sig.sig.sig.sig;//6col
						quinto.sig.sig.sig.sig.sig.sig.abaj=sexto.sig.sig.sig.sig.sig.sig;//7col
						i++;

					}else if(aux.getFila()==6){
						sexto.abaj=null;//1col 
						sexto.sig.abaj=null;//2 col
						sexto.sig.sig.abaj=null;//3col
						sexto.sig.sig.sig.abaj=null;//4col
						sexto.sig.sig.sig.sig.abaj=null;//5col
						sexto.sig.sig.sig.sig.sig.abaj=null;//6col
						sexto.sig.sig.sig.sig.sig.sig.abaj=null;//7col
						i++;
					}
			}
			aux=aux.sig;
			}
			primero.sig.sig.sig.sig.sig.sig.sig=null;
			segundo.sig.sig.sig.sig.sig.sig.sig=null;
			tercero.sig.sig.sig.sig.sig.sig.sig=null;
			cuarto.sig.sig.sig.sig.sig.sig.sig=null;
			quinto.sig.sig.sig.sig.sig.sig.sig=null;		
		}

	public void imprimirEspesifico(){// todo esta en una lista rectas enlasada primero segun tercer....
		Nodo aux= sexto;
		int i=2 ;
		while (aux!=null) {
				aux.mostrar();
			aux=aux.sig;
		}	
	}

	public void imprimir1columna(){// primera colum hacia abajo 
		Nodo aux= primero.sig.sig.sig.sig.sig.sig;
		int i=2 ;
		while (aux!=null) {
				aux.mostrar();
			aux=aux.abaj;
		}	
	}

	public void agregarF(int col, char ficha){
		Nodo aux= primero;
		while (aux!=null) {
			if (aux.getColumna()==col) {// se ubica en la columna 
				Nodo aux1 =aux;
				while (aux1!=null) {// recorre hacia abajo 
					if (aux1.getFila()==1&&aux1.getFicha()!=' ') {// poner otra condicion que deje repetir otra ficga
						System.out.println(" se lleno elija otra comul ");
						agregarF(1, 'A');
						return;

					}else if (aux1.abaj==null && aux1.getFicha()==' ') {
						aux1.setFicha(ficha);
						return;	

					}else if (aux1.getFicha()==' '&& aux1.abaj.getFicha()!=' ' ) {
						aux1.setFicha(ficha);
						return;	

					}
					aux1=aux1.abaj;
				}
			}
			aux=aux.sig;
		}
	}

	public void imprimirbien(){
		Nodo aux=primero;
		Nodo aux1=aux;
		int i=2 ;

		while (aux1!=null) {
			while (aux!=null) {
				aux.mostrar();
			aux=aux.sig;
			}
		System.out.println(" ");
		aux1=aux1.abaj;
		aux=aux1;
		}		
	} 



public static void main(String[] args) {
		Proy objeto = new Proy();

		objeto.crearnodo7();
		objeto.separar();

	//	objeto.imprimirLista(); esta ya no sirbe porque apunta anull
	//objeto.imprimirbien(); imptime bien depues de referenciar a null

		objeto.imprimirbien();
		objeto.agregarF(2, 'A');
		objeto.agregarF(2, 'A');
		objeto.agregarF(2, 'A');
		objeto.agregarF(2, 'A');
		objeto.agregarF(2, 'A');
		objeto.agregarF(2, 'A');
		objeto.agregarF(2, 'R');

		//objeto.agregarF(2, 'P');
		//objeto.agregarF(7, 'R');

		System.out.println(" imprimirbien");
		objeto.imprimirbien();
		System.out.println(" ");		
	}	

}

