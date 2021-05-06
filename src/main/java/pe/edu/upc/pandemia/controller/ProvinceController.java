package pe.edu.upc.pandemia.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.edu.upc.pandemia.entities.Province;
import pe.edu.upc.pandemia.entities.Region;
import pe.edu.upc.pandemia.service.IProvinceService;
import pe.edu.upc.pandemia.service.IRegionService;


@Named
@RequestScoped
public class ProvinceController {

	
	@Inject
	private IProvinceService pService;
	@Inject
	private IRegionService rService;
	
	private Province province;
	List<Province> listaprovincias;
	List<Region> listaregiones;
	
	@PostConstruct
	public void init()
	{
		this.province=new Province();
		this.listaprovincias=new ArrayList<Province>();
		this.listaregiones=new ArrayList<Region>();
		
		this.listProvince();
		this.listRegion();
	}
	
	public String newProvince() {
		this.setProvince(new Province());
		return "province.xhtml";
	}
	
	public void insert() {
		try {
			pService.insert(province);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void listProvince() {
		try {
			listaprovincias=pService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void listRegion() {
		try {
			listaregiones=rService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void delete(Province pr) {
		try {
			pService.delete(pr.getIdProvince());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	public List<Region> getListaregiones() {
		return listaregiones;
	}
	public void setListaregiones(List<Region> listaregiones) {
		this.listaregiones = listaregiones;
	}
	public Province getProvince() {
		return province;
	}
	public void setProvince(Province province) {
		this.province = province;
	}
	public List<Province> getListaprovincias() {
		return listaprovincias;
	}
	public void setListaprovincias(List<Province> listaprovincias) {
		this.listaprovincias = listaprovincias;
	}
	
}
