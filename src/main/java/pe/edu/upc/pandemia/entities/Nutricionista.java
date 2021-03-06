package pe.edu.upc.pandemia.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nutricionista")
public class Nutricionista {

	@Id
	@Column(name = "DNI")
	private Integer dni;

	@Column(name = "Nombre", length = 30, nullable = false)
	private String nombre;

	// Recien agregado
	@Column(name = "apellido", length = 30, nullable = false)
	private String apellido;

	@Column(name = "password", length = 20, nullable = false)
	private String password;

	@Column(name = "numTelefono", length = 20, nullable = false)
	private Integer numTelefono;

	@Column(name = "email", length = 50, nullable = false)
	private String email;

	@Column(name = "puntuacion", length = 1)
	private int puntuacion;

	// Cons, get y set

	public Nutricionista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nutricionista(Integer dni, String nombre, String apellido, String password, Integer numTelefono,
			String email, int puntuacion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.numTelefono = numTelefono;
		this.email = email;
		this.puntuacion = puntuacion;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(Integer numTelefono) {
		this.numTelefono = numTelefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

}
