package com.hcl.bb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.bb.appexception.ApplicationException;
import com.hcl.bb.dao.AdminDao;
import com.hcl.bb.model.Admin;

@Service("adminService")
public class AdminServiceImpl {

	@Autowired
	private AdminDao adminDao;
	
	public boolean validateAdmin(Admin admin) throws ApplicationException {
		return adminDao.validateAdmin(admin);
	}

}
