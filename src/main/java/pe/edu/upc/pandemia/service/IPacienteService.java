package pe.edu.upc.pandemia.service;

import java.util.List;

import pe.edu.upc.pandemia.entities.Paciente;

public interface IPacienteService {
	public void insert(Paciente paciente);
	public List<Paciente> list();
}
