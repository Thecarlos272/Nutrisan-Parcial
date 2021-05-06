package pe.edu.upc.pandemia.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.pandemia.entities.Citas;
import pe.edu.upc.pandemia.entities.Horario;
import pe.edu.upc.pandemia.entities.Paciente;
import pe.edu.upc.pandemia.service.ICitasService;
import pe.edu.upc.pandemia.service.IHorarioService;
import pe.edu.upc.pandemia.service.IPacienteService;

@Named
@RequestScoped
public class CitasController {
	@Inject
	private ICitasService cService;
	@Inject
	private IPacienteService pService;
	@Inject
	private IHorarioService hService;
	
	//variables
	private Citas cita;
	List<Citas> listaCitas;
	List<Paciente> listaPacientes;
	List<Horario> listaHorarios;
	
	//constructores
	@PostConstruct
	public void init() {
		this.cita = new Citas();
		this.listaCitas = new ArrayList<Citas>();
		this.listaPacientes = new ArrayList<Paciente>();
		this.listaHorarios = new ArrayList<Horario>();
		this.listCitas();
		this.listPaciente();
		this.listHorario();
	}

	//metodos especializados
	public String newCita() {
		this.setCita(new Citas());
		return "citas.xhtml";

	}

	public void insert() {
		try {
			cService.insert(cita);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void listCitas() {
		try {
			listaCitas = cService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void listPaciente() {
		try {
			listaPacientes = pService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void listHorario() {
		try {
			listaHorarios = hService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void delete(Citas ci) {
		try {
			cService.delete(ci.getCita_id());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// get y set
	public Citas getCita() {
		return cita;
	}

	public void setCita(Citas cita) {
		this.cita = cita;
	}

	public List<Citas> getListaCitas() {
		return listaCitas;
	}

	public void setListaCitas(List<Citas> listaCitas) {
		this.listaCitas = listaCitas;
	}

	public List<Paciente> getListaPacientes() {
		return listaPacientes;
	}

	public void setListaPacientes(List<Paciente> listaPacientes) {
		this.listaPacientes = listaPacientes;
	}

	public List<Horario> getListaHorarios() {
		return listaHorarios;
	}

	public void setListaHorarios(List<Horario> listaHorarios) {
		this.listaHorarios = listaHorarios;
	}
	
}
