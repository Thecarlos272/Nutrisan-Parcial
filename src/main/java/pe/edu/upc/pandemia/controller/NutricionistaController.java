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
	private INutricionistaService nServicie;
	private Nutricionista nutricionista;
	List<Nutricionista> listaNutricionistas;

	
	@PostConstruct
	public void init() {
		this.nutricionista = new Nutricionista();
		this.listaNutricionistas = new ArrayList<Nutricionista>();
		this.list();
	}

	public String newNutricionista() {
		this.setNutricionista(new Nutricionista());
		return "nutricionista.xhtml";
	}

	public void insert() {
		try {

			nServicie.insert(nutricionista);
		} catch (Exception e) {
			System.out.print("Error al insertar en el controoller de region");
		}
	}
	
	public void list() {
		try {
			listaNutricionistas = nServicie.list();
		} catch (Exception e) {
			System.out.print("Error al listar en el controller");
		}
	}
	
	public void delet(Nutricionista re) {
		try {
			nServicie.delete(re.getDni());
			this.list();
		} catch (Exception e) {
			System.out.print("Error al listar en el controller");
		}
	}
	
	
	
	public Nutricionista getNutricionista() {
		return nutricionista;
	}


	public void setNutricionista(Nutricionista nutricionista) {
		this.nutricionista = nutricionista;
	}


	public List<Nutricionista> getListaNutricionistas() {
		return listaNutricionistas;
	}


	public void setListaNutricionistas(List<Nutricionista> listaNutricionistas) {
		this.listaNutricionistas = listaNutricionistas;
	}
	
	public void findByName() {

		try {

			if (nutricionista.getNombre().isEmpty()) {

				this.list();

			} else {

				listaNutricionistas = this.nServicie.find(this.getNutricionista());

			}

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}

	public void clean() {

		this.init();

	}
}

	
