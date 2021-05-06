package pe.edu.upc.pandemia.entities;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class HistorialPlanID implements Serializable{

    private static final long serialVersionUID = 1L;
    private Integer nutricionista;
    private Integer plan;
    private Date fechaInicio;
    public Integer getNutricionista() {
        return nutricionista;
    }
    public void setNutricionista(Integer nutricionista) {
        this.nutricionista = nutricionista;
    }
    //Getters y Setters
    public Integer getPlan() {
        return plan;
    }
    public void setPlan(Integer plan) {
        this.plan = plan;
    }
    public Date getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    //Bobs 

    public HistorialPlanID(Integer nutricionista, Integer plan, Date fechaInicio) {
        super();
        this.nutricionista = nutricionista;
        this.plan = plan;
        this.fechaInicio = fechaInicio;
    }
    public HistorialPlanID() {
        super();
    }

    @Override
    public int hashCode() {
        return Objects.hash(nutricionista, plan, fechaInicio);
    }

    @Override
    public boolean equals(Object obj) {


        if(this == obj)
            return true;

        if(this == null || this.getClass() != obj.getClass())
            return false;

        HistorialPlanID historialPlanID = (HistorialPlanID)obj;

        if(this.nutricionista != historialPlanID.nutricionista)
            return false;
        if(this.plan != historialPlanID.plan)
            return false;
        if(this.fechaInicio != historialPlanID.fechaInicio)
            return false;
        return true;
    }



}