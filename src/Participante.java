
public class Participante {

	// Atributos
	private String nombre;
	private String ususarioGit;
	private String email;
	private boolean trabajador;

	// Constructores
	public Participante() {
		super();
		//TODO implementar
	}
	
	
	public Participante(String nombre, String ususarioGit) {
		super();
		this.nombre = nombre;
		this.ususarioGit = ususarioGit;
		this.email = "";
		this.trabajador=false;
	}

	
	
	// getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsusarioGit() {
		return ususarioGit;
	}

	public void setUsusarioGit(String ususarioGit) {
		this.ususarioGit = ususarioGit;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isTrabajador() {
		return trabajador;
	}

	public void setTrabajador(boolean trabajador) {
		this.trabajador = trabajador;
	}

	// otros metodos

	String getLinkGitHub() {
		return "https://github.com/" + this.ususarioGit;

	}

}
