package tp1;

public class Ejercicio1 {

	public static void imprimirRecursivoInverso(int [] elementos){
	
		int pos = elementos.length - 1;
		this.imprimirRecursivoInversoPrivado(elementos, pos);
	}

	private void imprimirRecursivoInversoPrivado(int [] elementos, int pos) { 
	//verificar la validez de la posición antes del llamado recursivo
	//imprimir el dato si la posición es válida
	//si es una posición válida, llamar recursivamente, decrementando la posición en 1 
	System.out.println(elementos[pos]);
	if(pos > 0) {
		this.imprimirRecursivoInversoPrivado(elementos, pos-1);
	}
	
	
	 }
			
	
}


	public static void main(String [] args){
		Ejercicio1 ej = new Ejercicio1();
		 
	
}
