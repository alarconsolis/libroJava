package com.ipartek.formacion.javalibro.pojo;
/**
 * Clase para crear canciones
 * 
 * @author Administrador
 *
 */
public class Cancion {
	// Atributos
	
	private String Titulo;
	private String Artista;
	private String Duracion;
	
	// Constructores
	
	public Cancion() {
		super();
		this.Titulo = "";
		this.Artista = "";
		this.Duracion = "";
	}
	
	
	public Cancion(String Titulo, String Artista,String Duracion) {
		super();
		this.Titulo = Titulo;
		this.Artista = Artista;
		this.Duracion = Duracion;
		
	}
	
	
	// getters y setters

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getArtista() {
		return Artista;
	}

	public void setArtista(String artista) {
		Artista = artista;
	}

	public String getDuracion() {
		return Duracion;
	}

	public void setDuracion(String duracion) {
		Duracion = duracion;
	}

	@Override
	public String toString() {
		return "Cancion [Titulo=" + Titulo + ", Artista=" + Artista + ", Duracion=" + Duracion + "]";
	}

}
