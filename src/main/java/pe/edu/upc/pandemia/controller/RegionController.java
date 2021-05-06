package pe.edu.upc.pandemia.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.pandemia.entities.Region;
import pe.edu.upc.pandemia.service.IRegionService;

@Named
@RequestScoped
public class RegionController {
	@Inject
	private IRegionService rService;
//variables
	private Region region;

	List<Region> listaRegiones;
//constructores

	@PostConstruct
	public void init() {
		this.region = new Region();
		this.listaRegiones = new ArrayList<Region>();
		this.list();
	}

//m�todos especializados	

	public String newRegion() {
		this.setRegion(new Region());
		return "region.xhtml";
	}

	public void insert() {
		try {
			rService.insert(region);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de regi�n");
		}
	}

	public void list() {
		try {
			listaRegiones = rService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de regi�n");
		}
	}

	public void delet(Region re) {
		try {
			rService.delete(re.getIdRegion());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de regi�n");
		}
	}

	public void findByName() {
		try {
			if (region.getNameRegion().isEmpty()) {
				this.list();
			}
			else {
				listaRegiones=this.rService.findByName(this.getRegion());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void clean() {
		this.init();
	}
	
//get y sett
	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public List<Region> getListaRegiones() {
		return listaRegiones;
	}

	public void setListaRegiones(List<Region> listaRegiones) {
		this.listaRegiones = listaRegiones;
	}

}
