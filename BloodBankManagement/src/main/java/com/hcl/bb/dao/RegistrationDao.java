package com.hcl.bb.dao;

import com.hcl.bb.appexception.ApplicationException;
import com.hcl.bb.model.User;

public interface RegistrationDao {
	public boolean doesUserExists(User user) throws ApplicationException;
	public boolean addUser(User user);
}
