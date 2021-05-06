package pe.edu.upc.pandemia.service;

import java.util.List;

import pe.edu.upc.pandemia.entities.Citas;

public interface ICitasService {
	public void insert(Citas cita);
	
	public List<Citas> list();
	
	public void delete(int idCita);
}
