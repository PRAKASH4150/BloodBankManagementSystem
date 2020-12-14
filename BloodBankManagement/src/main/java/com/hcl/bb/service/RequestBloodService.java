package com.hcl.bb.service;

import com.hcl.bb.appexception.ApplicationException;
import com.hcl.bb.model.RequestBlood;
import com.hcl.bb.model.User;

public interface RequestBloodService {

	public boolean validateFields(RequestBlood requestBlood) throws ApplicationException;
	public boolean addRequest(RequestBlood requestBlood,User user);
}
