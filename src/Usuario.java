/**
 * 
 */

/**
 * @author raula
 *
 */
public class Usuario {
	private String nombre;
	private String apellido;
	private String usuario;
	private String password;
	private String altura;
	private String peso;
	private String edad;

	/**
	 * 
	 */
	public Usuario() {
		// TODO Auto-generated constructor stub
		nombre = "";
		apellido = "";
		usuario = "";
		password = "";
		altura = "";
		peso = "";
		edad = "";
	}

	/**
	 * @param nombre
	 * @param apellido
	 * @param usuario
	 * @param password
	 * @param altura
	 * @param peso
	 * @param edad
	 */
	public Usuario(String nombre, String apellido, String usuario, String password, String altura, String peso,
			String edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.password = password;
		this.altura = altura;
		this.peso = peso;
		this.edad = edad;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the altura
	 */
	public String getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(String altura) {
		this.altura = altura;
	}

	/**
	 * @return the peso
	 */
	public String getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(String peso) {
		this.peso = peso;
	}

	/**
	 * @return the edad
	 */
	public String getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(String edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return  nombre + ", " + apellido + ", " + usuario + ", " + password + ", " + altura + ", " + peso + ", "
	+ edad;
	}
	
	

}
