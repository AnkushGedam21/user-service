package com.ct.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ct.user.model.Role;
import com.ct.user.repo.RoleRepository;

@Service
public class RolesServiceImpl implements RolesService {

	@Autowired
	private RoleRepository repository;

	@Override
	public List<Role> getAllRoles() {
		return repository.findAll();
	}
}
