package pe.edu.upc.pandemia.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.pandemia.dao.ICitasDao;
import pe.edu.upc.pandemia.entities.Citas;
import pe.edu.upc.pandemia.service.ICitasService;

public class ICitasServiceImpl implements ICitasService{

	@Inject
	private ICitasDao cDao;
	@Override
	public void insert(Citas cita) {
		try {
			cDao.insert(cita);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public List<Citas> list() {
		return cDao.list();
	}

	@Override
	public void delete(int idCita) {
		cDao.delete(idCita);
		
	}

}
