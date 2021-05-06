package pe.edu.upc.pandemia.dao;

import java.util.List;

import pe.edu.upc.pandemia.entities.Citas;

public interface ICitasDao {
	
	public void insert(Citas cita);
	public List<Citas> list();
	public void delete(int idCita);
}
