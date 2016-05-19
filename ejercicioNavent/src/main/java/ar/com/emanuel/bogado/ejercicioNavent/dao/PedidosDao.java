package ar.com.emanuel.bogado.ejercicioNavent.dao;

import ar.com.emanuel.bogado.ejercicioNavent.model.Pedido;
/**
 * 
 * @author Emanuel Bogado
 * @emailto: seebogado@yahoo.com
 * @Since 19/05/2016	
 */
public interface PedidosDao {
	public void delete(Pedido pedido);

	public void insertOrUpdate(Pedido pedido);

	public Pedido get(Long id);

}
