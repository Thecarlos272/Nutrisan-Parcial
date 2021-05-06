package pe.edu.upc.pandemia.entities;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="paciente")
public class Paciente {
    @Id
    @Column(name="paciente_dni",columnDefinition = "NUMERIC(9)", nullable=false)
    private Integer dni;

    @Column(name="paciente_password", length=60)
    private String password;

    @Column(name="paciente_nombre", length=30)
    private String nombre;

    @Column(name="paciente_apellido", length=30)
    private String apellido;

    @Column(name="paciente_email", length=60)
    private String email;

   


	public Paciente() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Paciente(Integer dni, String password, String nombre, String apellido, String email, List<Citas> cita_id) {
		super();
		this.dni = dni;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}


	public Integer getDni() {
		return dni;
	}


	public void setDni(Integer dni) {
		this.dni = dni;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

}
    
    
    