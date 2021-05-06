package pe.edu.upc.pandemia.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "region")
public class Region {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRegion;

	@Column(name = "nameRegion", length = 25)
	private String nameRegion;

	public Region() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Region(Integer idRegion, String nameRegion) {
		super();
		this.idRegion = idRegion;
		this.nameRegion = nameRegion;
	}

	public Integer getIdRegion() {
		return idRegion;
	}

	public void setIdRegion(Integer idRegion) {
		this.idRegion = idRegion;
	}

	public String getNameRegion() {
		return nameRegion;
	}

	public void setNameRegion(String nameRegion) {
		this.nameRegion = nameRegion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idRegion == null) ? 0 : idRegion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		if (idRegion == null) {
			if (other.idRegion != null)
				return false;
		} else if (!idRegion.equals(other.idRegion))
			return false;
		return true;
	}

}
