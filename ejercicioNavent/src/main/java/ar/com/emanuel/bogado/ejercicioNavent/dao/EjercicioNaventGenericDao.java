package ar.com.emanuel.bogado.ejercicioNavent.dao;

public interface EjercicioNaventGenericDao {
	public void delete(Object objeto);
	public void saveOrUpdate(Object objeto);
	public <T> T get(Class<T> clase, Long id);
}
