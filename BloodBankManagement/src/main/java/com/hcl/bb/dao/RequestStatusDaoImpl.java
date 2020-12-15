package com.hcl.bb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.bb.model.RequestBlood;
import com.hcl.bb.model.User;

@Repository("requestStatusDao")
public class RequestStatusDaoImpl implements RequestStatusDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<RequestBlood> getRequestList(User user) {

		String hql="FROM RequestBlood requestBlood WHERE requestBlood.patientId=:patientId";
		
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("patientId",user.getUserId());
		return query.getResultList();
		
	}

}
