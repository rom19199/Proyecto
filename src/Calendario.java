public class Calendario {
	private String Usuario;
	private String Password;
	private String Nombre;
	private String Apellido;
	private int Edad;
	private float EstaturaCentimetros;
	private float PesoKilogramos;
	private String ActividadFisica;
	public Calendario () {
		Usuario = "";
		Apellido = "";
		Password = "";
		Nombre = "";
		Edad = 0;
		EstaturaCentimetros = 0;
		PesoKilogramos = 0;
		ActividadFisica = "";
		
	}
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return Usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return Edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		Edad = edad;
	}
	/**
	 * @return the estaturaCentimetros
	 */
	public float getEstaturaCentimetros() {
		return EstaturaCentimetros;
	}
	/**
	 * @param estaturaCentimetros the estaturaCentimetros to set
	 */
	public void setEstaturaCentimetros(float estaturaCentimetros) {
		EstaturaCentimetros = estaturaCentimetros;
	}
	/**
	 * @return the pesoKilogramos
	 */
	public float getPesoKilogramos() {
		return PesoKilogramos;
	}
	/**
	 * @param pesoKilogramos the pesoKilogramos to set
	 */
	public void setPesoKilogramos(float pesoKilogramos) {
		PesoKilogramos = pesoKilogramos;
	}
	/**
	 * @return the actividadFisica
	 */
	public String getActividadFisica() {
		return ActividadFisica;
	}
	/**
	 * @param actividadFisica the actividadFisica to set
	 */
	public void setActividadFisica(String actividadFisica) {
		ActividadFisica = actividadFisica;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return Apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	

}
