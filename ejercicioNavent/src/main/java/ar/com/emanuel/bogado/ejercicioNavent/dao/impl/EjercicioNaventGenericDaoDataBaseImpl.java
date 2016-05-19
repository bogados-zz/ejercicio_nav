package ar.com.emanuel.bogado.ejercicioNavent.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import ar.com.emanuel.bogado.ejercicioNavent.dao.EjercicioNaventGenericDao;
import ar.com.emanuel.bogado.ejercicioNavent.utils.dao.HibernateDaoHelper;
/**
 * 
 * @author Emanuel Bogado
 * @emailto: seebogado@yahoo.com
 * @Since 19/05/2016	
 */
@Repository(value = "ejercicioNaventGenericDao")
public class EjercicioNaventGenericDaoDataBaseImpl extends HibernateDaoHelper implements EjercicioNaventGenericDao {

	public void save(Object objeto) {
		getSession().save(objeto);
	}

	public void update(Object objeto) {
		getSession().update(objeto);
	}

	public void delete(Object objeto) {
		getSession().delete(objeto);
	}

	public void saveOrUpdate(Object objeto) {
		getSession().saveOrUpdate(objeto);
	}

	@SuppressWarnings("unchecked")
	public <T> T get(Class<T> clase, Long id) {
		return (T) getSession().get(clase, id);
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> findAll(Class<T> clase) {
		return getSession().createCriteria(clase).list();
	}

}
