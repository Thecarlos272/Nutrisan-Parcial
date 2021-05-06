package pe.edu.upc.pandemia.dao;

import java.util.List;

import pe.edu.upc.pandemia.entities.Province;

public interface IProvinceDao {

	public void insert(Province prov);
	public List<Province> list();
	public void delete(int idProvince);
}
