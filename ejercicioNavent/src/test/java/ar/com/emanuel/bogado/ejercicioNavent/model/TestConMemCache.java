package ar.com.emanuel.bogado.ejercicioNavent.model;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import ar.com.emanuel.bogado.ejercicioNavent.cache.BumexMemcached;

/**
 * 
 * @author Emanuel Bogado
 * @emailto: seebogado@yahoo.com
 * @Since 19/05/2016	
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/ar/com/emanuel/bogado/ejercicioNavent/spring/ApplicationContext.xml"})
@Transactional
@TransactionConfiguration(transactionManager = "ejercicioNaventTransactionManager", defaultRollback = true)
public class TestConMemCache extends AbstractTransactionalJUnit4SpringContextTests{
	@Autowired
	private BumexMemcached bumexMemcached;
	
	@Autowired
	public void setDataSource(@Qualifier("EJERCICIO_NAVENT") DataSource dataSource) {
		super.setDataSource(dataSource);
	}
	
	@Test
	@Rollback(false)
	public void testSet(){
		Pedido pedido= new Pedido();
		pedido.setDescuento(10F);
		pedido.setMonto(10000D);
		pedido.setNombre("Este es el pedido numero 3");
		//Le pongo null porque no se realmente que utilizaría ese cache. En caso de implementar el codigo sería diferente.
		bumexMemcached.set(null, pedido);
	}
	
}
