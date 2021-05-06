package pe.edu.upc.pandemia.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.pandemia.dao.IPacienteDao;
import pe.edu.upc.pandemia.entities.Paciente;
import pe.edu.upc.pandemia.service.IPacienteService;

@Named
@RequestScoped
public class PacienteServiceImpl implements IPacienteService{

	@Inject
	private IPacienteDao pDao;
	
	
	@Override
	public void insert(Paciente paciente) {
		try {
			pDao.insert(paciente);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public List<Paciente> list() {
		return pDao.list();
	}

	
}
