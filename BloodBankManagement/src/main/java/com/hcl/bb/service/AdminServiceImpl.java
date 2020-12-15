package com.hcl.bb.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.bb.appexception.ApplicationException;
import com.hcl.bb.dao.AdminDao;
import com.hcl.bb.model.Admin;
import com.hcl.bb.model.RequestBlood;

@Service("adminService")
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminDao adminDao;
	
	public boolean validateAdmin(Admin admin) throws ApplicationException {
		return adminDao.validateAdmin(admin);
	}

	@Transactional
	public List<RequestBlood> getRequestList() {
		
		return adminDao.getRequestList();
	}

}
