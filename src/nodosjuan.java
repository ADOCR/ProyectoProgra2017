 class Nodo{
	
	int f;
	int c;
	char ficha;
	Nodo sig;
	Nodo abaj;

	public Nodo(){//nodo vacido
		this.sig=null;
		this.abaj=null;
	}
	public Nodo(int f, int c, char ficha){//nodo asignando parametros 
		this.f=f;
		this.c=c;
		this.ficha=ficha;
		this.sig = null;
		this.abaj=null;
	}

	public void setFila(int f){
		this.f=f;
	}
	public int getFila(){
		return this.f;
	}

	public void setColumna(int c){
		this.c=c;
	}
	public int getColumna(){
		return this.c;
	}

	public void setFicha(char ficha){
		this.ficha=ficha;
	}
	public int getFicha(){
		return this.ficha;
	}

	public void setSig(Nodo sig){
		this.sig=sig;
	}
	public Nodo getSig(){
		return this.sig;
	}

	public void setAbaj(Nodo abaj){
		this.abaj=abaj;
	}
	public Nodo getAbaj(){
		return this.abaj;
	}

	public void mostrar(){
		System.out.print("["+f +" "+ c +"]"+ ficha+" ");
	}


}