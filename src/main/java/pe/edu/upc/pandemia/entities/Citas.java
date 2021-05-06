package pe.edu.upc.pandemia.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="Citas")
@SequenceGenerator(name="getCitas",initialValue = 1,allocationSize = 1)
public class Citas {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "getCitas")
  @Column(name="id",columnDefinition = "NUMERIC(10)",nullable = false)
 
  private Integer cita_id;

 

  @ManyToOne(fetch=FetchType.LAZY)
  @JoinColumn(name = "nutricionista_id", nullable = false)
  private Nutricionista nutricionista_Id;



  @ManyToOne(fetch=FetchType.LAZY)
  @JoinColumn(name = "paciente_id", nullable = false)
  private Paciente paciente_Id;

  @Column(name="date",nullable = false)
  private Date fecha;

  @Column(name="trecomendacion",length=255,nullable = false)
  private String recomendacion;

  @ManyToOne(fetch=FetchType.LAZY)
  @JoinColumn(name = "hora_inicio", nullable = false)

  private Horario hora_Inicio;

  @ManyToOne(fetch=FetchType.LAZY)
  @JoinColumn(name="hora_fin",nullable = false)
  private Horario hora_fin;
  

public Integer getCita_id() {
	return cita_id;
}

public void setCita_id(Integer cita_id) {
	this.cita_id = cita_id;
}

public Nutricionista getNutricionista_Id() {
	return nutricionista_Id;
}

public void setNutricionista_Id(Nutricionista nutricionista_Id) {
	this.nutricionista_Id = nutricionista_Id;
}

public Paciente getPaciente_Id() {
	return paciente_Id;
}

public void setPaciente_Id(Paciente paciente_Id) {
	this.paciente_Id = paciente_Id;
}

public Date getFecha() {
	return fecha;
}

public void setFecha(Date fecha) {
	this.fecha = fecha;
}

public String getRecomendacion() {
	return recomendacion;
}

public void setRecomendacion(String recomendacion) {
	this.recomendacion = recomendacion;
}

public Horario getHora_Inicio() {
	return hora_Inicio;
}

public void setHora_Inicio(Horario hora_Inicio) {
	this.hora_Inicio = hora_Inicio;
}

public Horario getHora_fin() {
	return hora_fin;
}

public void setHora_fin(Horario hora_fin) {
	this.hora_fin = hora_fin;
}


 



  
  
}