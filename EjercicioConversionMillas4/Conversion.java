package EjercicioConversionMillas4;

public class Conversion {

	private double valorMilla = 1852;
	
	public double millasAmetro (int millas) {
		return millas * valorMilla;
	}
	public double millasAKilometro (int millas) {
		return (millas * valorMilla)/1000.0; 
	}
}
