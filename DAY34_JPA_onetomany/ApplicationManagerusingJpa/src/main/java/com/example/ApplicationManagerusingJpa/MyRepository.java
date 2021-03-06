import javax.persistence.EntityMan ager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

	@PersistenceUnit
	private EntityManagerFactory emf;

	void getData() {
		EntityManager em;
		em = emf.createEntityManager();

		// update
//		em.getTransaction().begin();
//		
//		String jsql="";
//		
//		jsql="update Student e set e.name='testing'"
//				+ " where e.id=100";
//		Query q;
//		q=em.createQuery(jsql);
//		q.executeUpdate();
//		

		em.getTransaction().commit();

		// delete
//em.getTransaction().begin();
//		
//		String jsql="";
//		
//		jsql="delete from Student e where e.id=100";
//		Query q;
//		q=em.createQuery(jsql);
//		q.executeUpdate();
//		
//		
//		em.getTransaction().commit();
		// select

		em.getTransaction().begin();

		String jsql = "";

		// jsql="select e from Student as e";
		jsql = "select e from Student as e where e.id=100";
		Query q;
		q = em.createQuery(jsql);
		q.executeUpdate();
//		q.getResultList()
//		q.getSingleResult()

		em.getTransaction().commit();

	}
}
