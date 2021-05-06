package pe.edu.upc.pandemia.entities;


import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;


@Entity
@Table(name="Curriculum")
@IdClass(CurriculumId.class)
public class Curriculum {

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Nutricionista_Id",nullable = false)
    private Nutricionista Nutricionista_Id;

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Especialidad_Id",nullable = false)
    private Especialidad Especialidad_Id;

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="GradoAcademico",nullable = false)
    private GradoAcademico GradoAcademico;

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="CasaDeEstudio",nullable = false)
    private CasaDeEstudios CasaDeEstudio;
    
   

	public Nutricionista getNutricionista_Id() {
		return Nutricionista_Id;
	}

	public void setNutricionista_Id(Nutricionista nutricionista_Id) {
		Nutricionista_Id = nutricionista_Id;
	}

	public Especialidad getEspecialidad_Id() {
		return Especialidad_Id;
	}

	public void setEspecialidad_Id(Especialidad especialidad_Id) {
		Especialidad_Id = especialidad_Id;
	}

	public GradoAcademico getGradoAcademico() {
		return GradoAcademico;
	}

	public void setGradoAcademico(GradoAcademico gradoAcademico) {
		GradoAcademico = gradoAcademico;
	}

	public CasaDeEstudios getCasaDeEstudio() {
		return CasaDeEstudio;
	}

	public void setCasaDeEstudio(CasaDeEstudios casaDeEstudio) {
		CasaDeEstudio = casaDeEstudio;
	}
    

}