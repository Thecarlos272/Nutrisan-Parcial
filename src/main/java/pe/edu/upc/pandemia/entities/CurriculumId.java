package pe.edu.upc.pandemia.entities;

import java.io.Serializable;

import java.util.Objects;


public class CurriculumId implements Serializable{
	
	private static final long serialVersionUID=1L;
	
    private Integer Nutricionista_Id;
    private Integer Especialidad_Id;
    private Integer GradoAcademico;
    private Integer CasaDeEstudio;

	
    
    public CurriculumId() {
    	super();
    }
    
    public CurriculumId(Integer Nutricionista_Id,Integer Especialidad_Id,Integer GradoAcademico,Integer CasaDeEstudio)
    {
    	super();
    	this.Nutricionista_Id = Nutricionista_Id;
    	this.Especialidad_Id = Especialidad_Id;
    	this.GradoAcademico = GradoAcademico;
    	this.CasaDeEstudio= CasaDeEstudio;
    }
    
  

    
    public Integer getNutricionista_Id() {
		return Nutricionista_Id;
	}

	public void setNutricionista_Id(Integer nutricionista_Id) {
		Nutricionista_Id = nutricionista_Id;
	}

	public Integer getEspecialidad_Id() {
		return Especialidad_Id;
	}

	public void setEspecialidad_Id(Integer especialidad_Id) {
		Especialidad_Id = especialidad_Id;
	}

	public Integer getGradoAcademico() {
		return GradoAcademico;
	}

	public void setGradoAcademico(Integer gradoAcademico) {
		GradoAcademico = gradoAcademico;
	}

	public Integer getCasaDeEstudio() {
		return CasaDeEstudio;
	}

	public void setCasaDeEstudio(Integer casaDeEstudio) {
		CasaDeEstudio = casaDeEstudio;
	}

	@Override
    public int hashCode() {
    	return Objects.hash(Nutricionista_Id,Especialidad_Id,GradoAcademico,CasaDeEstudio);
    }
    
    @Override
    public boolean equals(Object obj) {
    	if(this==obj)
    		return true;
    	if(obj==null||this.getClass()!=obj.getClass())
    		return true;
    	
    	CurriculumId CurriculumId=(CurriculumId)obj;
    	if(this.CasaDeEstudio!=CurriculumId.CasaDeEstudio)
    		return false;
      	if(this.Especialidad_Id!=CurriculumId.Especialidad_Id)
    		return false;
      	if(this.GradoAcademico!=CurriculumId.GradoAcademico)
    		return false;
      	if(this.Nutricionista_Id!=CurriculumId.Nutricionista_Id)
    		return false;
      	return true;
    	
    	
    	
    }
    
}