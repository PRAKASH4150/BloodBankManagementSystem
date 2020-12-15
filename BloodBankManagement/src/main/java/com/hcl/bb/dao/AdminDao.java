package com.hcl.bb.dao;

import java.util.List;

import com.hcl.bb.appexception.ApplicationException;
import com.hcl.bb.model.Admin;
import com.hcl.bb.model.RequestBlood;

public interface AdminDao 
{
	public boolean validateAdmin(Admin admin) throws ApplicationException;
	public List<RequestBlood> getRequestList();

	
}