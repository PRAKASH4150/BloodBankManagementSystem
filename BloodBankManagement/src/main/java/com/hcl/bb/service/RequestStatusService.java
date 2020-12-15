package com.hcl.bb.service;

import java.util.List;

import com.hcl.bb.model.RequestBlood;
import com.hcl.bb.model.User;

public interface RequestStatusService {

	public List<RequestBlood> getRequestList(User user);
}
