package com.hcl.bb.dao;

import com.hcl.bb.appexception.ApplicationException;
import com.hcl.bb.model.Admin;

public interface AdminDao 
{
	public boolean validateAdmin(Admin admin) throws ApplicationException;
}