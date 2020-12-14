package com.hcl.bb.dao;

import com.hcl.bb.model.RequestBlood;
import com.hcl.bb.model.User;

public interface RequestBloodDao {

	public boolean addRequest(RequestBlood requestBlood,User user);
}
