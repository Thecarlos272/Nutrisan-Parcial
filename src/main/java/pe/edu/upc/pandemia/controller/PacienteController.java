package pe.edu.upc.pandemia.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.pandemia.entities.Paciente;
import pe.edu.upc.pandemia.service.IPacienteService;

@Named
@RequestScoped
public class PacienteController {
	@Inject
	private IPacienteService pService;
	
	//variables
	private Paciente paciente;
	
	List<Paciente> listaPacientes;
	
	//constructores
	@PostConstruct
	public void init() {
		this.paciente = new Paciente();
		this.listaPacientes = new ArrayList<Paciente>();
		this.list();
	}
	
	//metodos especializados
	public String newPaciente() {
		this.setPaciente(new Paciente());
		return "paciente.xhtml";
	}
	
	
	public void insert() {
		try {
			pService.insert(paciente);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de paciente");
		}
	}
	
	public void list() {
		try {
			listaPacientes = pService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de paciente");
		}
	}

	public IPacienteService getpService() {
		return pService;
	}

	public void setpService(IPacienteService pService) {
		this.pService = pService;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<Paciente> getListaPacientes() {
		return listaPacientes;
	}

	public void setListaPacientes(List<Paciente> listaPacientes) {
		this.listaPacientes = listaPacientes;
	}
	
	//get y set

}
