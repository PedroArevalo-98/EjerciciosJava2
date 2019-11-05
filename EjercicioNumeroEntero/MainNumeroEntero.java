package EjercicioNumeroEntero;

public class MainNumeroEntero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumeroEntero N1 = new NumeroEntero (8);
		System.out.println(N1.getValor());
		System.out.println(N1.getDoble());
		System.out.println(N1.getTriple());
		N1.aniade(10);
		N1.restarNumero(4);
		System.out.println(N1.getValor());

		System.out.println("valores");
	}

}
