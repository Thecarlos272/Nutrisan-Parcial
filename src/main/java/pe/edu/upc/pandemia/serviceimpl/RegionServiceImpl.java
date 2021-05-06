package pe.edu.upc.pandemia.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.pandemia.dao.IRegionDao;
import pe.edu.upc.pandemia.entities.Region;
import pe.edu.upc.pandemia.service.IRegionService;

@Named
@RequestScoped
public class RegionServiceImpl implements IRegionService {
	@Inject
	private IRegionDao rDao;

	@Override
	public void insert(Region reg) {
		rDao.insert(reg);
	}

	@Override
	public List<Region> list() {
		// TODO Auto-generated method stub
		return rDao.list();
	}

	@Override
	public void delete(int idRegion) {
		rDao.delete(idRegion);
	}

	@Override
	public List<Region> findByName(Region reg) {
		return rDao.findByName(reg);
		
	}

	
}
