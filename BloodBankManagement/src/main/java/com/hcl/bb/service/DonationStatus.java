package com.hcl.bb.service;

import java.util.List;

import com.hcl.bb.model.DonateBlood;
import com.hcl.bb.model.User;

public interface DonationStatus {

	public List<DonateBlood> getDonationList(User user);
}
