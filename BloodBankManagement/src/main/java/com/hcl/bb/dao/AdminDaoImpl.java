package com.hcl.bb.dao;

import org.springframework.stereotype.Repository;
import com.hcl.bb.appexception.ApplicationException;
import com.hcl.bb.model.Admin;

@Repository("adminDao")
public class AdminDaoImpl implements AdminDao{


	public boolean validateAdmin(Admin admin) throws ApplicationException {
		
		if(admin.getUserName()=="Admin"||admin.getPassword()=="Admin@765")
		{
			return true;
		}
	    
		else
		{
			throw new ApplicationException("Invalid Credentials");
		}
	}


}