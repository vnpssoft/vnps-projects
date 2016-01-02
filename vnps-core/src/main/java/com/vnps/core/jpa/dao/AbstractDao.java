package com.vnps.core.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public abstract class AbstractDao {
	
	protected EntityManager entityMgr; 
	
	public AbstractDao(String puName) throws DaoException {
		try {
			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory(puName);
			entityMgr = emFactory.createEntityManager();
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}
	
	public List<?> executeNamedQuery(String query) throws DaoException {
		List<?> dbList =  null;
		try {
			Query qry = entityMgr.createNamedQuery(query);
			dbList = qry.getResultList();
		} catch (Exception e) {
			throw new DaoException(e);
		}
		return dbList;
	}
	
	public <T> T findByKey(Class<T> dbClass,Object key) throws DaoException {
		T dbObj = null;
		try {
			dbObj = entityMgr.find(dbClass, key);
		} catch (Exception e) {
			throw new DaoException(e);
		}
		return dbObj;
	}
	
	public  void save(Object dbObj) throws DaoException {
		EntityTransaction trans = null;
		boolean isFailed = false;
		try {
			trans = entityMgr.getTransaction();
			trans.begin();
			entityMgr.persist(dbObj);
		} catch (Exception e) {
			isFailed = true;
			throw new DaoException(e);
		} finally {
			try {
				if (isFailed) {
					trans.rollback();
				} else {
					trans.commit();
				}
			} catch (Exception e) {
				throw new DaoException(e);
			}
		}
	}
	
}
