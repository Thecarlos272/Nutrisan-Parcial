package pe.edu.upc.pandemia.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "HistorialPlan")
@IdClass(HistorialPlanID.class)
public class HistorialPlan {

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "DNI", nullable = false)
    private Nutricionista nutricionista;

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "plan", nullable = false)
    private Plan plan;

    @Id
    @Column(name = "DFechaInicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;

	public Nutricionista getNutricionista() {
		return nutricionista;
	}

	public void setNutricionista(Nutricionista nutricionista) {
		this.nutricionista = nutricionista;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
    
    
}