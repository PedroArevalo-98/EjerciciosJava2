package EjercicioNumeroEntero;

public class NumeroEntero {

		private int numero;
		
NumeroEntero (){
	
}
NumeroEntero (int numero){
	this.numero=numero;
}
public void aniade (int sumador) {
	numero=numero+sumador;
}
public void restarNumero (int restador) {
	numero=numero-restador;
}
public int getValor() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public int getDoble() {
	return numero*2;
}
public int getTriple() {
	return numero*3;
}
}