public class Operaciones {
	private float MIC;
	private String complexion;
	public Operaciones () {
		MIC = 0;
		complexion = "";
		
	}
	public float encontrarMIC (Calenadrio persona) {
		MIC = getPesoKilogramos() / getEstaturaCentimetros();
		return MIC;
		
	}
	public String encontrarComplexion () {
		if (MIC > 25) {
			complexion = "Tiene sobrepeso";
			
		}
		if (MIC < 18) {
			complexion = "Tiene deficit de peso";
		}
		if (MIC > 18 && MIC < 25){
			complexion = "Esta en el rango recomendado";
		}
		
		return complexion;
		
	}
	/**
	 * @return the mIC
	 */
	public float getMIC() {
		return MIC;
	}
	/**
	 * @param mIC the mIC to set
	 */
	public void setMIC(float mIC) {
		MIC = mIC;
	}
	

}
