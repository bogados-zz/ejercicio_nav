package ar.com.emanuel.bogado.ejercicioNavent.dao.impl;

import org.springframework.stereotype.Repository;

import ar.com.emanuel.bogado.ejercicioNavent.dao.PedidosDao;
import ar.com.emanuel.bogado.ejercicioNavent.model.Pedido;
/**
 * 
 * @author Emanuel Bogado
 * @emailto: seebogado@yahoo.com
 * @Since 19/05/2016	
 */
@Repository(value = "PedidosDao")
public class PedidosDaoImpl extends EjercicioNaventGenericDaoDataBaseImpl implements PedidosDao {

	public void delete(Pedido pedido) {
		super.delete(pedido);
	}

	public void insertOrUpdate(Pedido pedido) {
		super.saveOrUpdate(pedido);
	}

	@SuppressWarnings("unchecked")
	public Pedido get(Long id) {
		return (Pedido)super.get(Pedido.class, id);
	}

}
