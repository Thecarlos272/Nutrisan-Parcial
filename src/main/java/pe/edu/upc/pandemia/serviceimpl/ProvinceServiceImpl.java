package pe.edu.upc.pandemia.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.pandemia.dao.IProvinceDao;
import pe.edu.upc.pandemia.entities.Province;
import pe.edu.upc.pandemia.service.IProvinceService;

@Named
@RequestScoped
public class ProvinceServiceImpl implements IProvinceService {

	@Inject
	private IProvinceDao pDao;
	
	@Override
	public void insert(Province prov) {
		
		try {
			pDao.insert(prov);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public List<Province> list() {
		return pDao.list();
	}

	@Override
	public void delete(int idProvince) {
		pDao.delete(idProvince);
		
	}

}
