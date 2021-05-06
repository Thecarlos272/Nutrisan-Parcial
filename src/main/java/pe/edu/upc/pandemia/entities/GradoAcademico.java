package pe.edu.upc.pandemia.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="GradoAcademico",indexes  = {@Index(columnList = "Nombre",name = "gradoAcademico_index_Nombre")})
@SequenceGenerator(name="getGradoAcademico",initialValue = 1,allocationSize = 1)
public class GradoAcademico {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "getGradoAcademico")
    @Column(name="Id",columnDefinition = "NUMERIC(10)",nullable = false)
    private Integer id;

    @Column(name="Nombre",length=40)
    private String Nombre;

    @OneToMany(mappedBy =  "GradoAcademico", fetch=FetchType.LAZY)
    private List<Curriculum> Curriculums;
    
    public GradoAcademico() {
    	Curriculums= new ArrayList<Curriculum>();
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public List<Curriculum> getCurriculums() {
		return Curriculums;
	}

	public void setCurriculums(List<Curriculum> curriculums) {
		Curriculums = curriculums;
	}
    
}