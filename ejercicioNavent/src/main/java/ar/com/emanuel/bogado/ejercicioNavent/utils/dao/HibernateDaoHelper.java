package ar.com.emanuel.bogado.ejercicioNavent.utils.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class HibernateDaoHelper {

	@Autowired
	@Qualifier("ejercicioNaventSessionFactory")
	private SessionFactory naventSessionFactory;

	public Session getSession() {
		return this.naventSessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.naventSessionFactory = sessionFactory;
	}
}
