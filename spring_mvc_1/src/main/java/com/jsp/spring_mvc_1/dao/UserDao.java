package com.jsp.spring_mvc_1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jsp.spring_mvc_1.dto.User;

@Repository
public class UserDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("sree");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public void saveUser(User user) {
		
		et.begin();
		em.persist(user);
		et.commit();
}
	
	public User fetchbyEmail(String email) {
		Query query = em.createQuery("select a from User a where email = ?1");
		query.setParameter(1,email);
		return (User)query.getSingleResult();
	}
	
	public List<User> fetchAllData(){
		Query q = em.createQuery("select a from User a");
		return q.getResultList();
	}

	
		public void deleteUser(int id) {
			User db=em.find(User.class,id);
			if(db !=null) {
				et.begin();
				em.remove(db);
				et.commit();
			}
		}

		public User fetchUserById(int id) {
		    
			User db=em.find(User.class,id);
			return db;
		}

		public void updateUser(User ud) {
			System.out.println(ud);
			User db = em.find(User.class,ud.getId());
			if(db!=null) {
				if(ud.getFName()!=null) {
					db.setFName(ud.getFName());
				}
				if(ud.getLName()!=null) {
					db.setLName(ud.getLName());
				}
				if(ud.getEmail()!=null) {
					db.setEmail(ud.getEmail());
				}
				if(ud.getPwd()!=null) {
					db.setPwd(ud.getPwd());
				}
				if(ud.getPhone()!=0) {
					db.setPhone(ud.getPhone());
				}
				if(ud.getGender()!=null) {
					db.setGender(ud.getGender());
				}
				if(ud.getAge()!=0) {
					db.setAge(ud.getAge());
				}
		}

		}

}
	

	

