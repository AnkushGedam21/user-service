package com.ct.user.service;

import java.util.List;

import com.ct.user.model.Staff;

public interface StaffService {

	Staff save(Staff staff);

	List<Staff> getAllStaffDetails();

	Staff getStaff(long id);

	Staff updateStaff(long id, Staff updatedStaff);

	void disableStaff(long id);

}
