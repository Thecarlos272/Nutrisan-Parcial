package pe.edu.upc.nutrisan.models.entities;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import java.util.List;


@Entity
@Table(name = "Nutricionistas",indexes = {@Index(columnList = "Apellido,Nombre",name = "Nutricionista_index_apellido_nombre")},
uniqueConstraints = {@UniqueConstraint(columnNames = {"Email"})})
public class Nutricionista {

    @Id
    @Column(name = "DNI", columnDefinition = "NUMERIC(9)")
    private Integer dni;

    @Column(name = "password", length = 20, nullable = false)
    private String password;

    @Column(name = "Nombre", length = 30, nullable = false)
    private String nombre;

    @Column(name = "Apellido", length = 30 , nullable = false)
    private String apellido;

    @Column(name = "NumTelefono", length = 20, nullable = false)
    private Integer numTelefono;

    @Column(name = "Email", length = 50, nullable = false)
    private String email;

    @Column(name = "Date_Registro", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateRegistro;

    @Column(name = "Puntuacion", length = 1)
    private int puntuacion;

    @ManyToOne(fetch = FetchType.EAGER)
    private Curriculum curriculum;
  
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Horario horario;

    @OneToMany(mappedBy = "nutricionista", fetch = FetchType.LAZY)
    private List<HistorialPlan> historialPlan;
    
    
    public Nutricionista() {
    	historialPlan= new ArrayList<HistorialPlan>();
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


	public Date getDateRegistro() {
		return dateRegistro;
	}


	public void setDateRegistro(Date dateRegistro) {
		this.dateRegistro = dateRegistro;
	}


	public int getPuntuacion() {
		return puntuacion;
	}


	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}


	public Curriculum getCurriculum() {
		return curriculum;
	}


	public void setCurriculum(Curriculum curriculum) {
		this.curriculum = curriculum;
	}


	public Horario getHorario() {
		return horario;
	}


	public void setHorario(Horario horario) {
		this.horario = horario;
	}


	public List<HistorialPlan> getHistorialPlan() {
		return historialPlan;
	}


	public void setHistorialPlan(List<HistorialPlan> historialPlan) {
		this.historialPlan = historialPlan;
	}
    
    
}