package ar.com.emanuel.bogado.ejercicioNavent.cache;

/**
 * 
 * @author Emanuel Bogado
 * @emailto: seebogado@yahoo.com
 * @Since 19/05/2016	
 */
public interface BumexMemcached {
	public void set(String key, Object value);

	public Object get(String key);

	public void delete(String key);
}
