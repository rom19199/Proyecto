public class Operaciones {
	private float MIC;
	private String complexion;
	public Operaciones () {
		MIC = 0;
		complexion = "";
		
	}
	public float encontrarMIC (Calendario persona) {
		MIC = persona.getPesoKilogramos() / (persona.getEstaturaCentimetros()*persona.getEstaturaCentimetros());
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
	
	public String Dieta() {
		String dieta = "debe consumir un aproximado de 2500 calorias \n al dia en 3 comidas/dia. ";
		return dieta;
	}
	
	public String Ejercicio() {
		String ejercicio = "Se le recomienda los siguientes ejercicios: 5 sets de 20 lagartijas, 5 sets de 20 \n abdomjinales y 5 sets de 20 squats, con un descanso de 10 segundos entre cada sets.";
		return ejercicio;
	}
	

}

	

}
