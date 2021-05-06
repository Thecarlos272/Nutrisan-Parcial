package pe.edu.upc.pandemia.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.pandemia.dao.INutricionistaDao;
import pe.edu.upc.pandemia.entities.Nutricionista;

public class NutricionistaDaoImpl implements INutricionistaDao{

	@PersistenceContext(unitName="NutrisanPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Nutricionista nut) {
		try {
			em.persist(nut);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Nutricionista> list() {
		List<Nutricionista> lista=new ArrayList<Nutricionista>();
		try {
			Query q = em.createQuery("from Nutricionista p");
			lista=(List<Nutricionista>)q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}
	
	@Transactional
	@Override
	public void delete(int dni) {
		Nutricionista nu = new Nutricionista();
		try {
			nu = em.getReference(Nutricionista.class, dni);
			em.remove(nu);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Nutricionista> find(Nutricionista nut) {
		List<Nutricionista> lista = new ArrayList<Nutricionista>();
		try {
			Query q =em.createQuery("from Nutricionista n where n.nombre like ?1");
			q.setParameter(1,"%"+nut.getNombre()+"%");
			lista=(List<Nutricionista>)q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}
	
}
