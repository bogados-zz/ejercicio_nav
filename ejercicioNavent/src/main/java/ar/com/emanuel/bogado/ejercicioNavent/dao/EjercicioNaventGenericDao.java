package ar.com.emanuel.bogado.ejercicioNavent.dao;

import java.util.List;

/**
 * 
 * @author Emanuel Bogado
 * @emailto: seebogado@yahoo.com
 * @Since 19/05/2016	
 */

public interface EjercicioNaventGenericDao {
	public void save(Object objeto);

	public void update(Object objeto);

	public void delete(Object objeto);

	public void saveOrUpdate(Object objeto);

	public <T> T get(Class<T> clase, Long id);

	public <T> List<T> findAll(Class<T> clase);
}
