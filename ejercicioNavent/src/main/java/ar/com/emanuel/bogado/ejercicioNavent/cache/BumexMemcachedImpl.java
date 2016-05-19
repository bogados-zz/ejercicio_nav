package ar.com.emanuel.bogado.ejercicioNavent.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.emanuel.bogado.ejercicioNavent.dao.PedidosDao;
import ar.com.emanuel.bogado.ejercicioNavent.model.Pedido;

/**
 * 
 * @author Emanuel Bogado
 * @emailto: seebogado@yahoo.com
 * @Since 19/05/2016	
 */
@Service("bumexMemcached")
public class BumexMemcachedImpl implements BumexMemcached{


/**
 * Nota:
 * Lo puse como un servicio, dado que es lo mismo que tener un singleton,
 * unicamente, que spring instancia el servicio ( con lo cual, no se tiene manejo de cuando se obtiene la instancia)
 * Por si las dudas, dejé aclarado como haría el patrón singleton.
 * */
	
	
//	private static BumexMemcached instance;
//	private BumexMemcached(){
//		
//	}
//	public static BumexMemcached getInstance(){
//		if(instance == null){
//			instance=new BumexMemcached();
//		}
//		return BumexMemcached.instance;
//	}
	
	@Autowired
	private PedidosDao pedidoDao;
	
	public void set(String key, Object value){
		pedidoDao.insertOrUpdate((Pedido)value);
	}
	
	public Object get(String key){
		Object objetoAReturnar= null;
		try{
			Long id= new Long(key);
			objetoAReturnar=pedidoDao.get(id);
		}catch(NumberFormatException nfe){
			nfe.printStackTrace();
		}
		return objetoAReturnar;
	}

	public void delete(String key){
		try{
			Long id= new Long(key);
			pedidoDao.delete(pedidoDao.get(id));
		}catch(NumberFormatException nfe){
			nfe.printStackTrace();
		}
	}
	
}
