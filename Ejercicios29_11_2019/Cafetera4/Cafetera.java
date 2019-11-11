package Ejercicios29_11_2019.Cafetera4;

public class Cafetera {
	private int capacidadMaxima,capacidadActual;
	
	Cafetera (){
		this.capacidadActual= 0;
		this.capacidadMaxima= 1000;
	}
	Cafetera (int capacidadActual){
		this.capacidadActual=capacidadActual;
	}
	Cafetera (int capacidadMaxima, int capacidadActual){
		this.capacidadActual=capacidadActual;
		this.capacidadMaxima=capacidadMaxima;
		if (capacidadActual > capacidadMaxima) {
			capacidadActual=capacidadMaxima;
		}
	}
	public void llenarCafetera(int capacidadActual) {
		
	}
}
