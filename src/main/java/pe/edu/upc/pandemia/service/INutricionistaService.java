package pe.edu.upc.pandemia.service;

import java.util.List;

import pe.edu.upc.pandemia.entities.Nutricionista;

public interface INutricionistaService {
	public void insert(Nutricionista nut);

	public List<Nutricionista> list();

	public void delete(int dni);

	public List<Nutricionista> find(Nutricionista nut);
}
