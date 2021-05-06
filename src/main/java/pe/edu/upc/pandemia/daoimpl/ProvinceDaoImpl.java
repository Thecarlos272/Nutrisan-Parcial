package pe.edu.upc.pandemia.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.pandemia.dao.IProvinceDao;
import pe.edu.upc.pandemia.entities.Province;

public class ProvinceDaoImpl implements IProvinceDao {

	@PersistenceContext(unitName="NutrisanPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Province prov) {
		try {
			em.persist(prov);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Province> list() {
		List<Province> lista=new ArrayList<Province>();
		try {
			Query q = em.createQuery("from Province p");
			lista=(List<Province>)q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int idProvince) {
		Province p =new Province();
		try {
			p=em.getReference(Province.class, idProvince);
			em.remove(p);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
				
		
	}

}
