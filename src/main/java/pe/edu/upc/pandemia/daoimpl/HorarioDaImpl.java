package pe.edu.upc.pandemia.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.pandemia.dao.IHorarioDao;
import pe.edu.upc.pandemia.entities.Horario;


public class HorarioDaImpl implements IHorarioDao{
	@PersistenceContext(unitName = "NutrisanPU")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Horario hor) {
		try {
			em.persist(hor);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error al insertar Region en el dao");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Horario> list() {
		List<Horario> lista = new ArrayList<Horario>();
		try {
			Query q = em.createQuery("from Horario h");
			lista = (List<Horario>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Horario re = new Horario();
		try {
			re = em.getReference(Horario.class, id);
			em.remove(re);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		
	}


}
