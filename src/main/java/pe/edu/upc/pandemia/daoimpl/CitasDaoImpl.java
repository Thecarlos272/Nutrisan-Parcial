package pe.edu.upc.pandemia.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.pandemia.dao.ICitasDao;
import pe.edu.upc.pandemia.entities.Citas;

public class CitasDaoImpl implements ICitasDao {

	@PersistenceContext(unitName = "NutrisanPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Citas cita) {
		try {
			em.persist(cita);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

	@Override
	public List<Citas> list() {
		List<Citas> lista = new ArrayList<Citas>();
		try {
			Query q = em.createNamedQuery("from Citas c");
			lista = (List<Citas>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

	@Override
	public void delete(int idCita) {
		Citas c = new Citas();
		try {
			c = em.getReference(Citas.class, idCita);
			em.remove(c);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

	

}
