package pe.edu.upc.pandemia.controller;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.pandemia.entities.Nutricionista;
import pe.edu.upc.pandemia.service.INutricionistaService;

@Named
@RequestScoped
public class NutricionistaController {
	@Inject
	private INutricionistaService nService;
	
	//variables
	private Nutricionista nutricionista;
	
	List<Nutricionista> listaNutricionistas;
	
	//constructores
	@PostConstruct
	public void init() {
		this.nutricionista = new Nutricionista();
		this.listaNutricionistas = new ArrayList<Nutricionista>();
		this.list();
	}

	//metodos especializados
	
	public String newNutricionista() {
		this.setNutricionista(new Nutricionista());
		return "nutricionista.xhtml";
	}
	
	public void insert() {
		try {
			nService.insert(nutricionista);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de nutricionista");
		}
	}
	
	public void list() {
		try {
			listaNutricionistas = nService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de nutricionista");
		}
	}
	
	public void delet(Nutricionista nu) {
		try {
			nService.delete(nu.getDni());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de nutricionista");
		}
	}
	
	public void find() {
		try {
			if (nutricionista.getDni()==0) {
				this.list();
			} else {
				listaNutricionistas = this.nService.find(this.getNutricionista());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	//get y set
	public INutricionistaService getnService() {
		return nService;
	}

	public void setnService(INutricionistaService nService) {
		this.nService = nService;
	}

	public Nutricionista getNutricionista() {
		return nutricionista;
	}

	public void setNutricionista(Nutricionista nutricionista) {
		this.nutricionista = nutricionista;
	}
	
}

