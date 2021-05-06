package pe.edu.upc.pandemia.dao;

import java.util.List;

import pe.edu.upc.pandemia.entities.Region;

public interface IRegionDao {

	public void insert(Region reg);

	public List<Region> list();

	public void delete(int idRegion);

	public List<Region> findByName(Region reg);
}
