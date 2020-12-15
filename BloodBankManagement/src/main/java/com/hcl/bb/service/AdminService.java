package com.hcl.bb.service;

import com.hcl.bb.appexception.ApplicationException;
import com.hcl.bb.model.Admin;

public interface AdminService {

	public boolean validateAdmin(Admin admin) throws ApplicationException;
}