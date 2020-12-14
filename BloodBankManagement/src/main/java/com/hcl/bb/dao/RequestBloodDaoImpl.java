package com.hcl.bb.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.bb.model.RequestBlood;
import com.hcl.bb.model.User;

@Repository("requestBloodDao")
public class RequestBloodDaoImpl implements RequestBloodDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean addRequest(RequestBlood requestBlood,User user) {

		Session session=sessionFactory.getCurrentSession();
		requestBlood.setRequestStatus("Approval Pending");
		requestBlood.setPatientId(user.getUserId());
    	session.save(requestBlood);
    	return true;
	}

}
