package pe.edu.upc.pandemia.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.pandemia.dao.INutricionistaDao;
import pe.edu.upc.pandemia.entities.Nutricionista;
import pe.edu.upc.pandemia.service.INutricionistaService;

@Named
@RequestScoped
public class NutricionistaServiceImpl implements INutricionistaService{
	@Inject
	private INutricionistaDao nDao;
	
	@Override
	public void insert(Nutricionista nut) {	
		try {
			nDao.insert(nut);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}

	@Override
	public List<Nutricionista> list() {
		return nDao.list();
	}

	@Override
	public void delete(int dni) {
		nDao.delete(dni);
	}

	@Override
	public List<Nutricionista> find(Nutricionista nut) {
		return nDao.find(nut);
	}

}
