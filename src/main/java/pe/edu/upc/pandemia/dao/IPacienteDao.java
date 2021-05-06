package pe.edu.upc.pandemia.dao;

import java.util.List;

import pe.edu.upc.pandemia.entities.Paciente;


public interface IPacienteDao {
	public void insert(Paciente paciente);
	public List<Paciente> list();
}
