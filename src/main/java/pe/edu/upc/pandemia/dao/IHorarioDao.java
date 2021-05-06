package pe.edu.upc.pandemia.dao;

import java.util.List;

import pe.edu.upc.pandemia.entities.Horario;


public interface IHorarioDao {

	public void insert(Horario hor);

	public List<Horario> list();

	public void delete(int id);


}
