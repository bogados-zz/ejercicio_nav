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

import ar.com.emanuel.bogado.ejercicioNavent.dao.PedidosDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/ar/com/emanuel/bogado/ejercicioNavent/spring/ApplicationContext.xml" })
@Transactional
@TransactionConfiguration(transactionManager = "ejercicioNaventTransactionManager", defaultRollback = true)
public class TestPedidoDao extends AbstractTransactionalJUnit4SpringContextTests {
	@Autowired
	private PedidosDao pedidoDao;

	@Autowired
	public void setDataSource(@Qualifier("EJERCICIO_NAVENT") DataSource dataSource) {
		super.setDataSource(dataSource);
	}
	
	
	@Test
	@Rollback
	public void testDelete(){
		pedidoDao.delete(pedidoDao.get(1L));
	}

}