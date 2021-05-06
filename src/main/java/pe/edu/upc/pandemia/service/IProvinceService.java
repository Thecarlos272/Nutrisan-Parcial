package pe.edu.upc.pandemia.service;

import java.util.List;

import pe.edu.upc.pandemia.entities.Province;

public interface IProvinceService {
	public void insert(Province prov);
	public List<Province> list();
	public void delete(int idProvince);
}
