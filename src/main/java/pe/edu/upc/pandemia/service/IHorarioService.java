package pe.edu.upc.pandemia.service;

import java.util.List;

import pe.edu.upc.pandemia.entities.Horario;


public interface IHorarioService {
	public void insert(Horario hor);

	public List<Horario> list();

	public void delete(int id);
}
