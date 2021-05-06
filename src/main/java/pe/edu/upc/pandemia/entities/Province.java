package pe.edu.upc.pandemia.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="province")
public class Province {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProvince;
	
	@Column(name="nameProvince", nullable=false, length=27)
	private String nameProvince;
	
	@ManyToOne
	@JoinColumn(name="idRegion", nullable=false)
	private Region idRegion;

	public Province(int idProvince, String nameProvince, Region idRegion) {
		super();
		this.idProvince = idProvince;
		this.nameProvince = nameProvince;
		this.idRegion = idRegion;
	}



	public Province() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getIdProvince() {
		return idProvince;
	}

	public void setIdProvince(int idProvince) {
		this.idProvince = idProvince;
	}

	public String getName() {
		return nameProvince;
	}

	public void setName(String nameProvince) {
		this.nameProvince = nameProvince;
	}

	public Region getRegion() {
		return idRegion;
	}

	public void setRegion(Region idRegion) {
		this.idRegion = idRegion;
	}


	
	
	
}
