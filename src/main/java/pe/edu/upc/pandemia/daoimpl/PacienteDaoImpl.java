package pe.edu.upc.pandemia.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.pandemia.dao.IPacienteDao;
import pe.edu.upc.pandemia.entities.Paciente;

public class PacienteDaoImpl implements IPacienteDao{

	@PersistenceContext(unitName="NutrisanPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Paciente paciente) {
		try {
			em.persist(paciente);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Paciente> list() {
		List<Paciente> lista=new ArrayList<Paciente>();
		try {
			Query q = em.createQuery("from Paciente p");
			lista=(List<Paciente>)q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

}
