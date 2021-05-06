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
@Table(name="CasaDeEstudios", indexes = {@Index(columnList = "Nombre",name="casaDeEstudis_index_Nombre") })
@SequenceGenerator(name="getCasaDeEstudio",initialValue = 1,allocationSize = 1)
public class CasaDeEstudios {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "getCasaDeEstudio")
    @Column(name="Id",columnDefinition = "NUMERIC(10)",nullable = false)
    private Integer id;

    @Column(name="Nombre",length=40)
    private String Nombre;
    @Column(name="NumContacto",length=40)
    private Integer NumContacto;

    @OneToMany(mappedBy = "CasaDeEstudio", fetch = FetchType.LAZY)
    private List<Curriculum> Curriculums;

    
    public CasaDeEstudios() {
    	   Curriculums=new ArrayList<Curriculum>();
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


	public Integer getNumContacto() {
		return NumContacto;
	}


	public void setNumContacto(Integer numContacto) {
		NumContacto = numContacto;
	}


	public List<Curriculum> getCurriculums() {
		return Curriculums;
	}


	public void setCurriculums(List<Curriculum> curriculums) {
		Curriculums = curriculums;
	}
    
    
    
}