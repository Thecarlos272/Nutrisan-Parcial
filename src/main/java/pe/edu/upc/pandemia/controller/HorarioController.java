package pe.edu.upc.pandemia.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.pandemia.entities.Horario;
import pe.edu.upc.pandemia.entities.Nutricionista;
import pe.edu.upc.pandemia.service.IHorarioService;
import pe.edu.upc.pandemia.service.INutricionistaService;

@Named
@RequestScoped
public class HorarioController {
	@Inject
	private IHorarioService hService;
	@Inject
	private INutricionistaService nService;
	
	//variables
	private Horario horario;
	List<Horario> listaHorarios;
	List<Nutricionista> listaNutricionistas;
	
	//constructores
	@PostConstruct
	public void init() {
		this.horario = new Horario();
		this.listaHorarios = new ArrayList<Horario>();
		this.listaNutricionistas = new ArrayList<Nutricionista>();
		this.listHorario();
		this.listNutricionista();
	}
	
	//metodos especializados
	public String newHorario() {
		this.setHorario(new Horario());
		return "horario.xhtml";

	}

	public void insert() {
		try {
			hService.insert(horario);
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

	public void listNutricionista() {
		try {
			listaNutricionistas = nService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void delete(Horario ho) {
		try {
			hService.delete(ho.getId());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	//get y set
	public Horario getHorario() {
		return horario;
	}
	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	public List<Horario> getListaHorarios() {
		return listaHorarios;
	}
	public void setListaHorarios(List<Horario> listaHorarios) {
		this.listaHorarios = listaHorarios;
	}
	public List<Nutricionista> getListaNutricionistas() {
		return listaNutricionistas;
	}
	public void setListaNutricionistas(List<Nutricionista> listaNutricionistas) {
		this.listaNutricionistas = listaNutricionistas;
	}
}
