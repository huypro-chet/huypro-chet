package poly.com.dao;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;


import poly.com.uil.jpaUI;

public class attrackDao<t> {
	public static final EntityManager entityManager = jpaUI.getEntityManager();
	@Override
	protected void finalize() throws Throwable {
		entityManager.close();
		super.finalize();
	}
	
	public t findById(Class<t> clazz, Integer id) {
		return entityManager.find(clazz, id);
	}
	
	public List<t> findAll(Class<t> clazz, boolean exitsIsActive){
		EntityManager em = jpaUI.getEntityManager();
		String entityName = clazz.getSimpleName();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT o FROM").append(entityName).append(" o ");
		if(exitsIsActive == true) {
			sql.append("WHERE TRANGTHAI = 1");
		}
		TypedQuery<t> query = entityManager.createQuery(sql.toString(), clazz);
		return query.getResultList();
	}
	
	public List<t> findAll(Class<t> clazz, boolean exitsIsActive, int pageNumber, int pageSize){
		EntityManager em = jpaUI.getEntityManager();
		String entityName = clazz.getSimpleName();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT o FROM").append(entityName).append(" o ");
		if(exitsIsActive == true) {
			sql.append("WHERE TRANGTHAI = 1");
		}
		TypedQuery<t> query = entityManager.createQuery(sql.toString(), clazz);
		query.setFirstResult((pageNumber - 1)* pageSize);
		query.setMaxResults(pageSize);
		return query.getResultList();
	}
	
	public t findOne(Class<t> clazz, String Sql, Object... params) {
		EntityManager em = jpaUI.getEntityManager();
		TypedQuery<t> query = em.createQuery(Sql, clazz);
		for(int i= 0; i < params.length; i++) {
			query.setParameter(i, params[i]);
		}
		List<t> result = query.getResultList();
		if(result.isEmpty()) {
			return null;
		}
		return result.get(0);
	}
	
	public List<t> findMany(Class<t> clazz, String Sql, Object... params) {
		EntityManager em = jpaUI.getEntityManager();
		TypedQuery<t> query = em.createQuery(Sql, clazz);
		for(int i= 0; i < params.length; i++) {
			query.setParameter(i, params[i]);
		}
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> findManyByNaviteQuery(String Sql, Object... params) {
		EntityManager em = jpaUI.getEntityManager();
		Query query = em.createNativeQuery(Sql);
		for(int i= 0; i < params.length; i++) {
			query.setParameter(i, params[i]);
		}
		return query.getResultList();
	}
	
	public t Create(t entity) {
		EntityManager em = jpaUI.getEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(entity);
			em.getTransaction().commit();
			System.out.println("Thêm thành công!");
			return entity;
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Thêm thất bại!" + entity.getClass().getSimpleName() + "to DB");
			throw new RuntimeException(e);
		}
	}
	
	public t Update(t entity) {
		EntityManager em = jpaUI.getEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(entity);
			em.getTransaction().commit();
			System.out.println("Cập nhập thành công!");
			return entity;
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Cập nhập thất bại!" + entity.getClass().getSimpleName());
			throw new RuntimeException(e);
		}
	}
	
	public t Delete(t entity) {
		EntityManager em = jpaUI.getEntityManager();
		try {
			em.getTransaction().begin();
			em.remove(entity);
			em.getTransaction().commit();
			System.out.println("Xóa thành công!");
			return entity;
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Xóa thất bại!" + entity.getClass().getSimpleName());
			throw new RuntimeException(e);
		}
	}
}
