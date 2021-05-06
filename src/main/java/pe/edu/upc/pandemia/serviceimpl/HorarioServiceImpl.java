package pe.edu.upc.pandemia.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.pandemia.dao.IHorarioDao;
import pe.edu.upc.pandemia.entities.Horario;
import pe.edu.upc.pandemia.service.IHorarioService;


@Named
@RequestScoped
public class HorarioServiceImpl implements IHorarioService{
	@Inject
	private IHorarioDao hDao;
	@Override
	public void insert(Horario hor) {
		try {
			hDao.insert(hor);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Override
	public List<Horario> list() {
		return hDao.list();
	}
	@Override
	public void delete(int id) {
		hDao.delete(id);
	}
}
