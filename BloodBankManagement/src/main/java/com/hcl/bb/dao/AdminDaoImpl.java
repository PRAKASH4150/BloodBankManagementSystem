package com.hcl.bb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.hcl.bb.appexception.ApplicationException;
import com.hcl.bb.model.Admin;
import com.hcl.bb.model.RequestBlood;

@Repository("adminDao")
public class AdminDaoImpl implements AdminDao{

	@Autowired
	private SessionFactory sessionFactory;

	public boolean validateAdmin(Admin admin) throws ApplicationException {
		
		if(admin.getUserName().equals("Admin") && admin.getPassword().equals("Admin@765"))
		{
			return true;
		}
	    
		else
		{
			throw new ApplicationException("Invalid Credentials");
		}
	}

	public List<RequestBlood> getRequestList() {
		
		String hql="FROM RequestBlood";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		
		return query.getResultList();

	}


}